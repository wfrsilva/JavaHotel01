package conexaoBanco;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConexaoMySQL {
    
    public static String status = "Aguardando status...";
    
    public static Connection getConnection() throws SQLException{
 
            Connection conectar;
            
        try {

            Class.forName("com.mysql.jdbc.Driver");

            String usuario = "root";
            String senha = "";
            
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdhotel", usuario, senha);
            
            //Testa sua conexão//  
            if(conectar != null){
                status = "Conectado com sucesso!";
                
            }else{
                status = "Conexão abortada...";
            }
            
            System.out.println(status);

            return (Connection) conectar;
            

        } catch (ClassNotFoundException e) {
            status = "ClassNotFoundException - O driver especificado nao foi encontrado.";
            System.out.println(status);
            System.out.println(e);
            
            return null;

        } catch (SQLException e) {
            status = "SQLException - Nao foi possivel conectar ao Banco de Dados.";
            //Não conseguindo se conectar ao banco
            System.out.println(status);
            System.out.println(e);

            return null;

        }

    }//getConnection
    
    public static String statusConexao() {
         return status;
     }//statusConexao

   //Método que fecha sua conexão//
    public static boolean FecharConexao() {
        try {
            ConexaoMySQL.getConnection().close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }//FecharConexao

   //Método que reinicia a conexão//
    public static java.sql.Connection ReiniciarConexao() throws SQLException {
        FecharConexao();
        return ConexaoMySQL.getConnection();
    }

    public static void conectar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public PreparedStatement prepareStatement(String sql) throws SQLException {
               return getConnection().prepareStatement(sql);

    }
    
}// class
