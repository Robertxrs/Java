package application;

public class Program extends javax.swing.JFrame {

    public Program() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFirst = new javax.swing.JPanel();
        ButtonIMC = new javax.swing.JButton();
        ButtonGC = new javax.swing.JButton();
        ButtonR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NutriSoft");
        setName("First"); // NOI18N

        PanelFirst.setToolTipText("");
        PanelFirst.setName(""); // NOI18N

        ButtonIMC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonIMC.setText("IMC");
        ButtonIMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIMCActionPerformed(evt);
            }
        });

        ButtonGC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonGC.setText("Gasto Calórico");
        ButtonGC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGCActionPerformed(evt);
            }
        });

        ButtonR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonR.setText("Recomendações");
        ButtonR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelFirstLayout = new javax.swing.GroupLayout(PanelFirst);
        PanelFirst.setLayout(PanelFirstLayout);
        PanelFirstLayout.setHorizontalGroup(
            PanelFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFirstLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(PanelFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonGC, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonR))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        PanelFirstLayout.setVerticalGroup(
            PanelFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFirstLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(ButtonIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(ButtonGC, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(ButtonR, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFirst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFirst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonIMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIMCActionPerformed
        IMC im = new IMC();
        im.setVisible(true);
    }//GEN-LAST:event_ButtonIMCActionPerformed

    private void ButtonGCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGCActionPerformed
        GastoCalorico gc = new GastoCalorico();
        gc.setVisible(true);
    }//GEN-LAST:event_ButtonGCActionPerformed

    private void ButtonRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRActionPerformed
        Recomendacoes rec = new Recomendacoes();
        rec.setVisible(true);
    }//GEN-LAST:event_ButtonRActionPerformed

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
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Program().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonGC;
    private javax.swing.JButton ButtonIMC;
    private javax.swing.JButton ButtonR;
    private javax.swing.JPanel PanelFirst;
    // End of variables declaration//GEN-END:variables
}
