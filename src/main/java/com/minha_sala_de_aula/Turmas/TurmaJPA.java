package com.minha_sala_de_aula.Turmas;

import com.minha_sala_de_aula.Persistencia.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe para a conexão com o banco de dados para a tabela Turma.
 * Aqui ficarão todos os métodos para cadastro, edição e exclusão de
 * uma turma. Após cadastrar a turma, poderá cadastrar as demais informações
 * que complementam a turma como alunos, endereço, aulas e pagamentos.
 * 
 */
public class TurmaJPA {
    
    /*
    * A consulta de todas as turmas ativas será feita para a aba de Turmas.
    * Ao entrar nela o professor poderá ver todas as turmas cadastradas que possui.
    */
    
    public List<Turma> consultaTurmas(){
        EntityManager entidade = JPAUtil.getEntityManager();
        
        List<Turma> turmas = new ArrayList();

         try{
                Query consulta = entidade.createQuery("SELECT t FROM Turma t WHERE t.atividade = 'ativo'");
                turmas = consulta.getResultList();
                
            }catch (NoResultException e){ 
                turmas = null;
            }finally{
                JPAUtil.closeEtityManager();
            }
            return turmas;
    }
    
    /*
    * A consulta de uma turma será utilizada para o cadastramento de uma aula.
    * Ao selecionar uma através de seu nome, a aula será redirecionada para a turma
    * consultada através do id.
    */
    
    public Turma consultaTurma(int idTurma){
        EntityManager entidade = JPAUtil.getEntityManager();
        
        Turma turma = new Turma();

         try{
                Query consulta = entidade.createQuery("SELECT t FROM Turma t WHERE t.atividade = 'ativo' AND t.id = :idTurma");
                consulta.setParameter("idTurma", idTurma);
                turma = (Turma) consulta.getSingleResult();
                
            }catch (NoResultException e){ 
                turma = null;
            }finally{
                JPAUtil.closeEtityManager();
            }
            return turma;
    }
    
    /*
    * É importante que o professor não possa cadastrar uma turma com o mesmo nome.
    * Sempre com nomes diferentes. No formulário de cadastro de uma turma deverá
    * constar um aviso de que o nome deve ser diferente.
    */
    
    public void cadastrar(Turma cadTurma){
        EntityManager entidade = JPAUtil.getEntityManager();
        
        try{
            entidade.getTransaction().begin();
            entidade.persist(cadTurma);
            entidade.getTransaction().commit();
            
            JOptionPane.showMessageDialog(null, "Cadastro da turma feito com sucesso.");
            
        }catch (Exception e){
            entidade.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Não foi possível realizar o cadastro. Erro ao conectar com o banco de dados.");
            throw e;            
        }finally {
            JPAUtil.closeEtityManager();
        }        
    }
    
    public void editar(Turma editTurma){
        EntityManager entidade = JPAUtil.getEntityManager();
        try {
            entidade.getTransaction().begin();
            entidade.merge(editTurma);
            entidade.getTransaction().commit();
            
            JOptionPane.showMessageDialog(null, "Edição da turma feita com sucesso.");
        }catch(Exception e){
            entidade.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar a edição da turma.");
            throw e;
        }
        finally{
            JPAUtil.closeEtityManager();
        }
    }
    
    public void deletar(int formID){
        EntityManager entidade = JPAUtil.getEntityManager();
        Turma delTurma = entidade.find(Turma.class, formID);
        
        delTurma.setAtividade("inativo");
        
        try{
            entidade.getTransaction().begin();
            entidade.remove(delTurma);
            entidade.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Exclusão da turma feita com sucesso");
          
        }catch(Exception e){
            entidade.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Não foi possível excluir a turma.");
            throw e;
        
        }finally{
            JPAUtil.closeEtityManager();
        }
    }
}
