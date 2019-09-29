package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TimeZone;

/**
 *
 * @author Cris
 */
public class Conexao {
    public Connection con;
    
    public Conexao(){
        try{
            System.out.println("AQUI");
            Class.forName("com.mysql.cj.jdbc.Driver");
            String nomeBanco = "academiafitlife";
            String url = "jdbc:mysql://localhost/"+nomeBanco+"?useTimezone=true&serverTimezone=UTC";
            String usuario= "root";
            String senha= "root";
            con = DriverManager.getConnection(url,usuario,senha);
        }catch(ClassNotFoundException erro){
            System.out.println("Erro no Driver: "+ erro.getMessage());
        }catch(SQLException erro){
            System.out.println("Erro na conexão: "+ erro.getMessage());
        }
    }
    public void desconectar(){
        try{
            con.close();
        }catch(SQLException erro){
            System.out.println("Erro na desconexão: "+ erro.getMessage());
        }
    }
    
    //TimeZone.setDefault(TimeZone.getTimeZone("TimeZone"));
}
