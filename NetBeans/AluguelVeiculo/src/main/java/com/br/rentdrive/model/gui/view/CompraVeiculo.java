package com.br.rentdrive.model.gui.view;

import com.br.rentdrive.model.dao.CompraDAO;
import com.br.rentdrive.model.dao.VeiculoDAO;
import com.br.rentdrive.model.entities.Veiculos;
import com.br.rentdrive.model.entities.contract.Compras;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CompraVeiculo extends javax.swing.JFrame {

    private Compras compra;

    public CompraVeiculo() {
        initComponents();
        VeiculoDAO veiculoDao = new VeiculoDAO();
        List<Veiculos> listaVeiculo = veiculoDao.listar(-1, "", "", "", "", "", null, null);
        preencheTabela(listaVeiculo);
    }

    public CompraVeiculo(Compras compra) {
        initComponents();
        this.compra = compra;
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
        LabelAlugue = new javax.swing.JLabel();
        bttnConfirmar = new javax.swing.JButton();
        bttnOk5 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        TabelaVeiculo = new javax.swing.JTable();
        txtMarca = new javax.swing.JTextField();
        LabelLocal10 = new javax.swing.JLabel();
        LabelLocal11 = new javax.swing.JLabel();
        LabelAlugue1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Comprar veiculo");

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

        LabelAlugue.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        LabelAlugue.setForeground(new java.awt.Color(255, 255, 255));
        LabelAlugue.setText("Confirme para ir ao pagamento");

        bttnConfirmar.setBackground(new java.awt.Color(255, 102, 51));
        bttnConfirmar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        bttnConfirmar.setText("Confirmar");
        bttnConfirmar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        bttnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnConfirmarbttnBuscarActionPerformed(evt);
            }
        });

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

        LabelLocal11.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        LabelLocal11.setForeground(new java.awt.Color(255, 255, 255));
        LabelLocal11.setText("Compre o veiculo");

        LabelAlugue1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        LabelAlugue1.setForeground(new java.awt.Color(255, 255, 255));
        LabelAlugue1.setText("Escolha seu carro");

        javax.swing.GroupLayout Panel11Layout = new javax.swing.GroupLayout(Panel11);
        Panel11.setLayout(Panel11Layout);
        Panel11Layout.setHorizontalGroup(
            Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel11Layout.createSequentialGroup()
                        .addGroup(Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel11Layout.createSequentialGroup()
                                .addComponent(LabelLocal10)
                                .addGap(289, 289, 289)
                                .addComponent(bttnOk5))
                            .addGroup(Panel11Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel11Layout.createSequentialGroup()
                                .addGap(274, 274, 274)
                                .addComponent(LabelLocal11))
                            .addGroup(Panel11Layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addComponent(LabelAlugue1)))
                        .addGap(161, 161, 161)
                        .addGroup(Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelAlugue)
                            .addComponent(bttnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        Panel11Layout.setVerticalGroup(
            Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel11Layout.createSequentialGroup()
                .addGroup(Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel11Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(LabelAlugue1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelLocal11))
                    .addGroup(Panel11Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(LabelAlugue)
                        .addGap(63, 63, 63)
                        .addGroup(Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelLocal10)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttnOk5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttnConfirmar))))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttnCompra5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(bttnCarros5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(bttnLocais5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
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
                        .addComponent(bttnAluguel5))
                    .addGroup(Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelContato5)
                        .addComponent(LabelAjuda5)
                        .addComponent(LabelReservas5)
                        .addComponent(bttnLocais5)
                        .addComponent(bttnCarros5)
                        .addComponent(bttnCompra5)))
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
        VeiculoTela tc = new VeiculoTela();
        tc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttnCarros5bttnCarrosActionPerformed

    private void bttnCompra5bttnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCompra5bttnCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnCompra5bttnCompraActionPerformed

    private void bttnLocais5bttnLocaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnLocais5bttnLocaisActionPerformed
        LocalTela tl = new LocalTela();
        tl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttnLocais5bttnLocaisActionPerformed

    private void bttnConfirmarbttnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnConfirmarbttnBuscarActionPerformed
        int rowIndex = TabelaVeiculo.getSelectedRow();
        if (rowIndex != -1) {
            Object valorObj = TabelaVeiculo.getValueAt(rowIndex, 7);
            Object veiculoIdObj = TabelaVeiculo.getValueAt(rowIndex, 0);
            if (valorObj != null || veiculoIdObj != null) {
                double valorVeiculo = Double.parseDouble(valorObj.toString());
                Integer veiculoId = Integer.parseInt(veiculoIdObj.toString());

                VeiculoDAO veiculoDAO = new VeiculoDAO();
                Veiculos veiculoI = veiculoDAO.obter(veiculoId);

                atualizarCompra(veiculoI, valorVeiculo);

                PagamentoTelaCompra ptc = new PagamentoTelaCompra(valorVeiculo, veiculoI);
                ptc.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Valor do veículo não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum veículo selecionado.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_bttnConfirmarbttnBuscarActionPerformed

    private void atualizarCompra(Veiculos veiculo, Double valor) {
        if (compra != null) {
            if (compra.getId() != null) {
                if (valor != null && valor != 0) {
                    compra.setVeiculoId(veiculo);
                    compra.setValor(valor);
                    CompraDAO compraDAO = new CompraDAO();
                    try {
                        compraDAO.atualizar(compra);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Erro ao progredir na compra: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Valor da compra inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "ID da compra não pode ser nulo.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Compra não encontrada.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }


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
            java.util.logging.Logger.getLogger(CompraVeiculo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompraVeiculo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompraVeiculo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompraVeiculo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompraVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelAjuda5;
    private javax.swing.JLabel LabelAlugue;
    private javax.swing.JLabel LabelAlugue1;
    private javax.swing.JLabel LabelAluguelDeCarros5;
    private javax.swing.JLabel LabelContato5;
    private javax.swing.JLabel LabelLocal10;
    private javax.swing.JLabel LabelLocal11;
    private javax.swing.JLabel LabelRentDrive5;
    private javax.swing.JLabel LabelReservas5;
    private javax.swing.JPanel Panel11;
    private javax.swing.JPanel Panel12;
    private javax.swing.JTable TabelaVeiculo;
    private javax.swing.JButton bttnAluguel5;
    private javax.swing.JButton bttnCarros5;
    private javax.swing.JButton bttnCompra5;
    private javax.swing.JButton bttnConfirmar;
    private javax.swing.JButton bttnLocais5;
    private javax.swing.JButton bttnOk5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextField txtMarca;
    // End of variables declaration//GEN-END:variables
}
