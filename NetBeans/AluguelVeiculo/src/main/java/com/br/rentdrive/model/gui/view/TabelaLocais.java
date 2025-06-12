/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.br.rentdrive.model.gui.view;

import com.br.rentdrive.model.dao.LocaisDAO;
import com.br.rentdrive.model.entities.contract.Compras;
import com.br.rentdrive.model.entities.contract.Locais;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TabelaLocais extends javax.swing.JFrame {

    /**
     * Creates new form TabelaLocais
     */
    public TabelaLocais() {
        initComponents();
        LocaisDAO locaisDao = new LocaisDAO();
        List<Locais> listaLocais = locaisDao.listar(-1, "", "", "", "");
        preencheTabela(listaLocais);
    }

    public void preencheTabela(List<Locais> local) {
        String[] columns = {"Id", "Nome", "Endereco", "Cidade", "Estado"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        for (Locais l : local) {
            Object[] rowData = {
                l.getId(),
                l.getNome(),
                l.getEndereco(),
                l.getCidade(),
                l.getEstado(),};
            model.addRow(rowData);
        }
        TabelaLocais.setModel(model);
    }

    private void excluirSelecionado() {
        int rowIndex = TabelaLocais.getSelectedRow();

        if (rowIndex != -1) {
            int locaisId = Integer.parseInt(TabelaLocais.getValueAt(rowIndex, 0).toString());
            LocaisDAO locaisDao = new LocaisDAO();
            locaisDao.excluir(locaisId);
            List<Locais> ListaLocais = locaisDao.listar(-1, "", "", "", "");
            preencheTabela(ListaLocais);
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum Local selecionado.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
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
        jLabelTitle = new javax.swing.JLabel();
        jButtonConfirmar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaLocais = new javax.swing.JTable();
        jButtonCadastrar1 = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        txtLocal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tabela de locais");

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

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setText("Encontrar locais por nome");

        jButtonConfirmar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonConfirmar.setText("Pesquisar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        TabelaLocais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Endereço", "Cidade", "Estado"
            }
        ));
        TabelaLocais.setToolTipText("");
        jScrollPane2.setViewportView(TabelaLocais);

        jButtonCadastrar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonCadastrar1.setText("Cadastrar");
        jButtonCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrar1ActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        txtLocal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalActionPerformed(evt);
            }
        });

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
                        .addContainerGap())
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(LabelRentDrive)
                        .addGap(38, 38, 38)
                        .addComponent(bttnAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttnCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(bttnCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(bttnLocais, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LabelContato)
                                .addGap(34, 34, 34)
                                .addComponent(LabelAjuda)
                                .addGap(39, 39, 39)
                                .addComponent(LabelReservas)
                                .addGap(19, 19, 19))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(jLabelTitle)
                        .addGap(57, 57, 57)
                        .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel1Layout.createSequentialGroup()
                            .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(151, 151, 151))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelRentDrive)
                        .addComponent(bttnAluguel)
                        .addComponent(bttnCompra)
                        .addComponent(bttnCarros)
                        .addComponent(bttnLocais))
                    .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelContato)
                        .addComponent(LabelAjuda)
                        .addComponent(LabelReservas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelAluguelDeCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmar)
                    .addComponent(jLabelTitle)
                    .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar1)
                    .addComponent(jButtonExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnAluguelActionPerformed

    private void bttnCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCarrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnCarrosActionPerformed

    private void bttnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnCompraActionPerformed

    private void bttnLocaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnLocaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnLocaisActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        String nome = txtLocal.getText();
        LocaisDAO locaisDao = new LocaisDAO();
        List<Locais> resultados = locaisDao.obterNome(nome);
        DefaultTableModel model = (DefaultTableModel) TabelaLocais.getModel();
        model.setRowCount(0);
        for (Locais local : resultados) {
            Object[] rowData = {local.getNome(), local.getEndereco(), local.getCidade(), local.getEstado()};
            model.addRow(rowData);
        }
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrar1ActionPerformed
        CadastroLocal cc = new CadastroLocal();
        cc.setVisible(true);
    }//GEN-LAST:event_jButtonCadastrar1ActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        excluirSelecionado();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void txtLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalActionPerformed
       
    }//GEN-LAST:event_txtLocalActionPerformed

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
            java.util.logging.Logger.getLogger(TabelaLocais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelaLocais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelaLocais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelaLocais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaLocais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelAjuda;
    private javax.swing.JLabel LabelAluguelDeCarros;
    private javax.swing.JLabel LabelContato;
    private javax.swing.JLabel LabelRentDrive;
    private javax.swing.JLabel LabelReservas;
    private javax.swing.JPanel Panel1;
    private javax.swing.JTable TabelaLocais;
    private javax.swing.JButton bttnAluguel;
    private javax.swing.JButton bttnCarros;
    private javax.swing.JButton bttnCompra;
    private javax.swing.JButton bttnLocais;
    private javax.swing.JButton jButtonCadastrar1;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtLocal;
    // End of variables declaration//GEN-END:variables
}
