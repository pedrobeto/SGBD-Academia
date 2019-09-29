package Model;

import java.util.ArrayList;
import java.util.Date;

public class Instrutor extends Funcionario {
    
    private int idAluno;
    private int idCaixa; 
    private int idEndereco;
    public ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    
    public Instrutor(){
        
    }

    public Instrutor(String nome, String cpf, int idade, String celular, int salario, String dataInicio, String sexo, String user, String senha) {
        this.setNome(nome);
        this.setCPF(cpf);
        this.setIdade(idade);
        this.setCelular(celular);
        this.setSalario(salario);
        this.setDataInicio(dataInicio);
        this.setSexo(sexo);
        this.setUsuario(user);
        this.setSenha(senha);
        this.setNivelAcesso(2);
    }


    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdCaixa() {
        return idCaixa;
    }

    public void setIdCaixa(int idCaixa) {
        this.idCaixa = idCaixa;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    
    

 
    
}
