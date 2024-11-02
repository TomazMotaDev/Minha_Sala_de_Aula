package com.minha_sala_de_aula.Professor;

import com.minha_sala_de_aula.Persistencia.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import java.util.List;

public class ProfessorJPA {
    
    public Professor consultaProf(){
        
        EntityManager entidade = JPAUtil.getEntityManager();
        
        Professor professor;
        
        try{
            Query consulta = entidade.createQuery("SELECT p FROM Professor p");
            professor = (Professor) consulta.getSingleResult();
        }catch (NoResultException e){ 
            professor = null;
        }finally{
            JPAUtil.closeEtityManager();
        }
        return professor;
    }
     
    public void cadastrar(Professor professor){
        EntityManager entidade = JPAUtil.getEntityManager();
        
        try{
            entidade.getTransaction().begin();
            entidade.persist(professor);
            entidade.getTransaction().commit();
            
        }catch (Exception e){
            entidade.getTransaction().rollback();
            throw e;
        }finally {
            JPAUtil.closeEtityManager();
        }
        
    }
    
    public void editar(Professor profEdit){
        EntityManager entidade = JPAUtil.getEntityManager();
        try {
            entidade.getTransaction().begin();
            entidade.merge(profEdit);
            entidade.getTransaction().commit();
        }catch(Exception e){
            entidade.getTransaction().rollback();
            throw e;
        }
        finally{
            JPAUtil.closeEtityManager();
        }
    }
}
