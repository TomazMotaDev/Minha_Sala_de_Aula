package com.minha_sala_de_aula.Professor;

import com.minha_sala_de_aula.Persistencia.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class PacoteDeAulaJPA {
    
    public List<PacoteDeAula> listaPacotes(){
        EntityManager entidade = JPAUtil.getEntityManager();
        List<PacoteDeAula> listaPacotes = new ArrayList<>();
        
        try{
            Query consulta = entidade.createQuery("SELECT p FROM PacoteDeAula p WHERE p.atividade = 'ativo'");
            listaPacotes = consulta.getResultList();
        }catch (NoResultException e){ 
            listaPacotes = null;
        }finally{
            JPAUtil.closeEtityManager();
        }
        return listaPacotes;
    }
    
    public void cadastrar(PacoteDeAula pacote){
        EntityManager entidade = JPAUtil.getEntityManager();
        
        try{
            entidade.getTransaction().begin();
            entidade.persist(pacote);
            entidade.getTransaction().commit();
            
        }catch (Exception e){
            entidade.getTransaction().rollback();
            throw e;
        }finally {
            JPAUtil.closeEtityManager();
        }
        
    }
    public PacoteDeAula consultaPacoteSelecionada(String nome, String tipo, String perfil, String duracaoPacote, String recorrenciaSemanal, String valor){
        EntityManager entidade = JPAUtil.getEntityManager();
        PacoteDeAula pacote = null;
        
        try{
            Query consulta = entidade.createQuery("SELECT p FROM PacoteDeAula p WHERE p.infoPacote.nome = :nome AND p.infoPacote.tipo = :tipo AND p.infoPacote.perfil = :perfil AND p.duracaoPacote = :duracaoPacote AND p.recorrenciaSemanal = :recorrenciaSemanal AND p.valor = :valor AND p.atividade = 'ativo'");
            consulta.setParameter("nome", nome);
            consulta.setParameter("tipo", tipo);
            consulta.setParameter("perfil", perfil);
            consulta.setParameter("duracaoPacote", duracaoPacote);
            consulta.setParameter("recorrenciaSemanal", recorrenciaSemanal);
            consulta.setParameter("valor", valor);
            pacote = (PacoteDeAula) consulta.getSingleResult();
            
        }finally{
            JPAUtil.closeEtityManager();
        }
        return pacote;
    }
    
    public void editar(PacoteDeAula pacoteEdit){
        EntityManager entidade = JPAUtil.getEntityManager();
        try {
            entidade.getTransaction().begin();
            entidade.merge(pacoteEdit);
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
