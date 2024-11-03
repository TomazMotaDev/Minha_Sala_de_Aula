package com.minha_sala_de_aula.Turmas;

import com.minha_sala_de_aula.Persistencia.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import javax.swing.JOptionPane;

/**
 *  Classe para o cadastro, edição e remoção do endereço de uma turma.
 *  Será utilizada após a criação da turma a qual faz referência
 *  caso a turma seja com aulas presenciais. 
 */

public class EnderecoJPA {
    
    /*
    * Método para consultar o endereço de uma turma. Lembrando que o endereço
    * é mais para turmas que são presenciais. Caso seja online, fica como opcional.
    */
    
    public Endereco consultaEndereco(){
        EntityManager entidade = JPAUtil.getEntityManager();
        
        Endereco endereco = new Endereco();

         try{
                Query consulta = entidade.createQuery("SELECT e FROM Endereco e");
                endereco = (Endereco) consulta.getSingleResult();
                
            }catch (NoResultException e){ 
                endereco = null;
            }finally{
                JPAUtil.closeEtityManager();
            }
            return endereco;
    }
    
    /*
    * O cadastro do endereço será obrigatório para turmas presenciais.
    */
    
    public void cadastrar(Endereco cadEndereco){
        EntityManager entidade = JPAUtil.getEntityManager();
        
        try{
            entidade.getTransaction().begin();
            entidade.persist(cadEndereco);
            entidade.getTransaction().commit();
            
            JOptionPane.showMessageDialog(null, "Endereço cadastrado com sucesso.");
            
        }catch (Exception e){
            entidade.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Não foi possível fazer o cadastro do endereço");
            throw e;            
        }finally {
            JPAUtil.closeEtityManager();
        }        
    }
    
    /*
    * Caso seja necessário editar um endereço ou atualizar porque o aluno se mudou,
    * o professor poderá editar o endereço cadastrado.
    */
    
    public void editar(Endereco editEndereco){
        EntityManager entidade = JPAUtil.getEntityManager();
        try {
            entidade.getTransaction().begin();
            entidade.merge(editEndereco);
            entidade.getTransaction().commit();
            
            JOptionPane.showMessageDialog(null, "Edição do endereço feita com sucesso.");
        }catch(Exception e){
            entidade.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Não foi possível fazer a edição do endereço.");
            throw e;
        }
        finally{
            JPAUtil.closeEtityManager();
        }
    }
    
    public void deletar(int formID){
        EntityManager entidade = JPAUtil.getEntityManager();
        Endereco delEndereco = entidade.find(Endereco.class, formID);
        
        delEndereco.setAtividade("inativo");
        
        try{
            entidade.getTransaction().begin();
            entidade.remove(delEndereco);
            entidade.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Exclusão feita com sucesso");
          
        }catch(Exception e){
            entidade.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o Endereço.");
            throw e;
        
        }finally{
            JPAUtil.closeEtityManager();
        }
    }
}
