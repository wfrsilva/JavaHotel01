package factory;

import java.sql.*;

public class Conexao {
    
     
    //Metodo que abre a conexao
    public static Connection getConnection() throws SQLException{
 
            Connection conectar;
            
        try {

            Class.forName("com.mysql.jdbc.Driver");

            String usuario = "root";
            String senha = "root";
            
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", usuario, senha);
            
            //Testa sua conexão//  
            if(conectar != null){

                System.out.println("Conectado com sucesso!");

            }else{

                System.out.println("Conexão abortada.");

            }

            return (Connection) conectar;
            

        } catch (ClassNotFoundException e) {

            System.out.println("O driver especificado nao foi encontrado.");
            System.out.println(e);
            
            return null;

        } catch (SQLException e) {

            //Não conseguindo se conectar ao banco
            System.out.println("Nao foi possivel conectar ao Banco de Dados." );
            System.out.println(e);

            return null;

        }

    }

   //Método que fecha sua conexão//
    public static boolean FecharConexao() {

        try {

            Conexao.getConnection().close();

            return true;

        } catch (SQLException e) {

            return false;

        }

    }

   //Método que reinicia a conexão//
    public static java.sql.Connection ReiniciarConexao() throws SQLException {

        FecharConexao();

        return Conexao.getConnection();

    }

    public static void conectar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public PreparedStatement prepareStatement(String sql) throws SQLException {
               return getConnection().prepareStatement(sql);

    }
    
}