package com.minha_sala_de_aula.Professor;

import com.minha_sala_de_aula.Persistencia.JPAUtil;
import jakarta.persistence.EntityManager;

public class ApresentacaoJPA {
    private EntityManager entidade = JPAUtil.getEntityManager();
    
    public void cadastrar(Apresentacao apresentacao){
        
        try{
            entidade.getTransaction().begin();
            entidade.persist(apresentacao);
            entidade.getTransaction().commit();
            
        }catch (Exception e){
            entidade.getTransaction().rollback();
            throw e;
        }finally {
            JPAUtil.closeEtityManager();
        }
        
    }
}
