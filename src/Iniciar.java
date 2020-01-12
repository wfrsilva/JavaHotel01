import dao.HotelDAO;
import conexaoBanco.ConexaoMySQL;
import gui.HtCadastroGUI;
import java.sql.SQLException;


public class Iniciar {
    
    public static void main(String args[]) throws SQLException {

        ConexaoMySQL conectar = new ConexaoMySQL();
        
        HotelDAO hoteldao = new HotelDAO(conectar);
            
        new HtCadastroGUI(hoteldao).setVisible(true);

    }
    
}
