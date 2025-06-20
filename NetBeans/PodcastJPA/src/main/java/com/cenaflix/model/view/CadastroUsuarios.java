package com.cenaflix.model.view;

import com.cenaflix.model.dao.UsuarioDAO;
import com.cenaflix.model.entities.Usuarios;
import javax.swing.JOptionPane;

public class CadastroUsuarios extends javax.swing.JFrame {

    public CadastroUsuarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUser = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelType = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        TxtUser = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        ComboBoxType = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelUser.setText("Usuario:");

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTitle.setText("Cadastro de Usuario");

        jLabelPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPassword.setText("Senha:");

        jLabelType.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelType.setText("Tipo:");

        jButtonCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        TxtUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TxtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUserActionPerformed(evt);
            }
        });

        Password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        ComboBoxType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ComboBoxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Administrador", "Operador" }));
        ComboBoxType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TxtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(Password)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelType)
                            .addComponent(jLabelUser)
                            .addComponent(jLabelPassword))
                        .addGap(57, 57, 57)
                        .addComponent(ComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jButtonCadastrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabelTitle)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelTitle)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUser)
                    .addComponent(TxtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelType)
                    .addComponent(ComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jButtonCadastrar)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTypeActionPerformed

    }//GEN-LAST:event_ComboBoxTypeActionPerformed

    private void TxtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUserActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        String login = TxtUser.getText();
        String senha = String.valueOf(Password.getPassword());
        String cargo = (String) ComboBoxType.getSelectedItem();

        try {
            Usuarios novoUsuario = new Usuarios(login, senha, cargo);
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuarioDAO.cadastrar(novoUsuario);
            JOptionPane.showMessageDialog(this, "Cadastro realizado!");
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha: \n" + e.getMessage());
        }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuarios().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxType;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField TxtUser;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelType;
    private javax.swing.JLabel jLabelUser;
    // End of variables declaration//GEN-END:variables
}
