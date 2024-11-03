package com.minha_sala_de_aula.Turmas;

import com.minha_sala_de_aula.Persistencia.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Esta classe é responsavel pela inserção, remoção e edição de alunos
 * nas turmas após a criação da turma.
 */

public class AlunoJPA {
    
    /*
    * A listagem de alunos será útil para mostrar os nomes de todos na aba
    * de turma após escolher uma turma. Ao clicar para ver todos os alunos,
    * novamente será utilizado este método para mostrar em uma tabela.
    */
    
    public List<Aluno> consultaAlunos(int idTurma){
        EntityManager entidade = JPAUtil.getEntityManager();
        
        List<Aluno> alunos = new ArrayList();

         try{
                Query consulta = entidade.createQuery("SELECT a FROM Aluno a WHERE atividade = 'ativo' AND a.turma.id = :idTurma");
                consulta.setParameter("idTurma", idTurma);
                alunos = consulta.getResultList();
                
            }catch (NoResultException e){ 
                alunos = null;
            }finally{
                JPAUtil.closeEtityManager();
            }
            return alunos;
    }
    
    /*
    * Método para cadastrar uma aluno novo. Será utilizado ao cadastrar um aluno
    * ao cadastrar uma nova turma ou na aba de Turma para cadastrar mais
    * alunos.
    */
    
    public void cadastrar(Aluno cadAluno){
        EntityManager entidade = JPAUtil.getEntityManager();
        
        try{
            entidade.getTransaction().begin();
            entidade.persist(cadAluno);
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
    * Método para editar as informações de aluno caso o professor assim deseje.
    * Aparecerá na aba de Turma na seção de alunos.
    */
    
    public void editar(Aluno editAluno){
        EntityManager entidade = JPAUtil.getEntityManager();
        try {
            entidade.getTransaction().begin();
            entidade.merge(editAluno);
            entidade.getTransaction().commit();
            
            JOptionPane.showMessageDialog(null, "Edição feita com sucesso.");
        }catch(Exception e){
            entidade.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar a edição.");
            throw e;
        }
        finally{
            JPAUtil.closeEtityManager();
        }
    }
    
    /*
    * Caso o professor deseje, poderá escluir um aluno de uma turma. Não será
    * excluido permanentemente do bando de dados. Sua atividade mudará para 
    * "inativo".
    */
    
    public void deletar(int formID){
        EntityManager entidade = JPAUtil.getEntityManager();
        Aluno delAluno = entidade.find(Aluno.class, formID);
        
        delAluno.setAtividade("inativo");
        
        try{
            entidade.getTransaction().begin();
            entidade.remove(delAluno);
            entidade.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Exclusão feita com sucesso");
          
        }catch(Exception e){
            entidade.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Não foi possível excluir.");
            throw e;
        
        }finally{
            JPAUtil.closeEtityManager();
        }
    }
}
