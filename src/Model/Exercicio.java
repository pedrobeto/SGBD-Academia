package Model;

public class Exercicio {

    private int id;
    private String nome;
    private int repeticoes;

    public Exercicio(int id, String nome, int repeticoes) {
        this.id = id;
        this.nome = nome;
        this.repeticoes = repeticoes;
    }

    public Exercicio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String descricao) {
        this.nome = descricao;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }
    
    
    
    
}
