//2020-01-07 Inicialmente vamos migrar para outra classe: ConexaoMySQL.java
package dao;

import conexaoBanco.ConexaoMySQL;
import modelo.Hotel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HotelDAO {
    ConexaoMySQL conectar;

    public HotelDAO(ConexaoMySQL conectar) throws SQLException{
        
       this.conectar = conectar;
      // System.out.println("#####HotelDAO(ConexaoMySQL conectar)#####");
    }//constructor

    public HotelDAO() {
        throw new UnsupportedOperationException("Not supported yet. Codorna"); //To change body of generated methods, choose Tools | Templates.
    }
     
    
    
    
    // Adicionar registro ao BD
    public void adiciona(Hotel hotel) throws SQLException{
        
        String sql = "INSERT INTO tblhotel(hotelID,nome,cidade,quartos,valorDiaria,estrelas) VALUES(?,?,?,?,?,?)";
        
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
        String sql = "UPDATE tblhotel SET nome='"+nome+"', cidade='"+cidade+"', quartos='"+quartos+"', valorDiaria='"+valorDiaria+"', estrelas='"+estrelas+"' WHERE hotelID = '"+hotelID+"';";
       
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
        
        String sql = "DELETE FROM tblhotel WHERE hotelID='"+hotelExcluirID+"';";
            
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
    public Hotel consultaUnica(int id){
        /** 
         * 2020-01-13 ABORTANDO esse metodo, dando errso que nao consegui entender o pq 
         *  Como metodo consultaTodosDados esta funcionando corretamente, vamso tentar duas possibilidades:
         * 1 - Copiar o metodo e tentar adaptar para a necessidade de alterar; EM EXECUCAO DE TENTATIVA 2020-01-13
         * 2 - Usar o metodo consultaTodosDados e aproveitar o arraylist e selecionar pelo array ao inves de ResultSet
         **/
        int hotelConsultarID = id;
        Hotel hotelConsultar;       
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        String sql2 = "SELECT * FROM tblhotel WHERE hotelid='"+hotelConsultarID+"'";
        String sql = "SELECT * FROM tblhotel";

        System.out.println("HotelDAO - sql = " + sql);
        try{
      
            //PreparedStatement stmt;
            stmt = this.conectar.prepareStatement(sql);
            //ResultSet rs = stmt.executeQuery();
            rs = stmt.executeQuery();
            System.out.println("DAO - consultaUnica - rs getRow() - " + rs.getRow());

            System.out.println("DAO rs.getString(\"nome\")" + rs.getString("nome"));
            

            //Verifica se o registro existe:
            if (rs.next()) {
                
                do {
                    System.out.println( "rs - " + rs.getInt("hotelid") + " - " + rs.getString("nome") );
                    hotelConsultar = new Hotel();
                    hotelConsultar.setHotelID((int) rs.getInt("hotelid"));
                    hotelConsultar.setNome(rs.getString("nome"));
                    hotelConsultar.setCidade(rs.getString("cidade"));
                    hotelConsultar.setQuartos(Integer.parseInt(rs.getString("quartos")));
                    hotelConsultar.setValorDiaria(Double.parseDouble(rs.getString("valorDiaria")));
                    hotelConsultar.setEstrelas(Integer.parseInt(rs.getString("Estrelas")));
                    System.out.println("HotelDAO - hotelConsultar.getHotelID() = " + hotelConsultar.getHotelID());
                    System.out.println("HotelDAO - hotelConsultar.getNome() = " + hotelConsultar.getNome());
                } while (rs.next());
                
                System.out.println("HotelDAO - hotelConsultar.getHotelID() = " + hotelConsultar.getHotelID());
                return null;

            }//if
            else {
                JOptionPane.showMessageDialog(null, "Este registro não existe.");
            }//else
            
            stmt.close();

        }catch(SQLException s){    
            System.out.println("DAO - catch(SQLException s) ");
            s.getStackTrace();
            
        }//catch
        return null;
        
               
    }
    
 
/*
    
    
while( rs.next() ) {    //move o curso de registros
            String Nome=rs.getString(“nome”);  // obtém o valor do campo “nome” da tabela
     System.out.println(Nome);   
}
 
*/    
    // Consulta SQL tabela
    //public void consulta(String query){
    
    public List <Hotel> consultaTodosDados(){

        PreparedStatement stmt = null;
        ResultSet rs = null;
        List <Hotel> listaHoteis = new ArrayList<>();
        String sql = "SELECT * FROM tblhotel";
        //String sql = "SELECT * FROM tblhotel ORDER BY hotelID ASC";
        System.out.println(sql);

        try{
            
            
            stmt = this.conectar.prepareStatement(sql);
            rs = stmt.executeQuery();

            System.out.println("DAO - consultaTodosDados - rs gerada - " + sql);
       
      
            while(rs.next()){
                System.out.println( "rs - " + rs.getInt("hotelid") + " - " + rs.getString("nome") );
                //System.out.println( "rs.next() - " + rs.next());
                Hotel hotel = new Hotel();
             
                hotel.setHotelID((int) rs.getInt("hotelid"));
                hotel.setNome(rs.getString("nome"));
                hotel.setCidade(rs.getString("cidade"));
                hotel.setQuartos(Integer.parseInt(  rs.getString("quartos")  ));
                hotel.setValorDiaria(Double.parseDouble( rs.getString("valorDiaria")));                
                hotel.setEstrelas(Integer.parseInt(  rs.getString("Estrelas")  ));
                
                listaHoteis.add(hotel);
/**
                //ConsultaGUI.addRow(new Object[]{hotelID, nome, cidade, quartos, valorDiaria, estrelas});
                **/
            }//while
            
        }//try
        catch(SQLException ex){    
            ex.getStackTrace();
            Logger.getLogger(HotelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }//catch
        finally{
            //ConexaoMySQL.fecharConexao((Connection) conectar, stmt, rs);
            
        }//finally
          
        System.out.println("HotelDao - consultaTodosDados - return listaHoteis");
        System.out.println("listaHoteis.size() = " + listaHoteis.size());
        return listaHoteis;
        
    }//consultaTodosDados
    
    
    public List <Hotel> consultaUnicaList(int id){
        int hotelConsultarID = id;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List <Hotel> listaHoteis = new ArrayList<>();
        String sql = "SELECT * FROM tblhotel WHERE hotelid='"+hotelConsultarID+"'";
        //String sql = "SELECT * FROM tblhotel ORDER BY hotelID ASC";
        System.out.println("DAO - consultaUnicaList() - " + sql);

        try{
            
            
            stmt = this.conectar.prepareStatement(sql);
            rs = stmt.executeQuery();

            System.out.println("DAO - consultaUnicaList - rs gerada - " + sql);
       
      
            while(rs.next()){
                System.out.println( "rs - " + rs.getInt("hotelid") + " - " + rs.getString("nome") );
                //System.out.println( "rs.next() - " + rs.next());
                Hotel hotel = new Hotel();
             
                hotel.setHotelID((int) rs.getInt("hotelid"));
                hotel.setNome(rs.getString("nome"));
                hotel.setCidade(rs.getString("cidade"));
                hotel.setQuartos(Integer.parseInt(  rs.getString("quartos")  ));
                hotel.setValorDiaria(Double.parseDouble( rs.getString("valorDiaria")));                
                hotel.setEstrelas(Integer.parseInt(  rs.getString("Estrelas")  ));
                
                listaHoteis.add(hotel);
/**
                //ConsultaGUI.addRow(new Object[]{hotelID, nome, cidade, quartos, valorDiaria, estrelas});
                **/
            }//while
            
        }//try
        catch(SQLException ex){    
            ex.getStackTrace();
            Logger.getLogger(HotelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }//catch
        finally{
            //ConexaoMySQL.fecharConexao((Connection) conectar, stmt, rs);
            
        }//finally
          
        System.out.println("HotelDao - consultaUnicaList - return listaHoteis");
        System.out.println("consultaUnicaList - listaHoteis.size() = " + listaHoteis.size());
        return listaHoteis;
        
    }//consultaTodosDados
    
    
}//class