package view;

import db.DbException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.dao.DaoFactory;
import model.dao.MovieDao;
import model.dao.impl.MovieDaoJDBC;
import model.entities.Movie;

public class FindBy extends javax.swing.JFrame {

    public FindBy() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxType = new javax.swing.JComboBox<>();
        jLabelFind = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jButtonConfirmar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBoxType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Categoria", "Todos", "Nome" }));

        jLabelFind.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelFind.setText("Procurar por :");

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelTitle.setText("Encontrar filmes");

        jButtonConfirmar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Data de lançamento", "Categoria"
            }
        ));
        jScrollPane1.setViewportView(Tabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelFind)
                .addGap(36, 36, 36)
                .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jButtonConfirmar)
                .addGap(32, 32, 32))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabelTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFind)
                    .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConfirmar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     /**
     * Realiza a busca de filmes de acordo com o critério selecionado pelo usuário.
     * 
     * @param evt O evento de ação que disparou a busca.
     */
    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed

        String criteria = jComboBoxType.getSelectedItem().toString();
        if (criteria.equals("Id")) {
            int id = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite o Id a ser procurado:"));
            FindMovieById(id);
        } else if (criteria.equals("Nome")) {
            String nome = JOptionPane.showInputDialog(this, "Digite o Nome a ser procurado:");
            FindMovieByName(nome);
        } else if (criteria.equals("Categoria")) {
            String categoria = JOptionPane.showInputDialog(this, "Digite a Categoria a ser procurada:");
            FindMovieByCategory(categoria);
        } else if (criteria.equals("Todos")) {
            FindMovieByAll();
        }
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    /**
     * Realiza a busca de um filme pelo ID.
     * 
     * @param id O ID do filme a ser buscado.
     */
    private void FindMovieById(int id) {
        try {
            MovieDao movieDao = DaoFactory.createMovieDao();
            Movie movie = movieDao.findById(id);
            if (movie != null) {
                DefaultTableModel model = (DefaultTableModel) Tabela.getModel();
                model.setRowCount(0);
                Object[] rowData = {movie.getId(), movie.getName(), movie.getReleaseDate(), movie.getCategory()};
                model.addRow(rowData);
            } else {
                JOptionPane.showMessageDialog(this, "Filme não encontrado.");
            }
        } catch (DbException e) {
            JOptionPane.showMessageDialog(this, "Erro ao buscar filme: " + e.getMessage());
        }
    }
     
    /**
     * Realiza a busca de filmes pelo nome.
     * 
     * @param nome O nome do filme a ser buscado.
     */
    private void FindMovieByName(String nome) {
        try {
            MovieDao movieDao = DaoFactory.createMovieDao();
            List<Movie> movies = movieDao.findByName(nome);
            if (!movies.isEmpty()) {
                DefaultTableModel model = (DefaultTableModel) Tabela.getModel();
                model.setRowCount(0);
                for (Movie movie : movies) {
                    Object[] rowData = {movie.getId(), movie.getName(), movie.getReleaseDate(), movie.getCategory()};
                    model.addRow(rowData);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Nenhum filme encontrado com o nome especificado.");
            }
        } catch (DbException e) {
            JOptionPane.showMessageDialog(this, "Erro ao buscar filmes por nome: " + e.getMessage());
        }
    }

     /**
     * Realiza a busca de filmes pela categoria.
     * 
     * @param categoria A categoria dos filmes a serem buscados.
     */
    private void FindMovieByCategory(String categoria) {
        try {
            MovieDao movieDao = DaoFactory.createMovieDao();
            List<Movie> movies = movieDao.findByCategory(categoria);
            if (!movies.isEmpty()) {
                DefaultTableModel model = (DefaultTableModel) Tabela.getModel();
                model.setRowCount(0);
                for (Movie movie : movies) {
                    Object[] rowData = {movie.getId(), movie.getName(), movie.getReleaseDate(), movie.getCategory()};
                    model.addRow(rowData);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Nenhum filme encontrado com a categoria especificada.");
            }
        } catch (DbException e) {
            JOptionPane.showMessageDialog(this, "Erro ao buscar filmes por categoria: " + e.getMessage());
        }
    }

    /**
     * Realiza a busca de todos os filmes.
     */
    private void FindMovieByAll() {
        try {
            MovieDao movieDao = DaoFactory.createMovieDao();
            List<Movie> movies = movieDao.findAll();

            if (!movies.isEmpty()) {
                DefaultTableModel model = (DefaultTableModel) Tabela.getModel();
                model.setRowCount(0);
                for (Movie movie : movies) {
                    Object[] rowData = {movie.getId(), movie.getName(), movie.getReleaseDate(), movie.getCategory()};
                    model.addRow(rowData);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Nenhum filme encontrado.");
            }
        } catch (DbException e) {
            JOptionPane.showMessageDialog(this, "Erro ao buscar filmes: " + e.getMessage());
        }
    }

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
            java.util.logging.Logger.getLogger(FindBy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FindBy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FindBy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FindBy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FindBy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JComboBox<String> jComboBoxType;
    private javax.swing.JLabel jLabelFind;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
