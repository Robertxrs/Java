/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.br.rentdrive.model.gui.view;

import com.br.rentdrive.model.dao.AluguelDAO;
import com.br.rentdrive.model.dao.ClienteDAO;
import com.br.rentdrive.model.dao.LocaisDAO;
import com.br.rentdrive.model.entities.Clientes;
import com.br.rentdrive.model.entities.contract.Aluguel;
import com.br.rentdrive.model.entities.contract.Locais;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AluguelTela extends javax.swing.JFrame {

    private Clientes clienteIdA;
    

    public AluguelTela() {
        initComponents();
        LocaisDAO locaisDao = new LocaisDAO();
        List<Locais> listaLocais = locaisDao.listar(-1, "", "", "", "");
        preencheTabela(listaLocais);
    }


    public AluguelTela(Clientes cliente) {
        initComponents();
        LocaisDAO locaisDao = new LocaisDAO();
        List<Locais> listaLocais = locaisDao.listar(-1, "", "", "", "");
        preencheTabela(listaLocais);
        this.clienteIdA = cliente;
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
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
        LabelFacaRetirada5 = new javax.swing.JLabel();
        LabelRetirada5 = new javax.swing.JLabel();
        LabelDevolucao5 = new javax.swing.JLabel();
        bttnBuscar5 = new javax.swing.JButton();
        bttnOk5 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        TabelaLocais = new javax.swing.JTable();
        txtLocal = new javax.swing.JTextField();
        LabelLocal10 = new javax.swing.JLabel();
        LabelLocal11 = new javax.swing.JLabel();
        dataDevolucao = new javax.swing.JTextField();
        dataRetirada = new javax.swing.JTextField();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Aluga");
        setBackground(new java.awt.Color(255, 153, 0));

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
                LabelContatoMouseClicked(evt);
            }
        });

        LabelAjuda5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        LabelAjuda5.setForeground(new java.awt.Color(255, 255, 255));
        LabelAjuda5.setText("Ajuda");
        LabelAjuda5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelAjudaMouseClicked(evt);
            }
        });

        LabelReservas5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        LabelReservas5.setForeground(new java.awt.Color(255, 255, 255));
        LabelReservas5.setText("Minhas reservas");
        LabelReservas5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelReservasMouseClicked(evt);
            }
        });

        bttnAluguel5.setBackground(new java.awt.Color(255, 102, 51));
        bttnAluguel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttnAluguel5.setForeground(new java.awt.Color(255, 255, 255));
        bttnAluguel5.setText("Aluguel");
        bttnAluguel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        bttnAluguel5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnAluguelActionPerformed(evt);
            }
        });

        bttnCarros5.setBackground(new java.awt.Color(255, 102, 51));
        bttnCarros5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttnCarros5.setForeground(new java.awt.Color(255, 255, 255));
        bttnCarros5.setText("Carros");
        bttnCarros5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        bttnCarros5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCarrosActionPerformed(evt);
            }
        });

        bttnCompra5.setBackground(new java.awt.Color(255, 102, 51));
        bttnCompra5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttnCompra5.setForeground(new java.awt.Color(255, 255, 255));
        bttnCompra5.setText("Compra");
        bttnCompra5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        bttnCompra5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCompraActionPerformed(evt);
            }
        });

        bttnLocais5.setBackground(new java.awt.Color(255, 102, 51));
        bttnLocais5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttnLocais5.setForeground(new java.awt.Color(255, 255, 255));
        bttnLocais5.setText("Locais de Retirada");
        bttnLocais5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        bttnLocais5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnLocaisActionPerformed(evt);
            }
        });

        Panel11.setBackground(new java.awt.Color(140, 44, 1));

        LabelAlugue.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        LabelAlugue.setForeground(new java.awt.Color(255, 255, 255));
        LabelAlugue.setText("ALUGUE SEU CARRO");

        LabelFacaRetirada5.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        LabelFacaRetirada5.setForeground(new java.awt.Color(255, 255, 255));
        LabelFacaRetirada5.setText("FAÇA SUA RETIRADA");

        LabelRetirada5.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        LabelRetirada5.setForeground(new java.awt.Color(255, 255, 255));
        LabelRetirada5.setText("Retirada");

        LabelDevolucao5.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        LabelDevolucao5.setForeground(new java.awt.Color(255, 255, 255));
        LabelDevolucao5.setText("Devolução");

        bttnBuscar5.setBackground(new java.awt.Color(255, 102, 51));
        bttnBuscar5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttnBuscar5.setForeground(new java.awt.Color(255, 255, 255));
        bttnBuscar5.setText("Buscar");
        bttnBuscar5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        bttnBuscar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBuscarActionPerformed(evt);
            }
        });

        bttnOk5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttnOk5.setText("Pesquisar");
        bttnOk5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnOkActionPerformed(evt);
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
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Endereco", "Cidade", "Estado"
            }
        ));
        jScrollPane7.setViewportView(TabelaLocais);

        txtLocal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalActionPerformed(evt);
            }
        });

        LabelLocal10.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        LabelLocal10.setForeground(new java.awt.Color(255, 255, 255));
        LabelLocal10.setText("Pesquise por nome do local:");

        LabelLocal11.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        LabelLocal11.setForeground(new java.awt.Color(255, 255, 255));
        LabelLocal11.setText("Local de Retirada");

        javax.swing.GroupLayout Panel11Layout = new javax.swing.GroupLayout(Panel11);
        Panel11.setLayout(Panel11Layout);
        Panel11Layout.setHorizontalGroup(
            Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel11Layout.createSequentialGroup()
                .addGroup(Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel11Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel11Layout.createSequentialGroup()
                                .addGap(274, 274, 274)
                                .addComponent(LabelLocal11)
                                .addGap(402, 402, 402)
                                .addComponent(LabelFacaRetirada5))
                            .addGroup(Panel11Layout.createSequentialGroup()
                                .addGroup(Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Panel11Layout.createSequentialGroup()
                                        .addComponent(LabelLocal10)
                                        .addGap(289, 289, 289)
                                        .addComponent(bttnOk5))
                                    .addGroup(Panel11Layout.createSequentialGroup()
                                        .addGap(260, 260, 260)
                                        .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Panel11Layout.createSequentialGroup()
                                        .addGap(114, 114, 114)
                                        .addComponent(LabelRetirada5)
                                        .addGap(128, 128, 128)
                                        .addComponent(LabelDevolucao5))
                                    .addGroup(Panel11Layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(dataRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(dataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(bttnBuscar5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(Panel11Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(LabelAlugue)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel11Layout.setVerticalGroup(
            Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel11Layout.createSequentialGroup()
                .addGroup(Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel11Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(LabelAlugue)
                        .addGap(86, 86, 86)
                        .addGroup(Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelLocal10)
                            .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttnOk5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelRetirada5)
                            .addComponent(LabelDevolucao5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bttnBuscar5)
                            .addGroup(Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(dataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dataRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(Panel11Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelLocal11)
                            .addComponent(LabelFacaRetirada5))
                        .addGap(105, 105, 105)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(98, 98, 98)
                        .addComponent(bttnCompra5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(bttnCarros5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
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
                        .addComponent(bttnAluguel5)
                        .addComponent(bttnCompra5)
                        .addComponent(bttnCarros5))
                    .addGroup(Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelContato5)
                        .addComponent(LabelAjuda5)
                        .addComponent(LabelReservas5)
                        .addComponent(bttnLocais5)))
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

    private void bttnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnOkActionPerformed
        String nome = txtLocal.getText();
        LocaisDAO locaisDao = new LocaisDAO();
        List<Locais> resultados = locaisDao.obterNome(nome);
        DefaultTableModel model = (DefaultTableModel) TabelaLocais.getModel();
        model.setRowCount(0);
        for (Locais local : resultados) {
            Object[] rowData = {local.getNome(), local.getEndereco(), local.getCidade(), local.getEstado()};
            model.addRow(rowData);
        }
    }//GEN-LAST:event_bttnOkActionPerformed

    private void bttnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBuscarActionPerformed
        String retiradaStg = dataRetirada.getText();
        String devolucaoStg = dataDevolucao.getText();

        try {
            java.util.Date retirada = new SimpleDateFormat("dd/MM/yyyy").parse(retiradaStg);
            java.util.Date devolucao = new SimpleDateFormat("dd/MM/yyyy").parse(devolucaoStg);

            Aluguel novoAluguel = new Aluguel();
            novoAluguel.setDataAluguel(retirada);
            novoAluguel.setDataDevolucao(devolucao);
            novoAluguel.setClienteId(clienteIdA);
            
           
            AluguelDAO daoA = new AluguelDAO();
            daoA.cadastrar(novoAluguel);

            AlugaVeiculo av = new AlugaVeiculo(novoAluguel);
            av.setVisible(true);
            this.dispose();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Ocorreu uma falha.");
        }


    }//GEN-LAST:event_bttnBuscarActionPerformed

    private void bttnLocaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnLocaisActionPerformed
        LocalTela lt = new LocalTela();
        lt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttnLocaisActionPerformed

    private void bttnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCompraActionPerformed
        CompraTela c = new CompraTela();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttnCompraActionPerformed

    private void bttnAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAluguelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnAluguelActionPerformed

    private void LabelReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelReservasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelReservasMouseClicked

    private void LabelAjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelAjudaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelAjudaMouseClicked

    private void LabelContatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelContatoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelContatoMouseClicked

    private void txtLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocalActionPerformed

    private void bttnCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCarrosActionPerformed
        VeiculoTela vt = new VeiculoTela();
        vt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttnCarrosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AluguelTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelAjuda5;
    private javax.swing.JLabel LabelAlugue;
    private javax.swing.JLabel LabelAluguelDeCarros5;
    private javax.swing.JLabel LabelContato5;
    private javax.swing.JLabel LabelDevolucao5;
    private javax.swing.JLabel LabelFacaRetirada5;
    private javax.swing.JLabel LabelLocal10;
    private javax.swing.JLabel LabelLocal11;
    private javax.swing.JLabel LabelRentDrive5;
    private javax.swing.JLabel LabelReservas5;
    private javax.swing.JLabel LabelRetirada5;
    private javax.swing.JPanel Panel11;
    private javax.swing.JPanel Panel12;
    private javax.swing.JTable TabelaLocais;
    private javax.swing.JButton bttnAluguel5;
    private javax.swing.JButton bttnBuscar5;
    private javax.swing.JButton bttnCarros5;
    private javax.swing.JButton bttnCompra5;
    private javax.swing.JButton bttnLocais5;
    private javax.swing.JButton bttnOk5;
    private javax.swing.JTextField dataDevolucao;
    private javax.swing.JTextField dataRetirada;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextField txtLocal;
    // End of variables declaration//GEN-END:variables
}
