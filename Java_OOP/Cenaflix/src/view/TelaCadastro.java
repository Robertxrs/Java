package view;

import java.sql.Connection;
import db.DB;
import db.model.Filme;
import db.model.FilmeDao;
import db.model.FilmeDaoImpl;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class TelaCadastro extends javax.swing.JFrame {

    private final FilmeDao filmeDao;

    public TelaCadastro() {
        initComponents();
        Connection conn = DB.getConnection();
        filmeDao = new FilmeDaoImpl(conn);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        Subtitle = new javax.swing.JLabel();
        NameMovie = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        Category = new javax.swing.JLabel();
        TextFilme = new javax.swing.JTextField();
        TextData = new javax.swing.JTextField();
        TextCategoria = new javax.swing.JTextField();
        ButtonCadastrar = new javax.swing.JButton();
        ButtonLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        title.setBackground(new java.awt.Color(204, 204, 204));
        title.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("CENAFLIX");
        title.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Subtitle.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        Subtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Subtitle.setText("CADASTRO DE FILME");
        Subtitle.setToolTipText("");
        Subtitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        NameMovie.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NameMovie.setText("Nome do Filme:");

        Date.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Date.setText("Data de Lançamento:");

        Category.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Category.setText("Categoria:");

        TextFilme.setBackground(new java.awt.Color(204, 204, 204));
        TextFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFilmeActionPerformed(evt);
            }
        });

        TextData.setBackground(new java.awt.Color(204, 204, 204));
        TextData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextDataActionPerformed(evt);
            }
        });

        TextCategoria.setBackground(new java.awt.Color(204, 204, 204));
        TextCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCategoriaActionPerformed(evt);
            }
        });

        ButtonCadastrar.setBackground(new java.awt.Color(204, 204, 204));
        ButtonCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonCadastrar.setText("CADASTRAR");
        ButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCadastrarActionPerformed(evt);
            }
        });

        ButtonLimpar.setBackground(new java.awt.Color(204, 204, 204));
        ButtonLimpar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonLimpar.setText("LIMPAR");
        ButtonLimpar.setActionCommand("");
        ButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimparActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(122, 122, 122));
        jLabel1.setText("ex: 01/01/2000 *");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(Subtitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameMovie)
                            .addComponent(Date)
                            .addComponent(Category))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextCategoria)
                            .addComponent(TextData, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(TextFilme)
                            .addComponent(jLabel1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(ButtonCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(ButtonLimpar)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Subtitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameMovie)
                    .addComponent(TextFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Date)
                    .addComponent(TextData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Category)
                    .addComponent(TextCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCadastrar)
                    .addComponent(ButtonLimpar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFilmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFilmeActionPerformed

    private void TextDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextDataActionPerformed

    private void TextCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCategoriaActionPerformed

    private void ButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCadastrarActionPerformed
        // TODO add your handling code here:
        String nome = TextFilme.getText();
        String dataString = TextData.getText();
        String categoria = TextCategoria.getText();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dataLancamento = sdf.parse(dataString);
            Filme filme = new Filme(0, nome, dataLancamento, categoria);
            filmeDao.cadastrar(filme);
            JOptionPane.showMessageDialog(this, "Filme cadastrado com sucesso!");
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Erro ao converter data: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_ButtonCadastrarActionPerformed

    private void ButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparActionPerformed
        // TODO add your handling code here:
        TextFilme.setText("");
        TextData.setText("");
        TextCategoria.setText("");
    }//GEN-LAST:event_ButtonLimparActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCadastrar;
    private javax.swing.JButton ButtonLimpar;
    private javax.swing.JLabel Category;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel NameMovie;
    private javax.swing.JLabel Subtitle;
    private javax.swing.JTextField TextCategoria;
    private javax.swing.JTextField TextData;
    private javax.swing.JTextField TextFilme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
