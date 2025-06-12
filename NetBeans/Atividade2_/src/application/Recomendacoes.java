package application;

import javax.swing.JOptionPane;

public class Recomendacoes extends javax.swing.JFrame {

    public Recomendacoes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Subtitle = new javax.swing.JLabel();
        RPanel1 = new javax.swing.JPanel();
        LabelCalorias = new javax.swing.JLabel();
        ButtonCalcularR = new javax.swing.JButton();
        TextFieldCalorias = new javax.swing.JTextField();
        RPanel2 = new javax.swing.JPanel();
        LabelCarb = new javax.swing.JLabel();
        LabelProt = new javax.swing.JLabel();
        LabelGord = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Subtitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Subtitle.setText("Recomendações");

        RPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LabelCalorias.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LabelCalorias.setText("Calorias diarias (kcal):");

        ButtonCalcularR.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ButtonCalcularR.setText("Calcular");
        ButtonCalcularR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCalcularRActionPerformed(evt);
            }
        });

        TextFieldCalorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldCaloriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RPanel1Layout = new javax.swing.GroupLayout(RPanel1);
        RPanel1.setLayout(RPanel1Layout);
        RPanel1Layout.setHorizontalGroup(
            RPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RPanel1Layout.createSequentialGroup()
                .addGroup(RPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(RPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonCalcularR, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(LabelCalorias)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(TextFieldCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );
        RPanel1Layout.setVerticalGroup(
            RPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(RPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCalorias)
                    .addComponent(TextFieldCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(ButtonCalcularR)
                .addGap(25, 25, 25))
        );

        RPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LabelCarb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelCarb.setText("Carboidratos(50%):");

        LabelProt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelProt.setText("Proteina(25%):");

        LabelGord.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelGord.setText("Gordura(25%):");

        javax.swing.GroupLayout RPanel2Layout = new javax.swing.GroupLayout(RPanel2);
        RPanel2.setLayout(RPanel2Layout);
        RPanel2Layout.setHorizontalGroup(
            RPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(RPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelCarb)
                    .addGroup(RPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(LabelProt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelGord, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RPanel2Layout.setVerticalGroup(
            RPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelCarb)
                .addGap(18, 18, 18)
                .addComponent(LabelProt)
                .addGap(18, 18, 18)
                .addComponent(LabelGord))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Subtitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(RPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Subtitle)
                .addGap(2, 2, 2)
                .addComponent(RPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCalcularRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCalcularRActionPerformed
        try {

            double calorias = Double.parseDouble(TextFieldCalorias.getText());
            double carb = calorias * 0.5 / 4;
            double prot = calorias * 0.25 / 4;
            double gord = calorias * 0.25 / 9;

            LabelCarb.setText("Carboidratos(50%): " + String.format("%.2f", carb));
            LabelProt.setText("Proteina(25%): " + String.format("%.2f", prot));
            LabelGord.setText("Gordura(25%): " + String.format("%.2f", gord));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "[ERRO] Digite valores numéricos válidos.");
        }
    }//GEN-LAST:event_ButtonCalcularRActionPerformed

    private void TextFieldCaloriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCaloriasActionPerformed

    }//GEN-LAST:event_TextFieldCaloriasActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Recomendacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recomendacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recomendacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recomendacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recomendacoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCalcularR;
    private javax.swing.JLabel LabelCalorias;
    private javax.swing.JLabel LabelCarb;
    private javax.swing.JLabel LabelGord;
    private javax.swing.JLabel LabelProt;
    private javax.swing.JPanel RPanel1;
    private javax.swing.JPanel RPanel2;
    private javax.swing.JLabel Subtitle;
    private javax.swing.JTextField TextFieldCalorias;
    // End of variables declaration//GEN-END:variables
}
