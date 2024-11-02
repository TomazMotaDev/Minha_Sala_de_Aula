package com.minha_sala_de_aula.Turmas;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*
*   Classe para características de uma turma.
*/
@Entity
public class InfoTurma {
    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nome;
    private String observacaoTurma;
    private int dataPrevistaPag;
    
    //GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObservacaoTurma() {
        return observacaoTurma;
    }

    public void setObservacaoTurma(String observacaoTurma) {
        this.observacaoTurma = observacaoTurma;
    }  

    public int getDataPrevistaPag() {
        return dataPrevistaPag;
    }

    public void setDataPrevistaPag(int dataPrevistaPag) {
        this.dataPrevistaPag = dataPrevistaPag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
