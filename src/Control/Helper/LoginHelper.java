package Control.Helper;

import Model.Funcionario;
import View.Login;

public class LoginHelper {
   
    private final Login view;
    
    public LoginHelper(Login view){
        this.view=view;
    }
        
    public Funcionario obterUser(){
        String nome = view.getjTextFieldLogin().getText();
        String senha = view.getjPasswordField().getText();
        Funcionario usuario = new Funcionario();
        usuario.setUsuario(nome);
        usuario.setSenha(senha);
        return usuario;
    } 
    
    public void setarUser(Funcionario user){
        view.getjTextFieldLogin().setText(user.getNome());
        view.getjPasswordField().setText(user.getSenha());
        
    }
    
    public void limparTela(){
        view.getjTextFieldLogin().setText("");
        view.getjPasswordField().setText("");
        
    }
    
    
}
