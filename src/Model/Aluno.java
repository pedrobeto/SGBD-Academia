package Model;

public class Aluno {
    private int idMatricula;
    private String nome;
    private String CPF;
    private String celular;
    private String sexo;
    private int idade;
    private String dataMatricula;
    private String instrutor;
    private int plano;
    private int idTreino; 
    private int idEndereco;

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public Aluno() {
    }
    

    public Aluno(String nome, String CPF, String celular, int plano, String sexo, int idade, String dataMatricula, String instrutor) {
        this.nome = nome;
        this.CPF = CPF;
        this.celular = celular;
        this.plano = plano;
        this.sexo = sexo;
        this.idade = idade;
        this.dataMatricula = dataMatricula;
        this.instrutor = instrutor;
        this.idTreino=0;
    }

    

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }    
    
    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
    
    

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getPlano() {
        return plano;
    }

    public void setPlano(int plano) {
        this.plano = plano;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    
    public int getIdTreino() {
        return idTreino;
    }

    public void setIdTreino(int idTreino) {
        this.idTreino = idTreino;
    }

  
    
    
}
