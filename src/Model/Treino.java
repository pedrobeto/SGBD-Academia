package Model;

import java.util.ArrayList;
import java.util.Date;

public class Treino {
   
    private int id;
    private String nome;
    private String observacao;
    private Instrutor instrutor;
    private Aluno aluno;
    private Date dataInicio;
    private Date validadeEmMeses;
    public ArrayList<Exercicio> exercicios = new ArrayList<Exercicio>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getValidadeEmMeses() {
        return validadeEmMeses;
    }

    public void setValidadeEmMeses(Date validadeEmMeses) {
        this.validadeEmMeses = validadeEmMeses;
    }

    public ArrayList<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(ArrayList<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }

    
    
    
}
