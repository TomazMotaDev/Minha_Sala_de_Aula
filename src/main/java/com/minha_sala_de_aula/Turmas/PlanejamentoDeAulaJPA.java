package com.minha_sala_de_aula.Turmas;

import com.minha_sala_de_aula.Persistencia.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *  Classe responsavel pela conexão com a Tabela PlanejamentoDeAula.
 *  Aqui ficarão todos os métodos para cadastro, edição e exclusão de
 *  um planejamento de aula. É necessário ter uma aula cadastrada.
 * 
 */
public class PlanejamentoDeAulaJPA {
      
    /*
    * A consulta de um planejamento deverá ser pelo id da aula tendo em
    * vista que cada aula só poderá ter um planejamento.
    * Será usado na aba de calendário em que mostra as aulas do dia.
    * Ao clicar no planejamento da aula em um determinado horário,
    * o professor poderá visualizar o planejamento da aula em questão.
    */
        
    public PlanejamentoDeAula consultaPlanejamento(int idAula){
        EntityManager entidade = JPAUtil.getEntityManager();
        
        PlanejamentoDeAula planejamento = new PlanejamentoDeAula();

         try{
                Query consulta = entidade.createQuery("SELECT p FROM PlanejamentoDeAula p WHERE p.atividade = 'ativo' AND p.aula.id = :idAula");
                consulta.setParameter("idAula", idAula);
                planejamento = (PlanejamentoDeAula) consulta.getSingleResult();
                
            }catch (NoResultException e){ 
                planejamento = null;
            }finally{
                JPAUtil.closeEtityManager();
            }
            return planejamento;
    }
    
    public void cadastrar(PlanejamentoDeAula cadPlanejamento){
        EntityManager entidade = JPAUtil.getEntityManager();
        
        try{
            entidade.getTransaction().begin();
            entidade.persist(cadPlanejamento);
            entidade.getTransaction().commit();
            
            JOptionPane.showMessageDialog(null, "Cadastro do planejamento feito com sucesso.");
            
        }catch (Exception e){
            entidade.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Não foi possível realizar o cadastro do planejamento. Erro ao conectar com o banco de dados.");
            throw e;            
        }finally {
            JPAUtil.closeEtityManager();
        }        
    }
    
    /*
    * O professor poderá editar um planejamento caso queira mudar algo. Na aba
    * da turma, na seção de aulas, ele poderá editar o planjamento caso já
    * esteja cadastrado.
    */
    
    public void editar(PlanejamentoDeAula editPlanejamento){
        EntityManager entidade = JPAUtil.getEntityManager();
        try {
            entidade.getTransaction().begin();
            entidade.merge(editPlanejamento);
            entidade.getTransaction().commit();
            
            JOptionPane.showMessageDialog(null, "Edição do planejamento feito com sucesso.");
        }catch(Exception e){
            entidade.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar a edição do planejamento.");
            throw e;
        }
        finally{
            JPAUtil.closeEtityManager();
        }
    }
    
    public void deletar(int formID){
        EntityManager entidade = JPAUtil.getEntityManager();
        PlanejamentoDeAula delPlanejamento = entidade.find(PlanejamentoDeAula.class, formID);
        
        delPlanejamento.setAtividade("inativo");
        
        try{
            entidade.getTransaction().begin();
            entidade.remove(delPlanejamento);
            entidade.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Exclusão do planejamento feito com sucesso");
          
        }catch(Exception e){
            entidade.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o planejamento.");
            throw e;
        
        }finally{
            JPAUtil.closeEtityManager();
        }
    }
}
