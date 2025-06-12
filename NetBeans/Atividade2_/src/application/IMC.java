package application;

import javax.swing.JOptionPane;

public class IMC extends javax.swing.JFrame {

    public IMC() {
        initComponents();
    }
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IMCTitle = new javax.swing.JLabel();
        IMCPanel1 = new javax.swing.JPanel();
        ButtonCalcular = new javax.swing.JButton();
        TextFieldAltura = new javax.swing.JTextField();
        TextFieldPeso = new javax.swing.JTextField();
        LabelAltura = new javax.swing.JLabel();
        LabelPeso = new javax.swing.JLabel();
        IMCPanel2 = new javax.swing.JPanel();
        LabelResultado = new javax.swing.JLabel();
        LabelInterpretacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        IMCTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        IMCTitle.setText("Cálculo de IMC");

        IMCPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ButtonCalcular.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonCalcular.setText("Calcular");
        ButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCalcularActionPerformed(evt);
            }
        });

        TextFieldAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldAlturaActionPerformed(evt);
            }
        });

        LabelAltura.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        LabelAltura.setText("Altura (m):");

        LabelPeso.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        LabelPeso.setText("Peso  (kg):");

        javax.swing.GroupLayout IMCPanel1Layout = new javax.swing.GroupLayout(IMCPanel1);
        IMCPanel1.setLayout(IMCPanel1Layout);
        IMCPanel1Layout.setHorizontalGroup(
            IMCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IMCPanel1Layout.createSequentialGroup()
                .addGroup(IMCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(IMCPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonCalcular))
                    .addGroup(IMCPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(IMCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelPeso)
                            .addComponent(LabelAltura))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addGroup(IMCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(78, 78, 78))
        );
        IMCPanel1Layout.setVerticalGroup(
            IMCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IMCPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(IMCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IMCPanel1Layout.createSequentialGroup()
                        .addGroup(IMCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelAltura)
                            .addComponent(TextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(TextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LabelPeso, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonCalcular)
                .addContainerGap())
        );

        IMCPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LabelResultado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelResultado.setText("Resultado:");

        LabelInterpretacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelInterpretacao.setText("Interpretação:");

        javax.swing.GroupLayout IMCPanel2Layout = new javax.swing.GroupLayout(IMCPanel2);
        IMCPanel2.setLayout(IMCPanel2Layout);
        IMCPanel2Layout.setHorizontalGroup(
            IMCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IMCPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(IMCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelInterpretacao)
                    .addComponent(LabelResultado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        IMCPanel2Layout.setVerticalGroup(
            IMCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IMCPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(LabelResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelInterpretacao)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IMCTitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(IMCPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IMCPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IMCTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IMCPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IMCPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCalcularActionPerformed
        try {

            double altura = Double.parseDouble(TextFieldAltura.getText());
            double peso = Double.parseDouble(TextFieldPeso.getText());

            double imc = peso / (altura * altura);

            LabelResultado.setText("Resultado: " + String.format("%.2f", imc));
            if (imc < 18.5) {
                LabelInterpretacao.setText("Interpretação: Magreza");
            } else if (imc < 24.9) {
                LabelInterpretacao.setText("Interpretação: Normal");
            } else if (imc < 29.9) {
                LabelInterpretacao.setText("Interpretação: Sobrepeso");
            } else if (imc < 39.9) {
                LabelInterpretacao.setText("Interpretação: Obesidade");
            } else {
                LabelInterpretacao.setText("Interpretação: Obesidade Grave");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "[ERRO] Digite valores numéricos válidos.");
        }
    }//GEN-LAST:event_ButtonCalcularActionPerformed

    private void TextFieldAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldAlturaActionPerformed

    }//GEN-LAST:event_TextFieldAlturaActionPerformed

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
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IMC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCalcular;
    private javax.swing.JPanel IMCPanel1;
    private javax.swing.JPanel IMCPanel2;
    private javax.swing.JLabel IMCTitle;
    private javax.swing.JLabel LabelAltura;
    private javax.swing.JLabel LabelInterpretacao;
    private javax.swing.JLabel LabelPeso;
    private javax.swing.JLabel LabelResultado;
    private javax.swing.JTextField TextFieldAltura;
    private javax.swing.JTextField TextFieldPeso;
    // End of variables declaration//GEN-END:variables
}
