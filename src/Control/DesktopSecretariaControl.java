package Control;

import Model.Aluno;
import Model.Endereco;
import Model.Exercicio;
import Model.Funcionario;
import Model.Instrutor;
import Model.Plano;
import View.DesktopSecretaria;
import com.mysql.cj.xdevapi.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import util.Conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.Conexao;

public class DesktopSecretariaControl {

    private final DesktopSecretaria view;

    public DesktopSecretariaControl(DesktopSecretaria view) {
        this.view = view;
        //this.helper = new DesktopSecretariaHelper(view);
    }

    public Aluno cadastrarAluno() {
        String nome = view.getjTextFieldNomeAluno().getText();
        String cpf = view.getjFormattedTextFieldCPFAluno().getText();
        int idade = Integer.parseInt(view.getjTextFieldIdadeAluno().getText());
        System.out.println("KSADAPOSDK");
        String celular = view.getjTextFieldCelularAluno().getText();
        String dataMatricula = view.getjFormattedTextFieldDataMatricula().getText();
        String sexo = "";
        if (view.getjComboBoxSexoAluno().getSelectedIndex() == 1) {
            sexo = "Masculino";
        } else if (view.getjComboBoxSexoAluno().getSelectedIndex() == 2) {
            sexo = "Feminino";
        } else if (view.getjComboBoxSexoAluno().getSelectedIndex() == 3){
            sexo = "Outro";
        } else {
            
        }
        //System.out.println(sexo);
        int plano = 0;
        if (view.getjComboBoxMensalidadeAluno().getSelectedIndex() == 1) {
            plano = 1;
        } else if (view.getjComboBoxMensalidadeAluno().getSelectedIndex() == 2) {
            plano = 2;
        } else if (view.getjComboBoxMensalidadeAluno().getSelectedIndex() == 3){
            plano = 3;
        } else if (view.getjComboBoxMensalidadeAluno().getSelectedIndex() == 0){
            
        }
        
        String instrutor = view.getjTextFieldInstrutorAluno().getText();
        
    
        Aluno novoAluno = new Aluno(nome,cpf,celular,plano,sexo,idade,dataMatricula,instrutor);
        return novoAluno;
 
    }
    
    public Instrutor cadastrarInstrutor(){
        String nome = view.getjTextFieldNomeInstrutor().getText();
        String cpf = view.getjFormattedTextFieldCPFInstrutor().getText();
        int idade = Integer.parseInt(view.getjTextFieldIdadeInstrutor().getText());
        String endereco = view.getjTextFieldEnderecoInstrutor().getText();
        String bairro = view.getjTextFieldBairroInstrutor().getText();
        String cidade = view.getjTextFieldCidadeInstrutor().getText();
        String uf = view.getjTextFieldUFInstrutor().getText();
        String cep = view.getjFormattedTextFieldCEPInstrutor().getText();
        String celular = view.getjTextFieldCelularInstrutor().getText();
        int salario = Integer.parseInt(view.getjTextFieldSalarioInstrutor().getText());
        String dataInicio = view.getjFormattedTextFieldDataContratoInicial().getText();
        String sexo = "";
        if (view.getjComboBoxSexoInstrutor().getSelectedIndex() == 1) {
            sexo = "Masculino";
        } else if (view.getjComboBoxSexoInstrutor().getSelectedIndex() == 2) {
            sexo = "Feminino";
        } else if(view.getjComboBoxSexoInstrutor().getSelectedIndex() == 3){
            sexo = "Outro";
        } else{
          
        }
        String user = view.getjTextField17().getText();
        String senha = view.getjTextField15().getText();
        
        System.out.println(senha);
        
        
        Instrutor novoInstrutor = new Instrutor(nome,cpf,idade,celular,salario,dataInicio,sexo,user,senha);
        System.out.println(novoInstrutor.getSenha());
        return novoInstrutor;
    }
    

    public void inserirAluno(Aluno aluno){
        boolean retorno = false;
        Conexao c = new Conexao();
       // String sql = "insert into livro (titulo, autor, npaginas) values ('"+livro.getTitulo()+"','"+livro.getAutor()+"',"+livro.getnPaginas()+")";
       String sql = "insert into aluno (idade, nome, sexo, celular, dataMatricula, id_plano, id_endereco) values (?,?,?,?,?,?,?)";
       try{
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            sentenca.setInt(1, aluno.getIdade());
            sentenca.setString(2, aluno.getNome());
            sentenca.setString(3, aluno.getSexo());
            sentenca.setString(4, aluno.getCelular());
            sentenca.setString(5, aluno.getDataMatricula());
            sentenca.setInt(6, aluno.getPlano());
            sentenca.setInt(7, aluno.getIdEndereco());
            //execute retorna false quando a sentença funciona corretamente.
            if(!sentenca.execute())
                retorno = true;
            c.desconectar();
       }catch(SQLException erro){
           System.out.println("Erro na sentença: "+ erro.getMessage());
       }
    }

    //jtextField.getText().length() < 10
    
    public boolean isEmptyInstrutor(){
        if((view.getjTextFieldNomeInstrutor().getText().equals("")) ||
           //(view.getjFormattedTextFieldCPFInstrutor().getText().length() < 2 )    ||
           (view.getjTextFieldEnderecoInstrutor().getText().equals("")) ||
           (view.getjTextFieldBairroInstrutor().getText().equals("")) ||
           (view.getjTextFieldCidadeInstrutor().getText().equals(""))     ||
           (view.getjTextFieldIdadeInstrutor().getText().equals("")) ||
           (view.getjTextFieldUFInstrutor().getText().equals(""))   ||
           //(view.getjFormattedTextFieldCEPInstrutor().getText().equals(""))   ||     
           (view.getjFormattedTextFieldCEPInstrutor().getText().equals(""))   ||
           (view.getjTextFieldCelularInstrutor().getText().equals(""))     ||
           //(view.getjFormattedTextFieldDataContratoInicial().getText().length() < 8) ||
           (view.getjComboBoxSexoInstrutor().getSelectedIndex()==0) ||
           (view.getjTextField17().getText().equals("")) ||
           (view.getjTextField15().getText().equals(""))
           ){
           
            return true;
            
        } else{
            return false;
        }
  
    }
    
    public boolean isEmptyAluno(){
        if((view.getjTextFieldNomeAluno().getText().equals("")) ||
           //(view.getjFormattedTextFieldCPFAluno().getText().length() < 14 )    ||
           //(view.getjFormattedTextFieldIdadeAluno().getText().length() < 1 ) || 
           (view.getjTextFieldEnderecoAluno().getText().equals("")) ||
           (view.getjTextFieldBairroAluno().getText().equals(""))     ||
           (view.getjTextFieldCidadeAluno().getText().equals("")) ||
           (view.getjTextFieldUFAluno().getText().equals(""))   ||
           (view.getjFormattedTextFieldCEPAluno().getText().equals(""))   ||
           (view.getjTextFieldCelularAluno().getText().equals(""))     ||
           //(view.getjFormattedTextFieldDataMatricula().getText().length() < 8) ||
           (view.getjComboBoxSexoAluno().getSelectedIndex()==0) ||
           (view.getjComboBoxMensalidadeAluno().getSelectedIndex()==0) ||
           (view.getjTextFieldInstrutorAluno().getText().equals(""))
           ){
           
            return true;
            
        } else{
            return false;
        }
    }
    
    public void clearAluno(){
        view.getjTextFieldNomeAluno().setText("");
        view.getjFormattedTextFieldCPFAluno().setText("");
        view.getjTextFieldIdadeAluno().setText("");
        view.getjTextFieldEnderecoAluno().setText("");
        view.getjTextFieldBairroAluno().setText("");
        view.getjTextFieldCidadeAluno().setText("");
        view.getjTextFieldUFAluno().setText("");
        view.getjFormattedTextFieldCEPAluno().setText("");
        view.getjTextFieldCelularAluno().setText("");
        //(view.getjFormattedTextFieldDataMatricula().getText().length() < 8) ||
        view.getjComboBoxSexoAluno().setSelectedIndex(0);
        view.getjComboBoxMensalidadeAluno().setSelectedIndex(0);
        view.getjTextFieldInstrutorAluno().setText("");
    }
    
    public void clearInstrutor(){
           view.getjTextFieldNomeInstrutor().setText("");
           view.getjFormattedTextFieldCPFInstrutor().setText("");
           view.getjTextFieldEnderecoInstrutor().setText("");
           view.getjTextFieldBairroInstrutor().setText("");
           view.getjTextFieldCidadeInstrutor().setText("");
           view.getjTextFieldIdadeInstrutor().setText("");
           view.getjTextFieldUFInstrutor().setText("");
           //(view.getjFormattedTextFieldCEPInstrutor().getText().equals(""))   ||     
           view.getjFormattedTextFieldCEPInstrutor().setText("");
           view.getjTextFieldCelularInstrutor().setText("");
           view.getjFormattedTextFieldDataContratoInicial().setText("");
           view.getjComboBoxSexoInstrutor().setSelectedIndex(0);
           view.getjTextField17().setText("");
           view.getjTextField15().setText("");
        
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

    /*public boolean inserirInstrutor(Instrutor instrutor) {
        boolean retorno = false;
        Conexao c = new Conexao();
       // String sql = "insert into livro (titulo, autor, npaginas) values ('"+livro.getTitulo()+"','"+livro.getAutor()+"',"+livro.getnPaginas()+")";
       String sql = "insert into funcionario (idade, nome, cpf, cargo, sexo, celular, dataInicio, salario, usuario, senha, id_caixa, id_aluno,nivelAcesso,id_Endereco) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
       try{
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            sentenca.setInt(1, instrutor.getIdade());
            sentenca.setString(2, instrutor.getNome());
            sentenca.setString(3, instrutor.getCPF());
            sentenca.setString(4, "Instrutor");
            sentenca.setString(5, instrutor.getSexo());
            sentenca.setString(6, instrutor.getCelular());
            sentenca.setString(7, instrutor.getDataInicio());
            sentenca.setInt(8, instrutor.getSalario());
            sentenca.setString(9, instrutor.getUsuario());
            sentenca.setString(10, instrutor.getSenha());
            sentenca.setInt(11, instrutor.getIdCaixa());
            sentenca.setInt(12, instrutor.getIdAluno());
            sentenca.setInt(13, instrutor.getNivelAcesso());
            sentenca.setString(14, "(LAST_INSERT_ID())");
            
            String sql2 = "COMMIT;";
            PreparedStatement sentenca2 = c.con.prepareStatement(sql2);
            String sql3 = "SET AUTOCOMMIT=1;";
            PreparedStatement sentenca3 = c.con.prepareStatement(sql3);
            
            //execute retorna false quando a sentença funciona corretamente.
            if(!sentenca.execute() && !sentenca3.execute() && !sentenca2.execute())
                retorno = true;
            c.desconectar();
       }catch(SQLException erro){
           System.out.println("Erro na sentença: "+ erro.getMessage());
       }
        return retorno;
    }
    */
    
    
    public void preencherPlanos() {
       view.getjComboBoxMensalidadeAluno().removeAllItems();
       ArrayList<Plano> lista = new ArrayList<Plano>();
       Conexao c = new Conexao();
       // String sql = "insert into livro (titulo, autor, npaginas) values ('"+livro.getTitulo()+"','"+livro.getAutor()+"',"+livro.getnPaginas()+")";
       String sql = "select * from plano";
       try{
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            ResultSet rs = sentenca.executeQuery();
            while(rs.next()){
                //Plano retorno = new Plano();
                //retorno.setId(rs.getInt("id"));
                //retorno.setNome(rs.getString("nome"));
                //retorno.setValor(rs.getInt("valor"));
                //lista.add(retorno);
                view.getjComboBoxMensalidadeAluno().addItem(rs.getString("nome"));
            }
            c.desconectar();
        }catch(SQLException erro){
           System.out.println("Erro na sentença: "+ erro.getMessage());
        }
        //return lista;
    }
    
    public void preencherInstrutores(){
       ArrayList<Plano> lista = new ArrayList<Plano>();
       Conexao c = new Conexao();
       // String sql = "insert into livro (titulo, autor, npaginas) values ('"+livro.getTitulo()+"','"+livro.getAutor()+"',"+livro.getnPaginas()+")";
       String sql = "select * from funcionario where cargo = Instrutor";
       try{
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            ResultSet rs = sentenca.executeQuery();
            while(rs.next()){
                //Plano retorno = new Plano();
                //retorno.setId(rs.getInt("id"));
                //retorno.setNome(rs.getString("nome"));
                //retorno.setValor(rs.getInt("valor"));
                //lista.add(retorno);
                view.getjComboBoxMensalidadeAluno().addItem(rs.getString("nome"));
            }
            c.desconectar();
        }catch(SQLException erro){
           System.out.println("Erro na sentença: "+ erro.getMessage());
        }
    }
   
   public boolean inserirTudoInstrutor(Endereco endereco){
       boolean retorno = false;
       Conexao c = new Conexao();
       //Instrutor instrutor = new Instrutor();
       Instrutor instrutor = cadastrarInstrutor();
       // String sql = "insert into livro (titulo, autor, npaginas) values ('"+livro.getTitulo()+"','"+livro.getAutor()+"',"+livro.getnPaginas()+")";
       String sql = "insert into endereco (endereco, bairro, cep, cidade, uf) values (?,?,?,?,?)";
       try{
            PreparedStatement sentenca = c.con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            sentenca.setString(1, endereco.getEndereco());
            sentenca.setString(2, endereco.getBairro());
            sentenca.setString(3, endereco.getCEP());
            sentenca.setString(4, endereco.getCidade());
            sentenca.setString(5, endereco.getUF());
            sentenca.execute();
            //execute retorna false quando a sentença funciona corretamente.
            //if(!sentenca.execute())
            //    retorno = true;
            try (ResultSet rs = sentenca.getGeneratedKeys()) {
                    if (rs.next()) {
                        int id = rs.getInt(1);
                        instrutor.setIdEndereco(id);
                        //System.out.println(funcionario);
                    }
                inserirInstrutor(instrutor);
                
            }

            c.desconectar();
            retorno = true;
       }catch(SQLException erro){
           System.out.println("Erro na sentença: "+ erro.getMessage());
       }
        return retorno;
       
   }
   
   public Endereco cadastrarEndereco(){
        String endereco = view.getjTextFieldEnderecoInstrutor().getText();
        String bairro = view.getjTextFieldBairroInstrutor().getText();
        String cidade = view.getjTextFieldCidadeInstrutor().getText();
        String uf = view.getjTextFieldUFInstrutor().getText();
        String cep = view.getjFormattedTextFieldCEPInstrutor().getText();
 
        Endereco novoEndereco = new Endereco(endereco,bairro,cidade,uf,cep);
        return novoEndereco;
    }
   
    public Endereco cadastrarEnderecoAluno(){
        String endereco = view.getjTextFieldEnderecoAluno().getText();
        String bairro = view.getjTextFieldBairroAluno().getText();
        String cidade = view.getjTextFieldCidadeAluno().getText();
        String uf = view.getjTextFieldUFAluno1().getText();
        String cep = view.getjFormattedTextFieldCEPAluno().getText();
 
        Endereco novoEndereco = new Endereco(endereco,bairro,cidade,uf,cep);
        return novoEndereco;
    }
   
   
   /*public int resgatarID(){
        int retorno = 0;
        Conexao c = new Conexao();
        String sql = "SELECT LAST_INSERT_ID()";
        try{
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            ResultSet rs = sentenca.executeQuery();
            retorno = rs.getInt(")
            c.desconectar();
            return retorno;
        }catch(SQLException erro){
            System.out.println("Erro na sentença: "+ erro.getMessage());
        }
       return retorno;
   }
   */
   public void inserirInstrutor(Instrutor instrutor) {
       boolean retorno = false;
       Conexao c = new Conexao();
       // String sql = "insert into livro (titulo, autor, npaginas) values ('"+livro.getTitulo()+"','"+livro.getAutor()+"',"+livro.getnPaginas()+")";
       String sql = "insert into funcionario (idade, nome, cpf, cargo, sexo, celular, dataInicio, salario, usuario, senha, nivelAcesso,id_Endereco) values (?,?,?,?,?,?,?,?,?,?,?,?)";
       try{
            
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            sentenca.setInt(1, instrutor.getIdade());
            sentenca.setString(2, instrutor.getNome());
            sentenca.setString(3, instrutor.getCPF());
            sentenca.setString(4, "Instrutor");
            sentenca.setString(5, instrutor.getSexo());
            sentenca.setString(6, instrutor.getCelular());
            sentenca.setString(7, instrutor.getDataInicio());
            sentenca.setInt(8, instrutor.getSalario());
            sentenca.setString(9, instrutor.getUsuario());
            sentenca.setString(10, instrutor.getSenha());
            sentenca.setInt(11, instrutor.getNivelAcesso());
            sentenca.setInt(12, instrutor.getIdEndereco());
                     
            //execute retorna false quando a sentença funciona corretamente.
            sentenca.executeUpdate();
            ResultSet keys = sentenca.getGeneratedKeys();
            
            c.desconectar();
       }catch(SQLException erro){
           System.out.println("Erro na sentença: "+ erro.getMessage());
       }
        //return retorno;
    }
   
   
   public boolean inserirTudoAluno(Endereco endereco){
       boolean retorno = false;
       Conexao c = new Conexao();
       //Instrutor instrutor = new Instrutor();
       Aluno aluno = cadastrarAluno();
       // String sql = "insert into livro (titulo, autor, npaginas) values ('"+livro.getTitulo()+"','"+livro.getAutor()+"',"+livro.getnPaginas()+")";
       String sql = "insert into endereco (endereco, bairro, cep, cidade, uf) values (?,?,?,?,?)";
       try{
            PreparedStatement sentenca = c.con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            sentenca.setString(1, endereco.getEndereco());
            sentenca.setString(2, endereco.getBairro());
            sentenca.setString(3, endereco.getCEP());
            sentenca.setString(4, endereco.getCidade());
            sentenca.setString(5, endereco.getUF());
            sentenca.execute();
            //execute retorna false quando a sentença funciona corretamente.
            //if(!sentenca.execute())
            //    retorno = true;
            try (ResultSet rs = sentenca.getGeneratedKeys()) {
                    if (rs.next()) {
                        int id = rs.getInt(1);
                        aluno.setIdEndereco(id);
                        //System.out.println(funcionario);
                    }
                inserirAluno(aluno);
            }

            c.desconectar();
            retorno = true;
       }catch(SQLException erro){
           System.out.println("Erro na sentença: "+ erro.getMessage());
       }
        return retorno;
        
       
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
                aluno.setIdMatricula(rs.getInt("idMatricula"));
                aluno.setIdade(rs.getInt("idade"));
                aluno.setSexo(rs.getString("sexo"));
                aluno.setCelular(rs.getString("celular"));
                aluno.setDataMatricula(rs.getString("dataMatricula"));
                lista.add(aluno);
            }
            c.desconectar();
        }catch(SQLException erro){
            System.out.println("Erro na sentença: "+ erro.getMessage());
        }
        return lista;
    }
   
   public ArrayList<Instrutor> selecionarTodosInstrutores(){
        ArrayList<Instrutor> lista = new ArrayList<>();
        Conexao c = new Conexao();
        String sql = "select * from funcionario where cargo = 'Instrutor'";
        try{
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            ResultSet rs = sentenca.executeQuery();
            while(rs.next()){
                Instrutor instrutor = new Instrutor();
                instrutor.setNome(rs.getString("nome"));
                instrutor.setSalario(rs.getInt("salario"));
                instrutor.setIdade(rs.getInt("idade"));
                instrutor.setSexo(rs.getString("sexo"));
                instrutor.setCelular(rs.getString("celular"));
                instrutor.setDataInicio(rs.getString("dataInicio"));
                lista.add(instrutor);
            }
            c.desconectar();
        }catch(SQLException erro){
            System.out.println("Erro na sentença: "+ erro.getMessage());
        }
        return lista;
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
    
    
    public Instrutor selecionarInstrutor(){
        Instrutor instrutor = new Instrutor();
        Conexao c = new Conexao();
        System.out.println("HERE");
        String nome = view.getjTextFieldBuscaInstrutor().getText();
        System.out.println(nome);
        String sql = "select * from funcionario where cargo = 'Instrutor' and nome = ?";
        try{
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            sentenca.setString(1, nome);
            ResultSet rs = sentenca.executeQuery();
            if(rs.next()){
                instrutor.setNome(rs.getString("nome"));
                instrutor.setSalario(rs.getInt("salario"));
                instrutor.setIdade(rs.getInt("idade"));
                instrutor.setSexo(rs.getString("sexo"));
                instrutor.setCelular(rs.getString("celular"));
                instrutor.setDataInicio(rs.getString("dataInicio"));
            }
            c.desconectar();
        }catch(SQLException erro){
            System.out.println("Erro na sentença: "+ erro.getMessage());
        }
        return instrutor;
    }
    
    
    public int recuperaLASTID(){
        int retorno = 1231;
        System.out.println("STEP1");
        Conexao c = new Conexao();
        String sql = "select LAST_INSERT_ID()";
        try{
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            ResultSet rs = sentenca.executeQuery();
            System.out.println("STEP2");
            while(rs.next()){
                System.out.println("STEP3");
                retorno = rs.getInt(1);
                return retorno;
            }
            c.desconectar();
        }catch(SQLException erro){
            System.out.println("Erro na sentença: "+ erro.getMessage());
        }
        System.out.println("STEP4");
        return retorno;
    }
   
   
}
    
