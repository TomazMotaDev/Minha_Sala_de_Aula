package com.minha_sala_de_aula.Professor;

/*
*   Classe para criar o professor que usará a aplicação
*   Aqui serão guardados deus dados para posteriormente a aplicação poder exportar
*   uma espécie de cartão de visita.
*/

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.OrderBy;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Professor{
    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    private String nome;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_apresentacao", referencedColumnName="id")
    private Apresentacao apresentacao;
    
    private String email;
    private String contato;
    
    @OneToMany(mappedBy = "professor", fetch = FetchType.EAGER)
    @OrderBy("anoFinal desc")
    private List<Formacao> formacoes;
    
    //CONSTRUTOR COM O NOME
    public Professor(){
        this.formacoes = new ArrayList();
    }
    
    //GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Apresentacao getApresentacao() {
        return apresentacao;
    }

    public void setApresentacao(Apresentacao apresentacao) {
        this.apresentacao = apresentacao;
        this.apresentacao.setProfessor(this);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public List<Formacao> getFormacao() {
        return formacoes;
    }

    public void addFormacao(Formacao formacao) {
        this.formacoes.add(formacao);
    }  
    
}
