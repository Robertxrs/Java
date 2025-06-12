/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.br.rentdrive.model.gui.view;

import com.br.rentdrive.model.dao.ClienteDAO;
import com.br.rentdrive.model.entities.Clientes;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelConta1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        TitleRent = new javax.swing.JLabel();
        LabelLogin = new javax.swing.JLabel();
        LabelSenha = new javax.swing.JLabel();
        TxtLogin = new javax.swing.JTextField();
        bttLogin = new javax.swing.JButton();
        TxtSenha = new javax.swing.JPasswordField();
        LinkCadastro = new javax.swing.JLabel();
        LabelConta = new javax.swing.JLabel();
        LabelConta2 = new javax.swing.JLabel();
        LinkCadastro1 = new javax.swing.JLabel();

        LabelConta1.setText("Não possui uma conta?");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 102, 0));

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        TitleRent.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        TitleRent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleRent.setText("RentDrive");

        LabelLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelLogin.setText("Login:");

        LabelSenha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelSenha.setText("Senha:");

        TxtLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        bttLogin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        bttLogin.setText("LOGIN");
        bttLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttLoginActionPerformed(evt);
            }
        });

        TxtSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        LinkCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LinkCadastro.setForeground(new java.awt.Color(0, 51, 204));
        LinkCadastro.setText("C̲r̲i̲a̲r̲ ̲n̲o̲v̲a̲ ̲c̲o̲n̲t̲a̲");
        LinkCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LinkCadastroMouseClicked(evt);
            }
        });

        LabelConta.setText("Não possui uma conta?");

        LabelConta2.setText("Funcionario");

        LinkCadastro1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LinkCadastro1.setForeground(new java.awt.Color(0, 51, 204));
        LinkCadastro1.setText("Clique aqui");
        LinkCadastro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LinkCadastro1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TitleRent)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelConta2)
                    .addComponent(LinkCadastro1))
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelLogin)
                        .addGap(36, 36, 36)
                        .addComponent(TxtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(TxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(bttLogin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(LabelConta))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(LinkCadastro)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelConta2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitleRent)
                    .addComponent(LinkCadastro1))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelLogin)
                    .addComponent(TxtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSenha))
                .addGap(18, 18, 18)
                .addComponent(bttLogin)
                .addGap(26, 26, 26)
                .addComponent(LabelConta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LinkCadastro)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LinkCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LinkCadastroMouseClicked
        CadastroUsuario causer = new CadastroUsuario();
        causer.setVisible(true);
    }//GEN-LAST:event_LinkCadastroMouseClicked

    private void bttLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttLoginActionPerformed
        String login = TxtLogin.getText();
        String senha = String.valueOf(TxtSenha.getPassword());

        try {
            if (login.isEmpty() || senha.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Login ou senha incorretos ou não preenchidos.");
                return;
            }
            ClienteDAO clienteDAO = new ClienteDAO();
            Clientes cliente = clienteDAO.obterLogin(login);

            if (cliente == null) {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
                return;
            }
            if (!cliente.getSenha().equals(senha)) {
                JOptionPane.showMessageDialog(null, "Senha incorreta.");
                return;
            }
            AluguelTela at = new AluguelTela(cliente);
            CompraTela ct = new CompraTela(cliente);
            PagamentoTela pt = new PagamentoTela(cliente);
            PagamentoTelaCompra cpt = new PagamentoTelaCompra(cliente);
            at.setVisible(true);
            this.dispose();


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_bttLoginActionPerformed

    private void LinkCadastro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LinkCadastro1MouseClicked
        LoginFuncionario lf = new LoginFuncionario();
        lf.setVisible(true);
    }//GEN-LAST:event_LinkCadastro1MouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelConta;
    private javax.swing.JLabel LabelConta1;
    private javax.swing.JLabel LabelConta2;
    private javax.swing.JLabel LabelLogin;
    private javax.swing.JLabel LabelSenha;
    private javax.swing.JLabel LinkCadastro;
    private javax.swing.JLabel LinkCadastro1;
    private javax.swing.JLabel TitleRent;
    private javax.swing.JTextField TxtLogin;
    private javax.swing.JPasswordField TxtSenha;
    private javax.swing.JButton bttLogin;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
