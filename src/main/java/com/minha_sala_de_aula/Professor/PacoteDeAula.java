package com.minha_sala_de_aula.Professor;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
public class PacoteDeAula{
    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_professor")
    private Professor id_professor;
    
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="id_info_pacote", referencedColumnName="id")
    private InfoPacote infoPacote;
    
    private byte duracaoPacote;
    private byte recorrenciaSemanal;
    private String valor;
    private String atividade;
    
    public PacoteDeAula(){
        atividade = "ativo";
    }
    
    //GETTERS AND SETTERS
    public InfoPacote getInfoPacote() {
        return infoPacote;
    }

    public void setInfoPacote(InfoPacote infoPacote) {
        this.infoPacote = infoPacote;
    }

    public byte getDuracaoPacote() {
        return duracaoPacote;
    }

    public void setDuracaoPacote(byte duracaoPacote) {
        this.duracaoPacote = duracaoPacote;
    }

    public byte getRecorrenciaSemanal() {
        return recorrenciaSemanal;
    }

    public void setRecorrenciaSemanal(byte recorreciaSemanal) {
        this.recorrenciaSemanal = recorreciaSemanal;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Professor getId_professor() {
        return id_professor;
    }

    public void setId_professor(Professor id_professor) {
        this.id_professor = id_professor;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
    
    
    
}
