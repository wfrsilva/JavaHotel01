package gui;

import dao.HotelDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Hotel;

public class HtCadastroGUI extends javax.swing.JFrame {
 
    HotelDAO dao;
              
    public HtCadastroGUI(HotelDAO hoteldao) {
        
        this.dao = hoteldao;
        
        initComponents();
        
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome)
                    .addComponent(num_estrelas_hotel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome_hotel, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cidade)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(num_quartos_hotel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                .addComponent(cidade_hotel, javax.swing.GroupLayout.Alignment.LEADING))
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
                            .addComponent(sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addComponent(nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_hotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salvar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                        .addComponent(num_estrelas_hotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sair)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        
        // fazendo a validação do nome do hotel
        if (nome_hotel.getText().isEmpty()) {
            
           JOptionPane.showMessageDialog(null, "O nome do hotel é de preenchimento obrigatório!");
           
        } else {

            // instanciando a classe Hotel do pacote modelo e criando o objeto hotel
            Hotel hotel = new Hotel();
            
            hotel.setNome(nome_hotel.getText());
            
            if ( cidade_hotel.getText().isEmpty() ){            
                hotel.setCidade("");                
            }else{           
                hotel.setCidade(cidade_hotel.getText());
            }
            
            if ( num_quartos_hotel.getText().isEmpty() ){            
                hotel.setQuartos(0);                
            }else{           
                hotel.setQuartos(Integer.parseInt(num_quartos_hotel.getText()));
            }

            if ( valor_diaria_hotel.getText().isEmpty() ){            
                hotel.setValorDiaria(0.00);                
            }else{           
                hotel.setValorDiaria(Double.parseDouble(valor_diaria_hotel.getText()));
            }
            
            if ( num_estrelas_hotel.getText().isEmpty() ){            
                hotel.setEstrelas(0);                
            }else{           
                hotel.setEstrelas(Integer.parseInt(num_estrelas_hotel.getText()));
            }
            
            
          
            try {
                dao.adiciona(hotel);
            } catch (SQLException ex) {
                Logger.getLogger(HtCadastroGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Hotel " + nome_hotel.getText() + " inserido com sucesso! ");
            
        }

        // apaga os dados preenchidos nos campos de texto
        nome_hotel.setText("");
        cidade_hotel.setText("");
        num_quartos_hotel.setText("");
        valor_diaria_hotel.setText("");
        num_estrelas_hotel.setText("");
        
    }//GEN-LAST:event_salvarActionPerformed

    private void nome_hotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_hotelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_hotelActionPerformed

    // Botão sair do sistema
    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_sairActionPerformed

    // Botão limpar campos do formulário
    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        nome_hotel.setText("");
        cidade_hotel.setText("");
        num_quartos_hotel.setText("");
        valor_diaria_hotel.setText("");
        num_estrelas_hotel.setText("");
    }//GEN-LAST:event_limparActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed

        Hotel hotel = new Hotel();
        
        String idAlteracao = JOptionPane.showInputDialog("Digite o ID a ser alterado:");

        int hotelID;
        hotelID = Integer.parseInt(idAlteracao.trim());
        
        hotel.setHotelID(hotelID);
        
        dao.consultaUnica(hotel);
        
System.out.println(hotel.getCidade());
        
        /**/
        nome_hotel.setText(hotel.getNome());
        /*
        cidade_hotel.setText(hotel.getCidade());
        num_quartos_hotel.setInt(Integer.parseInt(hotel.getQuartos());
        valor_diaria_hotel.setText("");
        num_estrelas_hotel.setText("");
        /**/
    }//GEN-LAST:event_alterarActionPerformed

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
