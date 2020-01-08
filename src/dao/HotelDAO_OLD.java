package dao;

import factory.Conexao;
import modelo.Hotel;
import java.sql.*;
import javax.swing.JOptionPane;

public class HotelDAO {

    int hotelID;
    String nome;
    String cidade;
    int quartos;
    double valorDiaria;
    int estrelas;
    Conexao conectar;

    public HotelDAO(Conexao conectar) throws SQLException{
        
       this.conectar = conectar;
       
    }

    public HotelDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    
    
    
    // Adicionar registro ao BD
    public void adiciona(Hotel hotel) throws SQLException{
        
        String sql = "INSERT INTO hotel(hotelID,nome,cidade,quartos,valorDiaria,estrelas) VALUES(?,?,?,?,?,?)";
        
        try {
            
            try (PreparedStatement stmt = conectar.prepareStatement(sql)) {
                
                stmt.setInt(1, hotel.getHotelID());
                stmt.setString(2, hotel.getNome());
                stmt.setString(3, hotel.getCidade());
                stmt.setInt(4, hotel.getQuartos());
                stmt.setDouble(5, hotel.getValorDiaria());
                stmt.setInt(6, hotel.getEstrelas());
                
                stmt.execute();
                stmt.close();                 
                
            }
            
        }
        
        catch (SQLException u) { 
            
            throw new RuntimeException(u);
            
        } 
        
    }
    
    // Alterar registro do BD
    public void altera(Hotel hotel){
        
        
        /*
        String sql = "UPDATE hotel SET nome='"+nome+"', cidade='"+cidade+"', quartos='"+quartos+"', valorDiaria='"+valorDiaria+"', estrelas='"+estrelas+"' WHERE hotelID = '"+hotelID+"';";
       
        try {
            
            try (PreparedStatement stmt = conectar.prepareStatement(sql)) {
                
                stmt.setInt(1, hotel.getHotelID());
                stmt.setString(2, hotel.getNome());
                stmt.setString(3, hotel.getCidade());
                stmt.setInt(4, hotel.getQuartos());
                stmt.setDouble(5, hotel.getValorDiaria());
                stmt.setInt(6, hotel.getEstrelas());
                
                stmt.execute();
                stmt.close(); 
                
            }
            
        }
        
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        */
    }
    
    // Exclui registro no BD
    public void exclui(Hotel hotel){
        
        int hotelExcluirID = hotel.getHotelID();
        
        String sql = "DELETE FROM hotel WHERE hotelID='"+hotelExcluirID+"';";
            
        try {
            
            try (PreparedStatement stmt = conectar.prepareStatement(sql)) {
      
                stmt.execute();
                stmt.close();
                
                JOptionPane.showMessageDialog(null, "Registro removido.");

            }
            
        }
        
        catch (SQLException u){  
            
            throw new RuntimeException(u);
            
        }
        
    }
    
    //Consulta SQL registro único (juntar posteriormente)
    public void consultaUnica(Hotel hotel){
        
        int hotelConsultarID = hotel.getHotelID();

        String sql = "SELECT * FROM hotel WHERE hotelID='"+hotelConsultarID+"';";

        try{
            
            
            /*
            
             try (PreparedStatement stmt = conectar.prepareStatement(sql)) {
                
                stmt.setInt(1, hotel.getHotelID());
                stmt.setString(2, hotel.getNome());
                stmt.setString(3, hotel.getCidade());
                stmt.setInt(4, hotel.getQuartos());
                stmt.setDouble(5, hotel.getValorDiaria());
                stmt.setInt(6, hotel.getEstrelas());
                
                stmt.execute();
                stmt.close();                 
                
            }
            
            */
            PreparedStatement stmt;
            stmt = conectar.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            //Verifica se o registro existe:
            if( rs.next() ){

                while(rs.next()){
                    
                    System.out.println( rs.next() );
                    

                    hotel.setHotelID((int) rs.getInt("HotelID"));
                    hotel.setNome(rs.getString("nome"));
                    hotel.setCidade(rs.getString("cidade"));
                    hotel.setQuartos(Integer.parseInt(  rs.getString("quartos")  ));
                    hotel.setValorDiaria(Double.parseDouble( rs.getString("valorDiaria")));
                    hotel.setEstrelas(Integer.parseInt(  rs.getString("Estrelas")  ));

                }   
                    
            }else{

                JOptionPane.showMessageDialog(null, "Este registro não existe.");
                                
            }
            
            stmt.close();

        }catch(SQLException s){    
            
            s.getStackTrace();
            
        }
        
    }
    
 
/*
    
    
while( rs.next() ) {    //move o curso de registros
            String Nome=rs.getString(“nome”);  // obtém o valor do campo “nome” da tabela
     System.out.println(Nome);   
}
 
*/    
    // Consulta SQL tabela
    //public void consulta(String query){
    public void consulta(Hotel hotel){

        String sql = "SELECT * FROM hotel ORDER BY hotelID ASC";
        
System.out.println(sql);
System.out.println("SELECT * FROM hotel ORDER BY hotelID ASC");

        try{
            
            PreparedStatement stmt;
            stmt = this.conectar.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

System.out.println(sql);

            while(rs.next()){

                System.out.println( rs.next());

                hotel.setHotelID((int) rs.getInt("HotelID"));
                hotel.setNome(rs.getString("nome"));
                hotel.setCidade(rs.getString("cidade"));
                hotel.setQuartos(Integer.parseInt(  rs.getString("quartos")  ));
                hotel.setValorDiaria(Double.parseDouble( rs.getString("valorDiaria")));                
                hotel.setEstrelas(Integer.parseInt(  rs.getString("Estrelas")  ));

                //ConsultaGUI.addRow(new Object[]{hotelID, nome, cidade, quartos, valorDiaria, estrelas});

        }

        }catch(SQLException s){    
            
            s.getStackTrace();
            
        }
        
    }
    
}