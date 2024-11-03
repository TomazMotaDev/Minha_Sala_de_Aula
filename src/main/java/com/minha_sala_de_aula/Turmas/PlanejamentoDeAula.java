package com.minha_sala_de_aula.Turmas;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class PlanejamentoDeAula{
    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @OneToOne(mappedBy="planejamento")
    @JoinColumn(name="id_aula", referencedColumnName="id")
    private Aula aula;
    
    private String objetivo;
    private String conteudo;
    private String metodologia;
    private String recursosDidaticos;
    private String atividade;
    
    public PlanejamentoDeAula(){
        atividade = "ativo";
    }

    //GETTERS AND SETTERS
    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getMetodologia() {
        return metodologia;
    }

    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }

    public String getRecursosDidaticos() {
        return recursosDidaticos;
    }

    public void setRecursosDidaticos(String recursosDidaticos) {
        this.recursosDidaticos = recursosDidaticos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
}
