package application;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class GastoCalorico extends javax.swing.JFrame {

    public GastoCalorico() {
        initComponents();
        ButtonGroup grupoRadio = new ButtonGroup();
        grupoRadio.add(RadioButtonH);
        grupoRadio.add(RadioButtonM);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabalSubtitle = new javax.swing.JLabel();
        GCPanel1 = new javax.swing.JPanel();
        RadioButtonM = new javax.swing.JRadioButton();
        RadioButtonH = new javax.swing.JRadioButton();
        jLabelPeso = new javax.swing.JLabel();
        jLabelAltura = new javax.swing.JLabel();
        jLabelIdade = new javax.swing.JLabel();
        jLabelNivel = new javax.swing.JLabel();
        ComboBoxAtiv = new javax.swing.JComboBox<>();
        TextFieldA = new javax.swing.JTextField();
        TextFieldI = new javax.swing.JTextField();
        TextFieldP = new javax.swing.JTextField();
        ButtonCalcular1 = new javax.swing.JButton();
        GCPanel2 = new javax.swing.JPanel();
        LabelGastoB = new javax.swing.JLabel();
        LabelGastoT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gasto Calorico");

        LabalSubtitle.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        LabalSubtitle.setText("Calculo de Gasto Calorico");

        GCPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        RadioButtonM.setText("Mulher");
        RadioButtonM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonMActionPerformed(evt);
            }
        });

        RadioButtonH.setText("Homem");
        RadioButtonH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonHActionPerformed(evt);
            }
        });

        jLabelPeso.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabelPeso.setText("Peso(kg):");

        jLabelAltura.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabelAltura.setText("Altura:");

        jLabelIdade.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabelIdade.setText("Idade:");

        jLabelNivel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabelNivel.setText("Nivel de Atividade:");

        ComboBoxAtiv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedentario", "Leve", "Moderado", "Ativo", "Extremamente Ativo" }));
        ComboBoxAtiv.setToolTipText("");
        ComboBoxAtiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxAtivActionPerformed(evt);
            }
        });

        TextFieldA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldAActionPerformed(evt);
            }
        });

        TextFieldI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldIActionPerformed(evt);
            }
        });

        TextFieldP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldPActionPerformed(evt);
            }
        });

        ButtonCalcular1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonCalcular1.setText("Calcular");
        ButtonCalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCalcular1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GCPanel1Layout = new javax.swing.GroupLayout(GCPanel1);
        GCPanel1.setLayout(GCPanel1Layout);
        GCPanel1Layout.setHorizontalGroup(
            GCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GCPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(GCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GCPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNivel)
                        .addGap(18, 18, 18)
                        .addComponent(ComboBoxAtiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(GCPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelIdade)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextFieldI, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(GCPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelPeso)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                            .addComponent(TextFieldP, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(GCPanel1Layout.createSequentialGroup()
                            .addComponent(RadioButtonM)
                            .addGap(53, 53, 53)
                            .addComponent(RadioButtonH))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GCPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelAltura)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextFieldA, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GCPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonCalcular1)
                .addGap(46, 46, 46))
        );
        GCPanel1Layout.setVerticalGroup(
            GCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GCPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(GCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonM)
                    .addComponent(RadioButtonH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(GCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPeso))
                .addGap(18, 18, 18)
                .addGroup(GCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAltura)
                    .addComponent(TextFieldA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(GCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdade)
                    .addComponent(TextFieldI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(GCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNivel)
                    .addComponent(ComboBoxAtiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ButtonCalcular1)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        GCPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LabelGastoB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LabelGastoB.setText("Gasto Basal:");

        LabelGastoT.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LabelGastoT.setText("Gasto Total:");

        javax.swing.GroupLayout GCPanel2Layout = new javax.swing.GroupLayout(GCPanel2);
        GCPanel2.setLayout(GCPanel2Layout);
        GCPanel2Layout.setHorizontalGroup(
            GCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GCPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(GCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelGastoT)
                    .addComponent(LabelGastoB))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        GCPanel2Layout.setVerticalGroup(
            GCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GCPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(LabelGastoB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelGastoT)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GCPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabalSubtitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(GCPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(LabalSubtitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GCPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GCPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void RadioButtonMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonMActionPerformed

    }//GEN-LAST:event_RadioButtonMActionPerformed

    private void RadioButtonHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonHActionPerformed

    }//GEN-LAST:event_RadioButtonHActionPerformed

    private void ComboBoxAtivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxAtivActionPerformed

    }//GEN-LAST:event_ComboBoxAtivActionPerformed

    private void TextFieldAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldAActionPerformed

    }//GEN-LAST:event_TextFieldAActionPerformed

    private void TextFieldIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldIActionPerformed

    }//GEN-LAST:event_TextFieldIActionPerformed

    private void TextFieldPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldPActionPerformed

    }//GEN-LAST:event_TextFieldPActionPerformed

    private void ButtonCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCalcular1ActionPerformed
        try {
            double peso = Double.parseDouble(TextFieldP.getText());
            double altura = Double.parseDouble(TextFieldA.getText());
            int idade = Integer.parseInt(TextFieldI.getText());
            String nivelAtividade = (String) ComboBoxAtiv.getSelectedItem();

            double calBasal = 0;
            double calTotal = 0;

            if (RadioButtonH.isSelected()) {
                calBasal = 66 + (13.8 * peso) + (5 * altura) - (6.8 * idade);
            } else if (RadioButtonM.isSelected()) {
                calBasal = 665 + (9.6 * peso) + (1.9 * altura) - (4.7 * idade);
            }

            switch (nivelAtividade) {
                case "Sedentário":
                    calTotal = calBasal * 1.2;
                    break;
                case "Leve":
                    calTotal = calBasal * 1.375;
                    break;
                case "Moderado":
                    calTotal = calBasal * 1.55;
                    break;
                case "Ativo":
                    calTotal = calBasal * 1.725;
                    break;
                case "Extremamente Ativo":
                    calTotal = calBasal * 1.9;
                    break;
                default:

            }
            LabelGastoB.setText("Gasto Basal: " + String.format("%.2f", calBasal));
            LabelGastoT.setText("Gasto Total: " + String.format("%.2f", calTotal));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "[ERRO] Digite valores numéricos válidos.");
        }
    }//GEN-LAST:event_ButtonCalcular1ActionPerformed

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
            java.util.logging.Logger.getLogger(GastoCalorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GastoCalorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GastoCalorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GastoCalorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GastoCalorico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCalcular1;
    private javax.swing.JComboBox<String> ComboBoxAtiv;
    private javax.swing.JPanel GCPanel1;
    private javax.swing.JPanel GCPanel2;
    private javax.swing.JLabel LabalSubtitle;
    private javax.swing.JLabel LabelGastoB;
    private javax.swing.JLabel LabelGastoT;
    private javax.swing.JRadioButton RadioButtonH;
    private javax.swing.JRadioButton RadioButtonM;
    private javax.swing.JTextField TextFieldA;
    private javax.swing.JTextField TextFieldI;
    private javax.swing.JTextField TextFieldP;
    private javax.swing.JLabel jLabelAltura;
    private javax.swing.JLabel jLabelIdade;
    private javax.swing.JLabel jLabelNivel;
    private javax.swing.JLabel jLabelPeso;
    // End of variables declaration//GEN-END:variables
}
