/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.br.rentdrive.model.gui.view;

import com.br.rentdrive.model.dao.PagamentoDAO;
import com.br.rentdrive.model.entities.Clientes;
import com.br.rentdrive.model.entities.Veiculos;
import com.br.rentdrive.model.entities.contract.Aluguel;
import com.br.rentdrive.model.entities.contract.Compras;
import com.br.rentdrive.model.entities.contract.Pagamentos;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author rober
 */
public class PagamentoTelaCompra extends javax.swing.JFrame {

    public PagamentoTelaCompra() {
        initComponents();
    }

    private Compras compra;
    private double valorVeiculo;
    private Veiculos veiculo;
    private Clientes clienteIdP;

    public PagamentoTelaCompra(double valorVeiculo, Veiculos veiculo) {
        initComponents();
        this.valorVeiculo = valorVeiculo;
        this.veiculo = veiculo;
        LabelValor.setText(String.valueOf(valorVeiculo));
    }

    public PagamentoTelaCompra(Compras compra) {
        initComponents();
        this.compra = compra;
    }

    public PagamentoTelaCompra(Clientes cliente) {
        initComponents();
        this.clienteIdP = cliente;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        LabelRentDrive = new javax.swing.JLabel();
        LabelAluguelDeCarros = new javax.swing.JLabel();
        LabelContato = new javax.swing.JLabel();
        LabelAjuda = new javax.swing.JLabel();
        LabelReservas = new javax.swing.JLabel();
        bttnAluguel = new javax.swing.JButton();
        bttnCarros = new javax.swing.JButton();
        bttnCompra = new javax.swing.JButton();
        bttnLocais = new javax.swing.JButton();
        Panel2 = new javax.swing.JPanel();
        LabelCompra = new javax.swing.JLabel();
        LabelLocal = new javax.swing.JLabel();
        txtDataPagamento = new javax.swing.JFormattedTextField();
        LabelRetirada = new javax.swing.JLabel();
        bttnBuscar = new javax.swing.JButton();
        LabelValor = new javax.swing.JLabel();
        LabelRetirada3 = new javax.swing.JLabel();
        boxTipo = new javax.swing.JComboBox<>();
        LabelValor1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pagamento");

        Panel1.setBackground(new java.awt.Color(255, 102, 51));

        LabelRentDrive.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelRentDrive.setForeground(new java.awt.Color(255, 255, 255));
        LabelRentDrive.setText("RentDrive");

        LabelAluguelDeCarros.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        LabelAluguelDeCarros.setForeground(new java.awt.Color(255, 255, 255));
        LabelAluguelDeCarros.setText("Aluguel de carros");

        LabelContato.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        LabelContato.setForeground(new java.awt.Color(255, 255, 255));
        LabelContato.setText("Contato");
        LabelContato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelContatoMouseClicked(evt);
            }
        });

        LabelAjuda.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        LabelAjuda.setForeground(new java.awt.Color(255, 255, 255));
        LabelAjuda.setText("Ajuda");
        LabelAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelAjudaMouseClicked(evt);
            }
        });

        LabelReservas.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        LabelReservas.setForeground(new java.awt.Color(255, 255, 255));
        LabelReservas.setText("Minhas reservas");
        LabelReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelReservasMouseClicked(evt);
            }
        });

        bttnAluguel.setBackground(new java.awt.Color(255, 102, 51));
        bttnAluguel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttnAluguel.setForeground(new java.awt.Color(255, 255, 255));
        bttnAluguel.setText("Aluguel");
        bttnAluguel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        bttnAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnAluguelActionPerformed(evt);
            }
        });

        bttnCarros.setBackground(new java.awt.Color(255, 102, 51));
        bttnCarros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttnCarros.setForeground(new java.awt.Color(255, 255, 255));
        bttnCarros.setText("Carros");
        bttnCarros.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        bttnCarros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCarrosActionPerformed(evt);
            }
        });

        bttnCompra.setBackground(new java.awt.Color(255, 102, 51));
        bttnCompra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttnCompra.setForeground(new java.awt.Color(255, 255, 255));
        bttnCompra.setText("Compra");
        bttnCompra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        bttnCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCompraActionPerformed(evt);
            }
        });

        bttnLocais.setBackground(new java.awt.Color(255, 102, 51));
        bttnLocais.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttnLocais.setForeground(new java.awt.Color(255, 255, 255));
        bttnLocais.setText("Locais de Retirada");
        bttnLocais.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        bttnLocais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnLocaisActionPerformed(evt);
            }
        });

        Panel2.setBackground(new java.awt.Color(140, 44, 1));

        LabelCompra.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        LabelCompra.setForeground(new java.awt.Color(255, 255, 255));
        LabelCompra.setText("FAÇA SEU PAGAMENTO");

        LabelLocal.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        LabelLocal.setForeground(new java.awt.Color(255, 255, 255));

        txtDataPagamento.setToolTipText("");
        txtDataPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataPagamentoActionPerformed(evt);
            }
        });

        LabelRetirada.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        LabelRetirada.setForeground(new java.awt.Color(255, 255, 255));
        LabelRetirada.setText("Data de pagamento");

        bttnBuscar.setBackground(new java.awt.Color(255, 102, 51));
        bttnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        bttnBuscar.setText("Finalizar");
        bttnBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        bttnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBuscarActionPerformed(evt);
            }
        });

        LabelValor.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        LabelValor.setForeground(new java.awt.Color(255, 255, 255));
        LabelValor.setText("Valor");

        LabelRetirada3.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        LabelRetirada3.setForeground(new java.awt.Color(255, 255, 255));
        LabelRetirada3.setText("Tipo");

        boxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pix", "Debito", "Credito" }));
        boxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTipoActionPerformed(evt);
            }
        });

        LabelValor1.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        LabelValor1.setForeground(new java.awt.Color(255, 255, 255));
        LabelValor1.setText("Valor:");

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelCompra)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelLocal)
                            .addGroup(Panel2Layout.createSequentialGroup()
                                .addComponent(LabelValor1)
                                .addGap(33, 33, 33)
                                .addComponent(LabelValor)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelRetirada3)
                            .addComponent(boxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(119, 119, 119)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelRetirada)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(txtDataPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)
                        .addComponent(bttnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel2Layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(LabelRetirada)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(LabelRetirada3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(boxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LabelValor)
                                .addComponent(LabelValor1))
                            .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDataPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bttnBuscar))))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(LabelCompra)
                        .addGap(18, 18, 18)
                        .addComponent(LabelLocal)))
                .addContainerGap(193, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(LabelAluguelDeCarros)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(LabelRentDrive)
                        .addGap(101, 101, 101)
                        .addComponent(bttnAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(bttnCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(bttnCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(bttnLocais, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(LabelContato)
                        .addGap(34, 34, 34)
                        .addComponent(LabelAjuda)
                        .addGap(39, 39, 39)
                        .addComponent(LabelReservas)
                        .addGap(19, 19, 19))))
            .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelRentDrive)
                        .addComponent(bttnAluguel))
                    .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelContato)
                        .addComponent(LabelAjuda)
                        .addComponent(LabelReservas)
                        .addComponent(bttnLocais)
                        .addComponent(bttnCarros)
                        .addComponent(bttnCompra)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelAluguelDeCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LabelContatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelContatoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelContatoMouseClicked

    private void LabelAjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelAjudaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelAjudaMouseClicked

    private void LabelReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelReservasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelReservasMouseClicked

    private void bttnAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAluguelActionPerformed
        AluguelTela al = new AluguelTela();
        al.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttnAluguelActionPerformed

    private void bttnCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCarrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnCarrosActionPerformed

    private void bttnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCompraActionPerformed
        CompraTela ct = new CompraTela();
        ct.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttnCompraActionPerformed

    private void bttnLocaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnLocaisActionPerformed
        LocalTela lt = new LocalTela();
        lt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttnLocaisActionPerformed

    private void txtDataPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataPagamentoActionPerformed

    private void bttnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBuscarActionPerformed
        String tipo = (String) boxTipo.getSelectedItem();
        String dataString = txtDataPagamento.getText();
        String status = "PAGO";

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date data = sdf.parse(dataString);

            Pagamentos novoPagamento = new Pagamentos();
            novoPagamento.setTipo(tipo);
            novoPagamento.setStatus(status);
            novoPagamento.setData_pagamento(data);
            novoPagamento.setCliente_id(clienteIdP);
            novoPagamento.setVeiculo_id(veiculo);

            PagamentoDAO dao = new PagamentoDAO();
            dao.cadastrar(novoPagamento);

            Finalizado f = new Finalizado();
            f.setVisible(true);
            this.dispose();

        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Data incorreta.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bttnBuscarActionPerformed

    private void boxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxTipoActionPerformed

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
            java.util.logging.Logger.getLogger(PagamentoTelaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagamentoTelaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagamentoTelaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagamentoTelaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagamentoTelaCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelAjuda;
    private javax.swing.JLabel LabelAluguelDeCarros;
    private javax.swing.JLabel LabelCompra;
    private javax.swing.JLabel LabelContato;
    private javax.swing.JLabel LabelLocal;
    private javax.swing.JLabel LabelRentDrive;
    private javax.swing.JLabel LabelReservas;
    private javax.swing.JLabel LabelRetirada;
    private javax.swing.JLabel LabelRetirada3;
    private javax.swing.JLabel LabelValor;
    private javax.swing.JLabel LabelValor1;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JComboBox<String> boxTipo;
    private javax.swing.JButton bttnAluguel;
    private javax.swing.JButton bttnBuscar;
    private javax.swing.JButton bttnCarros;
    private javax.swing.JButton bttnCompra;
    private javax.swing.JButton bttnLocais;
    private javax.swing.JFormattedTextField txtDataPagamento;
    // End of variables declaration//GEN-END:variables
}
