package gui;

import dao.HotelDAO;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Hotel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class HtCadastroGUI extends javax.swing.JFrame {
 
    HotelDAO dao;
    Boolean ehAlteracao = false; /* Branch AMT - Alterar na Mesma Tela Salvar */
    
    URL iconeFavURL = getClass().getResource("/res/hotel.png") ;
    ImageIcon iconeFav = new ImageIcon(iconeFavURL);
    URL iconeSalvarURL = getClass().getResource("/res/salvar.png") ;
    ImageIcon iconeSalvar = new ImageIcon(iconeSalvarURL);
    URL iconeAtualizarURL = getClass().getResource("/res/atualizar.png") ;
    ImageIcon iconeAtualizar = new ImageIcon(iconeAtualizarURL);
              
    public HtCadastroGUI(HotelDAO hoteldao) {
        
        this.dao = hoteldao;
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema GUI de cadastro de Hotéis");

        
        this.setIconImage(iconeFav.getImage());


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        titulo = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        nome_hotel = new javax.swing.JTextField();
        cidade = new javax.swing.JLabel();
        cidade_hotel = new javax.swing.JTextField();
        num_quartos = new javax.swing.JLabel();
        num_quartos_hotel = new javax.swing.JTextField();
        valor_diaria = new javax.swing.JLabel();
        valor_diaria_hotel = new javax.swing.JTextField();
        num_estrelas = new javax.swing.JLabel();
        num_estrelas_hotel = new javax.swing.JTextField();
        salvar = new javax.swing.JButton();
        listar = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        jlHotelIdTxt = new javax.swing.JLabel();
        jlHotelIdNr = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        titulo.setText("Dados do Hotel");

        nome.setText("Nome:");

        nome_hotel.setNextFocusableComponent(cidade_hotel);
        nome_hotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_hotelActionPerformed(evt);
            }
        });

        cidade.setText("Cidade:");

        cidade_hotel.setNextFocusableComponent(num_quartos_hotel);

        num_quartos.setText("Número de quartos:");

        num_quartos_hotel.setNextFocusableComponent(valor_diaria_hotel);

        valor_diaria.setText("Valor da diária:");

        valor_diaria_hotel.setNextFocusableComponent(num_estrelas_hotel);
        valor_diaria_hotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor_diaria_hotelActionPerformed(evt);
            }
        });

        num_estrelas.setText("Número de estrelas:");

        num_estrelas_hotel.setNextFocusableComponent(salvar);

        salvar.setText("Salvar");
        salvar.setNextFocusableComponent(listar);
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        listar.setText("Listar");
        listar.setNextFocusableComponent(alterar);
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });

        alterar.setText("Alterar");
        alterar.setNextFocusableComponent(excluir);
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        excluir.setText("Excluir");
        excluir.setNextFocusableComponent(limpar);
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        limpar.setText("Limpar");
        limpar.setNextFocusableComponent(sair);
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        sair.setText("Sair");
        sair.setNextFocusableComponent(nome_hotel);
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        jlHotelIdTxt.setText("ID:   ");

        jlHotelIdNr.setBackground(new java.awt.Color(255, 255, 255));
        jlHotelIdNr.setText("     ");
        jlHotelIdNr.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome)
                            .addComponent(num_estrelas_hotel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nome_hotel, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cidade)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(num_quartos_hotel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cidade_hotel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(num_quartos)
                            .addComponent(valor_diaria)
                            .addComponent(valor_diaria_hotel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num_estrelas))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(alterar, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(limpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlHotelIdTxt)
                        .addGap(18, 18, 18)
                        .addComponent(jlHotelIdNr)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(salvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sair)
                        .addContainerGap(68, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlHotelIdTxt)
                            .addComponent(jlHotelIdNr))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome_hotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cidade_hotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num_quartos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num_quartos_hotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valor_diaria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valor_diaria_hotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num_estrelas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num_estrelas_hotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        
        // fazendo a validação do nome do hotel
        if (nome_hotel.getText().isEmpty()) {
           JOptionPane.showMessageDialog(null, "O nome do hotel é de preenchimento obrigatório!");
        } //if
        else {
            AMTVerificaSeEhAlteracao();
        }//else

        // apaga os dados preenchidos nos campos de texto
        
        
    }//GEN-LAST:event_salvarActionPerformed

    public void AMTVerificaSeEhAlteracao(){
        /*  ehAlteracao = TRUE, então pressionando botão SALVAR, vai Alterar(atualizar) a tupla (registro) carregada;
            ehAlteracao = FALSE, então pressionando botão SALVAR, vai criar uma nova tupla (registro); */
        String insOUalt = "";
        if(ehAlteracao){
            AMTAlteraHotel();
            insOUalt = "ALTERADO";
        }//if
        else{
            AMTSalvarNovoHotel();
            insOUalt = "INSERIDO";
        }//else
        
        String msgSMD = "<html>Hotel: " + nome_hotel.getText() + " <b>" +insOUalt+ "</b> com sucesso! </html>";
        String msgTit = nome_hotel.getText()+ " " +insOUalt+ "!";
        JLabel labelSMD = new JLabel(msgSMD);
        labelSMD.setFont(new Font("serif", Font.PLAIN, 14));
        JOptionPane.showMessageDialog(null,labelSMD, msgTit ,JOptionPane.INFORMATION_MESSAGE,iconeSalvar);
        
        limparCamposFrame();
        AMTDesativarEhAlterar();
    }//AMTVerificaSeEhAlteracao
    
    public void AMTAlteraHotel(){
        /*  ehAlteracao = TRUE  */
        Hotel hotel = AMTCapturaTextFieldCadastro();
        
       
    }//AMT-AlteraHotel
        
    public void AMTSalvarNovoHotel(){
        /*  ehAlteracao = FALSE  */
        Hotel hotel = AMTCapturaTextFieldCadastro();

        try {
            dao.adiciona(hotel);
        } catch (SQLException ex) {
            Logger.getLogger(HtCadastroGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//AMT-SalvarNovoHotel
    
    public Hotel AMTCapturaTextFieldCadastro(){
        /* instanciando a classe Hotel do pacote modelo e criando o objeto hotel*/
        Hotel hotel = new Hotel();

        hotel.setNome(nome_hotel.getText());

        if (cidade_hotel.getText().isEmpty()) {
            hotel.setCidade("");
        } else {
            hotel.setCidade(cidade_hotel.getText());
        }

        if (num_quartos_hotel.getText().isEmpty()) {
            hotel.setQuartos(0);
        } else {
            hotel.setQuartos(Integer.parseInt(num_quartos_hotel.getText()));
        }

        if (valor_diaria_hotel.getText().isEmpty()) {
            hotel.setValorDiaria(0.00);
        } else {
            hotel.setValorDiaria(Double.parseDouble(valor_diaria_hotel.getText()));
        }

        if (num_estrelas_hotel.getText().isEmpty()) {
            hotel.setEstrelas(0);
        } else {
            hotel.setEstrelas(Integer.parseInt(num_estrelas_hotel.getText()));
        }
        
        return hotel;
        
    }//AMT-CapturaTextFieldCadastro
    
    private void nome_hotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_hotelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_hotelActionPerformed

    // Botão sair do sistema
    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_sairActionPerformed

    // Botão limpar campos do formulário
    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        limparCamposFrame();
    }//GEN-LAST:event_limparActionPerformed
    
    public void limparCamposFrame(){
        jlHotelIdNr.setText("");
        nome_hotel.setText("");
        cidade_hotel.setText("");
        num_quartos_hotel.setText("");
        valor_diaria_hotel.setText("");
        num_estrelas_hotel.setText("");
    }//limparCampos
    
    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed

        String idAlteracaoStr = JOptionPane.showInputDialog("Digite o ID a ser alterado:");
        System.out.println("HtCadastroGUI - idAlteracaoStr = " + idAlteracaoStr);
        int idAlteracaoInt;
        idAlteracaoInt = Integer.parseInt(idAlteracaoStr.trim());
        
        List listaHotelAlterar = dao.consultaUnicaList(idAlteracaoInt);
        System.out.println("HtCadastroGUI.alterarActionPerformed().listaHotelAlterar.size() => " + listaHotelAlterar.size());
        
        carregarFrameComBuscaUnica(listaHotelAlterar);
        
        AMTAtivarEhAlterar();
    }//GEN-LAST:event_alterarActionPerformed
   
    public void AMTAtivarEhAlterar(){
        /*  ehAlteracao = TRUE, então pressionando botão SALVAR, vai Alterar(atualizar) a tupla (registro) carregada;
            ehAlteracao = FALSE, então pressionando botão SALVAR, vai criar uma nova tupla (registro); */
        ehAlteracao = true;
        System.out.println("AMTAtivarEhAlterar.ehAlteracao = " + ehAlteracao);
    }//AMT--AtivarAlterar
    
    public void AMTDesativarEhAlterar(){
        /*  ehAlteracao = TRUE, então pressionando botão SALVAR, vai Alterar(atualizar) a tupla (registro) carregada;
            ehAlteracao = FALSE, então pressionando botão SALVAR, vai criar uma nova tupla (registro); */
        ehAlteracao = false;
        System.out.println("AMTDesativarEhAlterar.ehAlteracao = " + ehAlteracao);
    }//AMT-DesativarEhAlterar
    
    public void carregarFrameComBuscaUnica(List listaHoteis){
        Hotel hotelAlterar = new Hotel();
        hotelAlterar = (Hotel) listaHoteis.get(0);
        jlHotelIdNr.setText(Integer.toString(hotelAlterar.getHotelID()));
        nome_hotel.setText(hotelAlterar.getNome());
        cidade_hotel.setText(hotelAlterar.getCidade());
        num_quartos_hotel.setText(Integer.toString(hotelAlterar.getQuartos())) ;
        valor_diaria_hotel.setText(String.valueOf(hotelAlterar.getValorDiaria()));
        num_estrelas_hotel.setText(Integer.toString(hotelAlterar.getEstrelas()));
        
        
    }
    
    
    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
        	
        HtConsultaGUI consultaGUI;
        try {
            consultaGUI = new HtConsultaGUI(dao);
            consultaGUI.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(HtCadastroGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
    }//GEN-LAST:event_listarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed

        Hotel hotel = new Hotel();
        
        String idExclusao = JOptionPane.showInputDialog("Digite o ID a ser apagado:");
        
        int hotelID;
        hotelID = Integer.parseInt(idExclusao.trim());
        
        hotel.setHotelID(hotelID);
        
        dao.exclui(hotel);   
        
    }//GEN-LAST:event_excluirActionPerformed

    private void valor_diaria_hotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor_diaria_hotelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor_diaria_hotelActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JLabel cidade;
    private javax.swing.JTextField cidade_hotel;
    private javax.swing.JButton excluir;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jlHotelIdNr;
    private javax.swing.JLabel jlHotelIdTxt;
    private javax.swing.JButton limpar;
    private javax.swing.JButton listar;
    private javax.swing.JLabel nome;
    private javax.swing.JTextField nome_hotel;
    private javax.swing.JLabel num_estrelas;
    private javax.swing.JTextField num_estrelas_hotel;
    private javax.swing.JLabel num_quartos;
    private javax.swing.JTextField num_quartos_hotel;
    private javax.swing.JButton sair;
    private javax.swing.JButton salvar;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel valor_diaria;
    private javax.swing.JTextField valor_diaria_hotel;
    // End of variables declaration//GEN-END:variables

}
