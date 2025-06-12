package com.br.rentdrive.model.gui.view;

import com.br.rentdrive.model.dao.CompraDAO;
import com.br.rentdrive.model.dao.LocaisDAO;
import com.br.rentdrive.model.entities.Clientes;
import com.br.rentdrive.model.entities.contract.Compras;
import com.br.rentdrive.model.entities.contract.Locais;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CompraTela extends javax.swing.JFrame {

    private Clientes clienteIdC;

    public CompraTela() {
        initComponents();
        LocaisDAO locaisDao = new LocaisDAO();
        List<Locais> listaLocais = locaisDao.listar(-1, "", "", "", "");
        preencheTabela(listaLocais);
    }

    public CompraTela(Clientes cliente) {
        initComponents();
        LocaisDAO locaisDao = new LocaisDAO();
        List<Locais> listaLocais = locaisDao.listar(-1, "", "", "", "");
        preencheTabela(listaLocais);
        this.clienteIdC = cliente;
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

        dataRetirada1 = new javax.swing.JTextField();
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
        LabelFacaRetirada = new javax.swing.JLabel();
        bttnBuscar = new javax.swing.JButton();
        bttnOk = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaLocais = new javax.swing.JTable();
        dataRetirada = new javax.swing.JTextField();
        LabelLocal1 = new javax.swing.JLabel();
        txtLocal = new javax.swing.JTextField();
        LabelRetirada1 = new javax.swing.JLabel();
        LabelRetirada2 = new javax.swing.JLabel();

        dataRetirada1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dataRetirada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataRetirada1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Comprar");

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
        LabelCompra.setText("COMPRE SEU CARRO");

        LabelLocal.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        LabelLocal.setForeground(new java.awt.Color(255, 255, 255));
        LabelLocal.setText("Local de Retirada");

        LabelFacaRetirada.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        LabelFacaRetirada.setForeground(new java.awt.Color(255, 255, 255));
        LabelFacaRetirada.setText("FAÇA SUA RETIRADA");

        bttnBuscar.setBackground(new java.awt.Color(255, 102, 51));
        bttnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        bttnBuscar.setText("Buscar");
        bttnBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        bttnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBuscarActionPerformed(evt);
            }
        });

        bttnOk.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttnOk.setText("Pesquisar");
        bttnOk.addActionListener(new java.awt.event.ActionListener() {
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
        jScrollPane2.setViewportView(TabelaLocais);

        dataRetirada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dataRetirada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataRetiradaActionPerformed(evt);
            }
        });

        LabelLocal1.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        LabelLocal1.setForeground(new java.awt.Color(255, 255, 255));
        LabelLocal1.setText("Pesquise por nome do local:");

        txtLocal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalActionPerformed(evt);
            }
        });

        LabelRetirada1.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        LabelRetirada1.setForeground(new java.awt.Color(255, 255, 255));

        LabelRetirada2.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        LabelRetirada2.setForeground(new java.awt.Color(255, 255, 255));
        LabelRetirada2.setText("Retirada");

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(LabelLocal1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                                .addComponent(LabelLocal)
                                .addGap(323, 323, 323))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                                .addComponent(bttnOk)
                                .addGap(136, 136, 136)))
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelFacaRetirada)
                            .addGroup(Panel2Layout.createSequentialGroup()
                                .addComponent(dataRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(bttnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LabelRetirada1))
                        .addGap(319, 319, 319))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(LabelCompra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(305, 305, 305)
                    .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(948, Short.MAX_VALUE)))
            .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                    .addContainerGap(784, Short.MAX_VALUE)
                    .addComponent(LabelRetirada2)
                    .addGap(582, 582, 582)))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(LabelCompra)
                .addGap(18, 18, 18)
                .addComponent(LabelLocal)
                .addGap(21, 21, 21)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelFacaRetirada)
                    .addComponent(LabelLocal1))
                .addGap(47, 47, 47)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addComponent(LabelRetirada1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addComponent(bttnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(146, 146, 146)
                    .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(355, Short.MAX_VALUE)))
            .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(183, 183, 183)
                    .addComponent(LabelRetirada2)
                    .addContainerGap(326, Short.MAX_VALUE)))
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
                        .addGap(98, 98, 98)
                        .addComponent(bttnCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(bttnCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(bttnAluguel)
                        .addComponent(bttnCompra)
                        .addComponent(bttnCarros))
                    .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelContato)
                        .addComponent(LabelAjuda)
                        .addComponent(LabelReservas)
                        .addComponent(bttnLocais)))
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
        VeiculoTela tc = new VeiculoTela();
        tc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttnCarrosActionPerformed

    private void bttnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnCompraActionPerformed

    private void bttnLocaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnLocaisActionPerformed
        LocalTela tl = new LocalTela();
        tl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttnLocaisActionPerformed

    private void bttnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBuscarActionPerformed
        String retiradaStg = dataRetirada.getText();

        try {
            java.util.Date retirada = new SimpleDateFormat("dd/MM/yyyy").parse(retiradaStg);

            Compras novaCompra = new Compras();
            novaCompra.setDataRetirada(retirada);
            novaCompra.setClienteId(clienteIdC);

            CompraDAO daoC = new CompraDAO();
            daoC.cadastrar(novaCompra);

            CompraVeiculo ac = new CompraVeiculo(novaCompra);
            ac.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha.");
        }
    }//GEN-LAST:event_bttnBuscarActionPerformed

    private void bttnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnOkActionPerformed
        String nome = txtLocal.getText();
        LocaisDAO locaisDao = new LocaisDAO();
        List<Locais> resultados = locaisDao.obterNome(nome);
        DefaultTableModel model = (DefaultTableModel) TabelaLocais.getModel();
        model.setRowCount(0);
        for (Locais local : resultados) {
            Object[] rowData = {local.getId(), local.getNome(), local.getEndereco(), local.getCidade(), local.getEstado()};
            model.addRow(rowData);
        }
    }//GEN-LAST:event_bttnOkActionPerformed

    private void dataRetiradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataRetiradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataRetiradaActionPerformed

    private void txtLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocalActionPerformed

    private void dataRetirada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataRetirada1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataRetirada1ActionPerformed

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
            java.util.logging.Logger.getLogger(CompraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompraTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelAjuda;
    private javax.swing.JLabel LabelAluguelDeCarros;
    private javax.swing.JLabel LabelCompra;
    private javax.swing.JLabel LabelContato;
    private javax.swing.JLabel LabelFacaRetirada;
    private javax.swing.JLabel LabelLocal;
    private javax.swing.JLabel LabelLocal1;
    private javax.swing.JLabel LabelRentDrive;
    private javax.swing.JLabel LabelReservas;
    private javax.swing.JLabel LabelRetirada1;
    private javax.swing.JLabel LabelRetirada2;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JTable TabelaLocais;
    private javax.swing.JButton bttnAluguel;
    private javax.swing.JButton bttnBuscar;
    private javax.swing.JButton bttnCarros;
    private javax.swing.JButton bttnCompra;
    private javax.swing.JButton bttnLocais;
    private javax.swing.JButton bttnOk;
    private javax.swing.JTextField dataRetirada;
    private javax.swing.JTextField dataRetirada1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtLocal;
    // End of variables declaration//GEN-END:variables
}
