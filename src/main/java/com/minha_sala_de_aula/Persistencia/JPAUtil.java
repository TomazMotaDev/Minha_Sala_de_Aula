package com.minha_sala_de_aula.Persistencia;

/**
 *  Classe destinada a conexão com o banco de dados via JPA
 */

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
    //constante com o nome da unidade de persistência
    private static final String PERSISTENCE_UNIT = "minha_sala_de_aula";
    
    private static EntityManager entidade;
    private static EntityManagerFactory fabricaEntidade;
    
    //criando a entidade
    public static EntityManager getEntityManager(){
        if(fabricaEntidade == null || !fabricaEntidade.isOpen()) { //nulo caso a entidade fabrica seja nula
            fabricaEntidade = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }
        
        if(entidade == null || !entidade.isOpen()) { //nulo caso o gerenciador de entidade for fechado
            entidade = fabricaEntidade.createEntityManager();
        }

        return entidade;
    }
    
    //fecha as entidades
    public static void closeEtityManager(){
        if(entidade.isOpen() && entidade != null){
            entidade.close();
            fabricaEntidade.close();
        }
    }
}

