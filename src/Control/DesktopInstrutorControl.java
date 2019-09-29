package Control;

import Model.Aluno;
import Model.Endereco;
import View.DesktopInstrutor;
import View.DesktopSecretaria;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import util.Conexao;

public class DesktopInstrutorControl {

    private final DesktopInstrutor view;
    
    public DesktopInstrutorControl(DesktopInstrutor view) {
        this.view = view;
        //this.helper = new DesktopSecretariaHelper(view);
    }
    
    public void alertaUsuario(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    public void alertaSucesso(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    public void alertaErro(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem,"Puts...", JOptionPane.ERROR_MESSAGE);
    }
    
    
    public Aluno selecionarAluno(){
        Aluno aluno = new Aluno();
        Conexao c = new Conexao();
        System.out.println("HERE");
        String nome = view.getjTextFieldBuscaAluno().getText();
        System.out.println(nome);
        String sql = "select * from aluno where nome = ?";
        try{
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            sentenca.setString(1, nome);
            ResultSet rs = sentenca.executeQuery();
            if(rs.next()){
                aluno.setNome(rs.getString("nome"));
                aluno.setIdMatricula(rs.getInt("idMatricula"));
                aluno.setIdade(rs.getInt("idade"));
                aluno.setSexo(rs.getString("sexo"));
                aluno.setCelular(rs.getString("celular"));
                aluno.setDataMatricula(rs.getString("dataMatricula"));
            }
            c.desconectar();
        }catch(SQLException erro){
            System.out.println("Erro na sentença: "+ erro.getMessage());
        }
        return aluno;
    }
    
    public ArrayList<Aluno> selecionarTodosAlunos(){
        ArrayList<Aluno> lista = new ArrayList<>();
        Conexao c = new Conexao();
        String sql = "select * from aluno";
        try{
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            ResultSet rs = sentenca.executeQuery();
            while(rs.next()){
                Aluno aluno = new Aluno();
                aluno.setNome(rs.getString("nome"));
                aluno.setIdade(rs.getInt("idade"));
                aluno.setSexo(rs.getString("sexo"));
                lista.add(aluno);
            }
            c.desconectar();
        }catch(SQLException erro){
            System.out.println("Erro na sentença: "+ erro.getMessage());
        }
        return lista;
    }
    
   
  
    
    public int cadastrarNovoTreino(){
        int id2=0;
        System.out.println("CADASTRANDO NOVO TREINO");
        Conexao c = new Conexao();
        String sql = "INSERT INTO `academiafitlife`.`treino` (`nome`) VALUES (?)";
        try{
            PreparedStatement sentenca = c.con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            sentenca.setString(1, "novoTreino");
            sentenca.execute();
            
            System.out.println("CADASTRANDO NOVO");
            
            try (ResultSet rs = sentenca.getGeneratedKeys()) {
                    if (rs.next()) {
                        id2 = rs.getInt(1);
                        System.out.println(id2);
                        System.out.println("FINALIZANDO CADASTRO");
                        return id2;
                        
                        //System.out.println(funcionario);
                    }
                    
                
            }
            
            
            c.desconectar();
        }catch(SQLException erro){
            System.out.println("Erro na sentença: "+ erro.getMessage());
        }
        return id2;
    }
    
    
    
    public int recuperarExercicio(String nomeExercicio){
        System.out.println("RECUPERANDO EXERCICIO");
        Conexao c = new Conexao();
        String sql = ("select * from exercicio where nome = '"+nomeExercicio+"'");
        try{
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            ResultSet rs = sentenca.executeQuery();
            while(rs.next()){
                int retorno = rs.getInt("id");
                System.out.println("FINALIZANDO RECUPERACAO");
                return retorno;
            }
            c.desconectar();
        }catch(SQLException erro){
            System.out.println("Erro na sentença: "+ erro.getMessage());
        }
        return 0;
    }
    
    
    
    
    
    public boolean cadastrarNovaFicha(int idTreino, int idExercicio){
       System.out.println("CADASTRANDOFICHA");
       boolean retorno = false;
       Conexao c = new Conexao();
       //Instrutor instrutor = new Instrutor();
       // String sql = "insert into livro (titulo, autor, npaginas) values ('"+livro.getTitulo()+"','"+livro.getAutor()+"',"+livro.getnPaginas()+")";
       String sql = "INSERT INTO `academiafitlife`.`ficha` (`id_treino`, `id_exercicio`, `id_aluno`) VALUES (?, ?, ?);";
       try{
            System.out.println("STILL");
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            sentenca.setInt(1, idTreino);
            sentenca.setInt(2, idExercicio);
            sentenca.setInt(3, Integer.parseInt(view.getjTextFieldMatriculaAluno().getText()));
            sentenca.execute();
            retorno = true;
/*
            try (ResultSet rs = sentenca.getGeneratedKeys()) {
                    if (rs.next()) {
                        int id = rs.getInt(1);
                        aluno.setIdEndereco(id);
                        //System.out.println(funcionario);
                    }
                inserirAluno(aluno);
            }
*/
            c.desconectar();
            retorno = true;
       }catch(SQLException erro){
           System.out.println("Erro na sentença: "+ erro.getMessage());
       }
        return retorno;
        
    }
    

    
    
}
