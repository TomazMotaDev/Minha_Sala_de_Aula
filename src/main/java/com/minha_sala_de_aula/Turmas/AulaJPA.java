package com.minha_sala_de_aula.Turmas;

import com.minha_sala_de_aula.Persistencia.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe destinada para o cadastro, edição e exclusão de uma aula.
 * Deverá ser utilizada após o cadastro de uma turma. 
 */
public class AulaJPA {
    
    /*
    * Consulta de todas as Aulas de uma turma. Será utilizado na aba de Turma
    * quando o professor selecionar uma turma em específico.
    */
    
    public List<Aula> consultaAulas(int idTurma){
        EntityManager entidade = JPAUtil.getEntityManager();
        
        List<Aula> aulas = new ArrayList();

         try{
                Query consulta = entidade.createQuery("SELECT a FROM Aula a WHERE atividade = 'ativo' AND a.turma.id = :idTurma");
                consulta.setParameter("idTurma", idTurma);
                aulas = consulta.getResultList();
                
            }catch (NoResultException e){ 
                aulas = null;
                JOptionPane.showMessageDialog(null, "Não foi possível encontrar as aulas para esta turma.");
            }finally{
                JPAUtil.closeEtityManager();
            }
            return aulas;
    }
    
    /*
    * Consulta de uma aula para que possa ser editada ou excluida.
    */
    
    public Aula consultaAula(String dataAula, String horaAula){
        EntityManager entidade = JPAUtil.getEntityManager();
        
        Aula aula = new Aula();

         try{
                Query consulta = entidade.createQuery("SELECT a FROM Aula a WHERE atividade = 'ativo' AND a.data = :dataAula AND a.horario = :horaAula");
                consulta.setParameter("dataAula", dataAula);
                consulta.setParameter("horaAula", horaAula);
                aula = (Aula) consulta.getSingleResult();
                
            }catch (NoResultException e){ 
                aula = null;
                JOptionPane.showMessageDialog(null, "Não foi possível encontrar as aulas para esta turma.");
            }finally{
                JPAUtil.closeEtityManager();
            }
            return aula;
    }
    
    /*
    * O professor poderá cadastrar mais de uma aula para uma turma na aba de Turma.
    * Deverá selecionar a turma e posteriormente adicionar uma aula nova no devido campo.
    */
    
    public void cadastrar(Aula cadAula){
        EntityManager entidade = JPAUtil.getEntityManager();
        
        try{
            entidade.getTransaction().begin();
            entidade.persist(cadAula);
            entidade.getTransaction().commit();
            
            JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso.");
            
        }catch (Exception e){
            entidade.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Não foi poddível realizar o cadastro. Erro ao conectar com o banco de dados.");
            throw e;            
        }finally {
            JPAUtil.closeEtityManager();
        }        
    }
    
    /*
    * Caso o professor deseje editar informações de uma aula específica.
    */
    
    public void editar(Aula editAula){
        EntityManager entidade = JPAUtil.getEntityManager();
        try {
            entidade.getTransaction().begin();
            entidade.merge(editAula);
            entidade.getTransaction().commit();
            
            JOptionPane.showMessageDialog(null, "Edição da aula feita com sucesso.");
        }catch(Exception e){
            entidade.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar a edição da aula.");
            throw e;
        }
        finally{
            JPAUtil.closeEtityManager();
        }
    }
    
    /*
    * O professor poderá deletar uma aula. Não será excluida do baco de dados,
    * apenas mudará para a atividade para inativo.
    */
    
    public void deletar(int formID){
        EntityManager entidade = JPAUtil.getEntityManager();
        Aula delAula = entidade.find(Aula.class, formID);
        
        delAula.setAtividade("inativo");
        
        try{
            entidade.getTransaction().begin();
            entidade.remove(delAula);
            entidade.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Exclusão da aula feita com sucesso");
          
        }catch(Exception e){
            entidade.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Não foi possível excluir a Aula.");
            throw e;
        
        }finally{
            JPAUtil.closeEtityManager();
        }
    }
}
