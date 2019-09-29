package Control;

import Control.Helper.LoginHelper;
import Model.Funcionario;
import View.Login;
import util.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginControl {

    private final Login view;
    private LoginHelper helper;
    
    
    public LoginControl(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public int logarNoSistema(){
       Funcionario modelo = helper.obterUser();
       Funcionario usuarioAtivo = buscarUsuario(modelo);
       if(usuarioAtivo!=null){
           System.out.println(usuarioAtivo.getUsuario());
           System.out.println(usuarioAtivo.getSenha());
           System.out.println(modelo.getUsuario());
           System.out.println(modelo.getSenha());
           if(usuarioAtivo.getSenha().equals(modelo.getSenha())){
               System.out.println(usuarioAtivo.getNivelAcesso());
               if(usuarioAtivo.getNivelAcesso()==2){
                   return 2;
               } else if(usuarioAtivo.getNivelAcesso()==3){
                   return 3;
               }
           } else{
               if(modelo.getSenha().equals("")){
                    return 5;
               } else {
                    return 4;
               }
               
           }
       } else {
          return 0;
       }
       return 0;
    }
    
    public void fizTarefa(String mensagem){
        this.view.exibeMensagem(mensagem);
    }
    
    public Funcionario buscarUsuario(Funcionario usuario){
        Funcionario retorno = null;
        Conexao c = new Conexao();
        String sql = "select * from funcionario where usuario = ?";
        try{
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            sentenca.setString(1, usuario.getUsuario());
            ResultSet rs = sentenca.executeQuery();
            if(rs.next()){
                retorno = new Funcionario();
                retorno.setUsuario(rs.getString("usuario"));
                //System.out.println(retorno.getUsuario());
                retorno.setSenha(rs.getString("senha"));
                //System.out.println(retorno.getSenha());
                retorno.setNivelAcesso(rs.getInt("nivelAcesso"));
                return retorno;
            }
            c.desconectar();
        }catch(SQLException erro){
            System.out.println("Erro na sentença: "+ erro.getMessage());
        }
        return null;
    }
    
    
    
}
