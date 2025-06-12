package com.br.rentdrive.model.gui.view;

import com.br.rentdrive.model.dao.VeiculoDAO;
import com.br.rentdrive.model.entities.Veiculos;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class VeiculoTela extends javax.swing.JFrame {

    public VeiculoTela() {
        initComponents();
        VeiculoDAO veiculoDao = new VeiculoDAO();
        List<Veiculos> listaVeiculo = veiculoDao.listar(-1, "", "", "", "", "", null, null);
        preencheTabela(listaVeiculo);
    }

    public void preencheTabela(List<Veiculos> veiculos) {
        String[] columns = {"Id", "Marca", "Modelo", "Placa", "Ano", "Estado", "Valor aluguel", "Valor"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);

        for (Veiculos veiculo : veiculos) {
            Object[] rowData = {
                veiculo.getId(),
                veiculo.getMarca(),
                veiculo.getModelo(),
                veiculo.getPlaca(),
                veiculo.getAno().toString(),
                veiculo.getEstado(),
                String.valueOf(veiculo.getValorAluguel()),
                String.valueOf(veiculo.getValor())
            };
            model.addRow(rowData);
        }

        TabelaVeiculo.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel12 = new javax.swing.JPanel();
        LabelRentDrive5 = new javax.swing.JLabel();
        LabelAluguelDeCarros5 = new javax.swing.JLabel();
        LabelContato5 = new javax.swing.JLabel();
        LabelAjuda5 = new javax.swing.JLabel();
        LabelReservas5 = new javax.swing.JLabel();
        bttnAluguel5 = new javax.swing.JButton();
        bttnCarros5 = new javax.swing.JButton();
        bttnCompra5 = new javax.swing.JButton();
        bttnLocais5 = new javax.swing.JButton();
        Panel11 = new javax.swing.JPanel();
        bttnOk5 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        TabelaVeiculo = new javax.swing.JTable();
        txtMarca = new javax.swing.JTextField();
        LabelLocal10 = new javax.swing.JLabel();
        LabelAlugue1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Veiculos");

        Panel12.setBackground(new java.awt.Color(255, 102, 51));

        LabelRentDrive5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelRentDrive5.setForeground(new java.awt.Color(255, 255, 255));
        LabelRentDrive5.setText("RentDrive");

        LabelAluguelDeCarros5.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        LabelAluguelDeCarros5.setForeground(new java.awt.Color(255, 255, 255));
        LabelAluguelDeCarros5.setText("Aluguel de carros");

        LabelContato5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        LabelContato5.setForeground(new java.awt.Color(255, 255, 255));
        LabelContato5.setText("Contato");
        LabelContato5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelContato5LabelContatoMouseClicked(evt);
            }
        });

        LabelAjuda5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        LabelAjuda5.setForeground(new java.awt.Color(255, 255, 255));
        LabelAjuda5.setText("Ajuda");
        LabelAjuda5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelAjuda5LabelAjudaMouseClicked(evt);
            }
        });

        LabelReservas5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        LabelReservas5.setForeground(new java.awt.Color(255, 255, 255));
        LabelReservas5.setText("Minhas reservas");
        LabelReservas5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelReservas5LabelReservasMouseClicked(evt);
            }
        });

        bttnAluguel5.setBackground(new java.awt.Color(255, 102, 51));
        bttnAluguel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttnAluguel5.setForeground(new java.awt.Color(255, 255, 255));
        bttnAluguel5.setText("Aluguel");
        bttnAluguel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        bttnAluguel5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnAluguel5bttnAluguelActionPerformed(evt);
            }
        });

        bttnCarros5.setBackground(new java.awt.Color(255, 102, 51));
        bttnCarros5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttnCarros5.setForeground(new java.awt.Color(255, 255, 255));
        bttnCarros5.setText("Carros");
        bttnCarros5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        bttnCarros5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCarros5bttnCarrosActionPerformed(evt);
            }
        });

        bttnCompra5.setBackground(new java.awt.Color(255, 102, 51));
        bttnCompra5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttnCompra5.setForeground(new java.awt.Color(255, 255, 255));
        bttnCompra5.setText("Compra");
        bttnCompra5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        bttnCompra5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCompra5bttnCompraActionPerformed(evt);
            }
        });

        bttnLocais5.setBackground(new java.awt.Color(255, 102, 51));
        bttnLocais5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttnLocais5.setForeground(new java.awt.Color(255, 255, 255));
        bttnLocais5.setText("Locais de Retirada");
        bttnLocais5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        bttnLocais5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnLocais5bttnLocaisActionPerformed(evt);
            }
        });

        Panel11.setBackground(new java.awt.Color(140, 44, 1));

        bttnOk5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttnOk5.setText("Pesquisar");
        bttnOk5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnOk5bttnOkActionPerformed(evt);
            }
        });

        TabelaVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Marca", "Modelo", "Placa", "Ano", "Estado", "Valor alguel", "Valor"
            }
        ));
        jScrollPane7.setViewportView(TabelaVeiculo);

        txtMarca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        LabelLocal10.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        LabelLocal10.setForeground(new java.awt.Color(255, 255, 255));
        LabelLocal10.setText("Pesquise por marca de carro:");

        LabelAlugue1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        LabelAlugue1.setForeground(new java.awt.Color(255, 255, 255));
        LabelAlugue1.setText("Escolha seu carro");

        javax.swing.GroupLayout Panel11Layout = new javax.swing.GroupLayout(Panel11);
        Panel11.setLayout(Panel11Layout);
        Panel11Layout.setHorizontalGroup(
            Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel11Layout.createSequentialGroup()
                .addContainerGap(205, Short.MAX_VALUE)
                .addGroup(Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel11Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel11Layout.createSequentialGroup()
                        .addGroup(Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelAlugue1)
                            .addGroup(Panel11Layout.createSequentialGroup()
                                .addComponent(LabelLocal10)
                                .addGap(129, 129, 129)
                                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addGap(146, 146, 146)
                        .addComponent(bttnOk5)
                        .addGap(302, 302, 302))))
        );
        Panel11Layout.setVerticalGroup(
            Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel11Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(LabelAlugue1)
                .addGap(44, 44, 44)
                .addGroup(Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnOk5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelLocal10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Panel12Layout = new javax.swing.GroupLayout(Panel12);
        Panel12.setLayout(Panel12Layout);
        Panel12Layout.setHorizontalGroup(
            Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel12Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel12Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(LabelAluguelDeCarros5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Panel12Layout.createSequentialGroup()
                        .addComponent(LabelRentDrive5)
                        .addGap(101, 101, 101)
                        .addComponent(bttnAluguel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(bttnCompra5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttnCarros5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(bttnLocais5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(LabelContato5)
                        .addGap(34, 34, 34)
                        .addComponent(LabelAjuda5)
                        .addGap(39, 39, 39)
                        .addComponent(LabelReservas5)
                        .addGap(19, 19, 19))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Panel12Layout.setVerticalGroup(
            Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel12Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelRentDrive5)
                        .addComponent(bttnAluguel5)
                        .addComponent(bttnCompra5))
                    .addGroup(Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelContato5)
                        .addComponent(LabelAjuda5)
                        .addComponent(LabelReservas5)
                        .addComponent(bttnLocais5)
                        .addComponent(bttnCarros5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelAluguelDeCarros5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(Panel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LabelContato5LabelContatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelContato5LabelContatoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelContato5LabelContatoMouseClicked

    private void LabelAjuda5LabelAjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelAjuda5LabelAjudaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelAjuda5LabelAjudaMouseClicked

    private void LabelReservas5LabelReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelReservas5LabelReservasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelReservas5LabelReservasMouseClicked

    private void bttnAluguel5bttnAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAluguel5bttnAluguelActionPerformed
        AluguelTela al = new AluguelTela();
        al.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttnAluguel5bttnAluguelActionPerformed

    private void bttnCarros5bttnCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCarros5bttnCarrosActionPerformed

    }//GEN-LAST:event_bttnCarros5bttnCarrosActionPerformed

    private void bttnCompra5bttnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCompra5bttnCompraActionPerformed
        CompraTela ct = new CompraTela();
        ct.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttnCompra5bttnCompraActionPerformed

    private void bttnLocais5bttnLocaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnLocais5bttnLocaisActionPerformed
       LocalTela  lt = new LocalTela();
        lt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttnLocais5bttnLocaisActionPerformed

    private void bttnOk5bttnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnOk5bttnOkActionPerformed
         String marca = txtMarca.getText();
        VeiculoDAO veiculoDAO = new VeiculoDAO();
        List<Veiculos> resultados = veiculoDAO.obterMarca(marca);
        DefaultTableModel model = (DefaultTableModel) TabelaVeiculo.getModel();
        model.setRowCount(0);
        for (Veiculos veiculo : resultados) {
            Object[] rowData = {veiculo.getId(), veiculo.getMarca(), veiculo.getPlaca(),veiculo.getAno(),veiculo.getEstado(),veiculo.getValorAluguel(),veiculo.getValor()};
            model.addRow(rowData);
        }
    }//GEN-LAST:event_bttnOk5bttnOkActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VeiculoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VeiculoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VeiculoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VeiculoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VeiculoTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelAjuda5;
    private javax.swing.JLabel LabelAlugue1;
    private javax.swing.JLabel LabelAluguelDeCarros5;
    private javax.swing.JLabel LabelContato5;
    private javax.swing.JLabel LabelLocal10;
    private javax.swing.JLabel LabelRentDrive5;
    private javax.swing.JLabel LabelReservas5;
    private javax.swing.JPanel Panel11;
    private javax.swing.JPanel Panel12;
    private javax.swing.JTable TabelaVeiculo;
    private javax.swing.JButton bttnAluguel5;
    private javax.swing.JButton bttnCarros5;
    private javax.swing.JButton bttnCompra5;
    private javax.swing.JButton bttnLocais5;
    private javax.swing.JButton bttnOk5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextField txtMarca;
    // End of variables declaration//GEN-END:variables
}
