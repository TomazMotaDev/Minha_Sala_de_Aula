package com.minha_sala_de_aula.Turmas;

import com.minha_sala_de_aula.Professor.PacoteDeAula;
import java.util.ArrayList;
import java.util.List;
import com.minha_sala_de_aula.Financas.Pagamento;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.OrderBy;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
public class Turma{
    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @OneToOne(cascade = CascadeType.MERGE)
    @PrimaryKeyJoinColumn
    private InfoTurma infoTurma;
    
    @OneToOne(cascade = CascadeType.MERGE)
    @PrimaryKeyJoinColumn
    
    private Endereco endereco;
    
    @OneToOne(cascade = CascadeType.MERGE)
    @PrimaryKeyJoinColumn
    private PacoteDeAula pacoteDeAula;
    
    @OneToMany(mappedBy = "turma", fetch = FetchType.EAGER)
    @OrderBy("situacaoPagamento asc")
    private List<Pagamento> pagamento = new ArrayList();
    
    @OneToMany(mappedBy = "turma", fetch = FetchType.EAGER)
    @OrderBy("nome asc")
    private List<Aluno> alunos = new ArrayList();
    
    @OneToMany(mappedBy = "turma", fetch = FetchType.EAGER)
    @OrderBy("nome asc")
    private List<Aula> aulas = new ArrayList();
    
    private String atividade;
    
    public Turma(){
        atividade = "ativo";
    }
    
    //GETTERS, SETTERS AND ADDs
    public InfoTurma getInfoTurma() {
        return infoTurma;
    }

    public void setInfoTurma(InfoTurma inforTurma) {
        this.infoTurma = inforTurma;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public PacoteDeAula getPacoteDeAula() {
        return pacoteDeAula;
    }

    public void setPacoteDeAula(PacoteDeAula pacoteDeAula) {
        this.pacoteDeAula = pacoteDeAula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public List<Pagamento> getPagamento() {
        return pagamento;
    }

    public void addPagamento(Pagamento pagamento) {
        this.pagamento.add(pagamento);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void addAlunos(Aluno aluno) {
        this.alunos.add(aluno);
    }
    
    public void setAlunos(List<Aluno> alunos){
        this.alunos = alunos;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void addAulas(Aula aula) {
        this.aulas.add(aula);
    }      

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
}
