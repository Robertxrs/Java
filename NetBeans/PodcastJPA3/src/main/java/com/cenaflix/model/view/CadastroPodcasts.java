/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.cenaflix.model.view;

import com.cenaflix.model.dao.PodcastDAO;

import com.cenaflix.model.entities.Podcast;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;


public class CadastroPodcasts extends javax.swing.JFrame {

    /**
     * Creates new form CadastroPodcasts
     */
    public CadastroPodcasts() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSubTitle = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jLabelProdutor = new javax.swing.JLabel();
        jButtonListagem = new javax.swing.JButton();
        jTextDuracao = new javax.swing.JTextField();
        jLabelDuracao = new javax.swing.JLabel();
        TxtProdutor = new javax.swing.JTextField();
        jTextUrl = new javax.swing.JTextField();
        jLabelUrl = new javax.swing.JLabel();
        jLabelNep = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jTextNep = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNomeEp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelSubTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSubTitle.setText("CADASTRAR PODCAST");

        jButtonCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jLabelProdutor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelProdutor.setText("Produtor");

        jButtonListagem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonListagem.setText("Ver Listagem");
        jButtonListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListagemActionPerformed(evt);
            }
        });

        jTextDuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDuracaoActionPerformed(evt);
            }
        });

        jLabelDuracao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDuracao.setText("Duracao");

        TxtProdutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtProdutorActionPerformed(evt);
            }
        });

        jLabelUrl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelUrl.setText("Url");

        jLabelNep.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNep.setText(" Nº do Episódio");

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitle.setText("CENAFLIX");

        jTextNep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNepActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nome do Episodio");

        jTextFieldNomeEp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeEpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabelTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelProdutor)
                                .addComponent(jLabelUrl)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelNep)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextNep))
                                .addComponent(jTextDuracao)
                                .addComponent(TxtProdutor)
                                .addComponent(jTextUrl)
                                .addComponent(jTextFieldNomeEp))
                            .addComponent(jLabelDuracao))))
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonListagem)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSubTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelProdutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtProdutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNomeEp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDuracao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextNep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUrl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonListagem)
                    .addComponent(jButtonCadastrar))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        String produtor = TxtProdutor.getText();
        String nomeEp = jTextFieldNomeEp.getText();
        String duracaoString = jTextDuracao.getText();
        int numero_episodio = Integer.parseInt(jTextNep.getText());
        String url = jTextUrl.getText();

        try {
            LocalTime duracao = LocalTime.parse(duracaoString, DateTimeFormatter.ofPattern("HH:mm"));
             
             Podcast novoPodcast = new Podcast();
             novoPodcast.setProdutor(produtor);
             novoPodcast.setNomeEpisodio(nomeEp);
             novoPodcast.setDuracao(duracao);
             novoPodcast.setNumero_episodio(numero_episodio);
             novoPodcast.setUrl(url);
             
             PodcastDAO podcastDAO = new PodcastDAO();
             podcastDAO.cadastrar(novoPodcast);       

            JOptionPane.showMessageDialog(this, "Cadastro realizado!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha: \n" + e.getMessage());
        }

    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListagemActionPerformed
        ListagemOperator lp = new ListagemOperator();
        lp.setVisible(true);
    }//GEN-LAST:event_jButtonListagemActionPerformed

    private void jTextDuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDuracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDuracaoActionPerformed

    private void TxtProdutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtProdutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtProdutorActionPerformed

    private void jTextNepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNepActionPerformed

    private void jTextFieldNomeEpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeEpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeEpActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroPodcasts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPodcasts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPodcasts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPodcasts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPodcasts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtProdutor;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonListagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDuracao;
    private javax.swing.JLabel jLabelNep;
    private javax.swing.JLabel jLabelProdutor;
    private javax.swing.JLabel jLabelSubTitle;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelUrl;
    private javax.swing.JTextField jTextDuracao;
    private javax.swing.JTextField jTextFieldNomeEp;
    private javax.swing.JTextField jTextNep;
    private javax.swing.JTextField jTextUrl;
    // End of variables declaration//GEN-END:variables
}
