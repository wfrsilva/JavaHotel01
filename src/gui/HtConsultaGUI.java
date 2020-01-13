package gui;

import conexaoBanco.ConexaoMySQL;
import dao.HotelDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Hotel;
//import modelo.Hotel;

public class HtConsultaGUI extends javax.swing.JFrame {
    //ConexaoMySQL conectar;
    HotelDAO dao;

    public HtConsultaGUI(HotelDAO dao) throws SQLException{
        this.dao = dao;
        initComponents();
        buscarDadosParaJTable();
        this.setLocationRelativeTo(null);
    }//constructor
  
    //Hotel hotel = new Hotel();
    
  //  dao.consulta(hotel);   
    
    /*
    HotelDAO hotel = new HotelDAO();
    hotel.consulta(hotel);
    */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Listar hotéis");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Cidade", "Quartos", "Valor da diária", "Estrelas"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("ID");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Nome");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Cidade");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Quartos");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Valor da diária");
            jTable1.getColumnModel().getColumn(5).setHeaderValue("Estrelas");
        }

        jToggleButton1.setText("Fechar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 587, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jToggleButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

       setVisible(false);
      
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

    public DefaultTableModel formatarJTableAposBuscaDados(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nome");
        modelo.addColumn("Cidade");
        modelo.addColumn("Nro Quartos");
        modelo.addColumn("Valor Diaria");
        modelo.addColumn("Estrelas");
        //modelo.setNumRows(0);
        
        jTable1.setModel(modelo);
        
        return modelo;
        
    }
    
    public  void buscarDadosParaJTable(){
        
        DefaultTableModel modelo = formatarJTableAposBuscaDados();
        
        for(Hotel h : dao.consultaTodosDados()){
            modelo.addRow(
                    new Object[]{
                        h.getHotelID(),
                        h.getNome(),
                        h.getCidade(),
                        h.getQuartos(),
                        h.getValorDiaria(),
                        h.getEstrelas()
                    }
            );
        }//for
        
        /*
        try {
            while(rs.next()){
                int id = rs.getInt("hotelid");
                modelo.addRow(
                        new Object[]{
                            String.valueOf(id),
                            rs.getString("nome"),
                            rs.getString("cidade"),
                            rs.getString("quartos"),
                            rs.getString("valorDiaria"),
                            rs.getString("estrelas")
                        });
               ehConsulta = false;
               jTtabela.setModel(modelo);
               
                if(ehConsulta){
                    JOptionPane.showMessageDialog(null, "Dados NÃO encontrados");
                }//if
                else{
                    JOptionPane.showMessageDialog(null, "Dados encontrados");
                }//else
               
            }//while
        } catch (SQLException ex) {
            Logger.getLogger(HtConsultaGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        */

        /**
        try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/BDCadastro", "root", "");
            java.sql.Statement stmt = con.createStatement();
            ResultSet rs;

            if(!jTbuscar.getText().equals("")){
                int consMatricula = Integer.parseInt(jTbuscar.getText());
                rs = stmt.executeQuery("Select * from TabFicha where Matricula=" + consMatricula);
            }//if
            else{
                rs = stmt.executeQuery("Select * from Tabficha");
            }//else

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Codigo");
            modelo.addColumn("Nome");
            modelo.addColumn("CPF");
            modelo.addColumn("Telefone");
            modelo.addColumn("Logradour");
            modelo.addColumn("Numero");
            modelo.addColumn("Cidade");
            modelo.addColumn("Estado");

            while(rs.next()){
                
                int mat = rs.getInt("Matricula");
                modelo.addRow(new Object[]{
                    String.valueOf(mat), 
                    rs.getString("Nome"),
                    rs.getString("CPF"),
                    rs.getString("Telefone"),
                    rs.getString("Logradouro"),
                    rs.getString("Numero"),
                    rs.getString("Bairro"),
                    rs.getString("Cidade"),
                    rs.getString("Estado")
                });
                consulta = false;

            }//while

            jTtabela.setModel(modelo);

            if(consulta){
                JOptionPane.showMessageDialog(null, "Dados NÃO encontrados");
            }//if
            else{
                JOptionPane.showMessageDialog(null, "Dados encontrados");
            }//else

            rs.close();
            stmt.close();
            con.close();

        }//try
        catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro comando SQL " + erro.getMessage());
        }//catch
        catch (Exception  erro){
            JOptionPane.showMessageDialog(null, "Driver NÃO Encontrado");
        }//catch
        **/

    }//buscarDados
    
}
