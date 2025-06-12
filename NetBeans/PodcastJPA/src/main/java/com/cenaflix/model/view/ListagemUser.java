package com.cenaflix.model.view;

import com.cenaflix.model.dao.PodcastDAO;
import com.cenaflix.model.entities.Podcast;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ListagemUser extends javax.swing.JFrame {

    public ListagemUser() {
        initComponents();
        PodcastDAO podcastDao = new PodcastDAO();
        List<Podcast> ListaPodcast = podcastDao.listar("", "", -1, "", "");
        preencheTabela(ListaPodcast);
    }
    
    public void preencheTabela(List<Podcast> podcast) {
        String[] columns = {"ID", "Produtor", "Nome do Episodio", "Nº do Episódio", "Duração", "URL do Repo"};
        String[][] dados = new String[podcast.size()][columns.length];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        int i = 0;
        for (Podcast p : podcast) {
            dados[i] = new String[]{
                String.valueOf(p.getId()),
                p.getProdutor(),
                p.getEpisodio(),
                String.valueOf(p.getNumeroEpisodio()),
                p.getDuracao().format(formatter),
                p.getUrl()
            };
            i++;
        }
        DefaultTableModel model = new DefaultTableModel(dados, columns);
        tabelaListagem.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitle = new javax.swing.JLabel();
        labelListagem = new javax.swing.JLabel();
        labelProdutor = new javax.swing.JLabel();
        txtProdutor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaListagem = new javax.swing.JTable();
        jButtonPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTitle.setText("CENAFLIX");

        labelListagem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelListagem.setText("LISTAGEM");

        labelProdutor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelProdutor.setText("Pesquisar podcast pro produtor");

        txtProdutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutorActionPerformed(evt);
            }
        });

        tabelaListagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Produtor", "Nome do Episódio", " Nº do Episódio", "Duração", "URL do Repo"
            }
        ));
        jScrollPane1.setViewportView(tabelaListagem);

        jButtonPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelProdutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProdutor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTitle)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(labelListagem)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelListagem)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProdutor)
                    .addComponent(txtProdutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonPesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProdutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdutorActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        String produtor = txtProdutor.getText();
        PodcastDAO podcastDao = new PodcastDAO();
        List<Podcast> resultados = podcastDao.obterPorProdutor(produtor);
        DefaultTableModel model = (DefaultTableModel) tabelaListagem.getModel();
        model.setRowCount(0);
        for (Podcast podcast : resultados) {
            Object[] rowData = {podcast.getId(), podcast.getProdutor(), podcast.getEpisodio(),podcast.getNumeroEpisodio(), podcast.getDuracao(),podcast.getUrl()};
            model.addRow(rowData);
        }          
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListagemUser().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelListagem;
    private javax.swing.JLabel labelProdutor;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JTable tabelaListagem;
    private javax.swing.JTextField txtProdutor;
    // End of variables declaration//GEN-END:variables
}
