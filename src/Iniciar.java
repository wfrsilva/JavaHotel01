import dao.HotelDAO;
import factory.Conexao;
import gui.CadastroGUI;
import java.sql.SQLException;


public class Iniciar {
    
    public static void main(String args[]) throws SQLException {

        Conexao conectar = new Conexao();
        
        HotelDAO hoteldao = new HotelDAO(conectar);
            
        new CadastroGUI(hoteldao).setVisible(true);

    }
    
}
