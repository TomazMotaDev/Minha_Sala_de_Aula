package com.minha_sala_de_aula.Professor;

import com.minha_sala_de_aula.Persistencia.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import javax.swing.JOptionPane;

public class FormacaoJPA {
    
    public void cadastrar(Formacao formacao){
        EntityManager entidade = JPAUtil.getEntityManager();
        try{
            entidade.getTransaction().begin();
            entidade.persist(formacao);
            entidade.getTransaction().commit();
            
        }catch (Exception e){
            entidade.getTransaction().rollback();
            throw e;
        }finally {
            JPAUtil.closeEtityManager();
        }
        
    }
    
    public Formacao consultaFormacaoSelecionada(String escolaridade, String instituicao, String curso, String inicio, String termino){
        EntityManager entidade = JPAUtil.getEntityManager();
        Formacao formacao = null;
        
        try{
            Query consulta = entidade.createQuery("SELECT f FROM Formacao f WHERE f.escolaridade = :escolaridade AND f.instituicao = :instituicao AND f.curso = :curso AND f.anoInicio = :inicio AND f.anoFinal = :termino");
            consulta.setParameter("escolaridade", escolaridade);
            consulta.setParameter("instituicao", instituicao);
            consulta.setParameter("curso", curso);
            consulta.setParameter("inicio", inicio);
            consulta.setParameter("termino", termino);
            formacao = (Formacao) consulta.getSingleResult();
        }finally{
            JPAUtil.closeEtityManager();
        }
        return formacao;
    }
    
    public void deletar(int formID){
        EntityManager entidade = JPAUtil.getEntityManager();
        Formacao formacao = entidade.find(Formacao.class, formID);
        
        try{
            entidade.getTransaction().begin();
            entidade.remove(formacao);
            entidade.getTransaction().commit();
          
        }catch(Exception e){
            entidade.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro: "+ e.getMessage());
            throw e;
        
        }finally{
            JPAUtil.closeEtityManager();
        }
    }
    
    public void editar(Formacao formEdit){
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(formEdit);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            throw e;
        }
        finally{
            JPAUtil.closeEtityManager();
        }
    } 
}
