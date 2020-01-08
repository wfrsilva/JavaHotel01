import dao.HotelDAO;
import conexaoBanco.ConexaoMySQL;
import gui.CadastroGUI;
import java.sql.SQLException;


public class Iniciar {
    
    public static void main(String args[]) throws SQLException {

        ConexaoMySQL conectar = new ConexaoMySQL();
        
        HotelDAO hoteldao = new HotelDAO(conectar);
            
        new CadastroGUI(hoteldao).setVisible(true);

    }
    
}
