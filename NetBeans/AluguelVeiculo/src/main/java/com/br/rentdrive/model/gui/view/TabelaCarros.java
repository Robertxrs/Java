/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.br.rentdrive.model.gui.view;

import com.br.rentdrive.model.dao.LocaisDAO;
import com.br.rentdrive.model.dao.VeiculoDAO;
import com.br.rentdrive.model.entities.Veiculos;
import com.br.rentdrive.model.entities.contract.Locais;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TabelaCarros extends javax.swing.JFrame {

    /**
     * Creates new form TabelaCarros
     */
    public TabelaCarros() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        Panel1 = new javax.swing.JPanel();
        LabelRentDrive = new javax.swing.JLabel();
        LabelAluguelDeCarros = new javax.swing.JLabel();
        LabelContato = new javax.swing.JLabel();
        LabelAjuda = new javax.swing.JLabel();
        bttnAluguel = new javax.swing.JButton();
        bttnCarros = new javax.swing.JButton();
        bttnCompra = new javax.swing.JButton();
        bttnLocais = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();
        jButtonConfirmar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaVeiculo = new javax.swing.JTable();
        bttnPagamento = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonCadastrar2 = new javax.swing.JButton();
        txtMarca = new javax.swing.JTextField();

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Marca", "Modelo", "Placa", "Ano", "Estado"
            }
        ));
        jScrollPane1.setViewportView(Tabela);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tabela de Carro");

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
        jLabelTitle.setText("Encontrar carros por modelo");

        jButtonConfirmar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonConfirmar.setText("Pesquisar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
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
                "Id", "Marca", "Modelo", "Placa", "Ano", "Estado", "Valor aluguel", "Valor"
            }
        ));
        jScrollPane2.setViewportView(TabelaVeiculo);

        bttnPagamento.setBackground(new java.awt.Color(255, 102, 51));
        bttnPagamento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttnPagamento.setForeground(new java.awt.Color(255, 255, 255));
        bttnPagamento.setText("Pagamento");
        bttnPagamento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        bttnPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnPagamentoActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonCadastrar2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonCadastrar2.setText("Cadastrar");
        jButtonCadastrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrar2ActionPerformed(evt);
            }
        });

        txtMarca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(LabelRentDrive)
                .addGap(64, 64, 64)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(bttnAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(bttnCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelTitle))
                .addGap(65, 65, 65)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(bttnCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(bttnLocais, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(bttnPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(LabelContato)
                        .addGap(59, 59, 59)
                        .addComponent(LabelAjuda)
                        .addGap(114, 114, 114))))
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(LabelAluguelDeCarros)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCadastrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelRentDrive)
                    .addComponent(bttnAluguel)
                    .addComponent(bttnCompra)
                    .addComponent(bttnCarros)
                    .addComponent(bttnLocais)
                    .addComponent(bttnPagamento)
                    .addComponent(LabelContato)
                    .addComponent(LabelAjuda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelAluguelDeCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmar)
                    .addComponent(jLabelTitle)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar2)
                    .addComponent(jButtonExcluir))
                .addContainerGap(53, Short.MAX_VALUE))
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

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        String marca = txtMarca.getText();
        VeiculoDAO veiculoDAO = new VeiculoDAO();
        List<Veiculos> resultados = veiculoDAO.obterMarca(marca);
        DefaultTableModel model = (DefaultTableModel) TabelaVeiculo.getModel();
        model.setRowCount(0);
        for (Veiculos veiculo : resultados) {
            Object[] rowData = {veiculo.getId(), veiculo.getMarca(), veiculo.getPlaca(), veiculo.getAno(), veiculo.getEstado(), veiculo.getValorAluguel(), veiculo.getValor()};
            model.addRow(rowData);
        }
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void bttnLocaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnLocaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnLocaisActionPerformed

    private void bttnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnCompraActionPerformed

    private void bttnCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCarrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnCarrosActionPerformed

    private void bttnAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAluguelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnAluguelActionPerformed

    private void LabelAjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelAjudaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelAjudaMouseClicked

    private void LabelContatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelContatoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelContatoMouseClicked

    private void bttnPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnPagamentoActionPerformed
        TabelaPagamento tp = new TabelaPagamento();
        tp.setVisible(true);
    }//GEN-LAST:event_bttnPagamentoActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        excluirSelecionado();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonCadastrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrar2ActionPerformed
        CadastroVeiculo cc = new CadastroVeiculo();
        cc.setVisible(true);
    }//GEN-LAST:event_jButtonCadastrar2ActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed
    private void excluirSelecionado() {
        int rowIndex = TabelaVeiculo.getSelectedRow();

        if (rowIndex != -1) {
            int veiculoId = Integer.parseInt(TabelaVeiculo.getValueAt(rowIndex, 0).toString());
            VeiculoDAO veiculoDao = new VeiculoDAO();
            veiculoDao.excluir(veiculoId);
            List<Veiculos> ListaCompra = veiculoDao.listar(-1, "", "", "", "", "", null, null);
            preencheTabela(ListaCompra);
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum Local selecionado.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

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
            java.util.logging.Logger.getLogger(TabelaCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelaCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelaCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelaCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaCarros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelAjuda;
    private javax.swing.JLabel LabelAluguelDeCarros;
    private javax.swing.JLabel LabelContato;
    private javax.swing.JLabel LabelRentDrive;
    private javax.swing.JPanel Panel1;
    private javax.swing.JTable Tabela;
    private javax.swing.JTable TabelaVeiculo;
    private javax.swing.JButton bttnAluguel;
    private javax.swing.JButton bttnCarros;
    private javax.swing.JButton bttnCompra;
    private javax.swing.JButton bttnLocais;
    private javax.swing.JButton bttnPagamento;
    private javax.swing.JButton jButtonCadastrar2;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtMarca;
    // End of variables declaration//GEN-END:variables
}
