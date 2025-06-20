package db.model;

import db.DB;
import db.DbException;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class FilmeDaoImpl implements FilmeDao {

    private Connection conn;

    public FilmeDaoImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void cadastrar(Filme filme) {
        try (PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO filmes (id, nome, data_lancamento, categoria) VALUES (?, ?, ?, ?)")) {

            ps.setInt(1, filme.getId());
            ps.setString(2, filme.getNome());
            ps.setTimestamp(3, new java.sql.Timestamp(filme.getDataLancamento().getTime()));
            ps.setString(4, filme.getCategoria());

            ps.executeUpdate();
            System.out.println("Filme cadastrado com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao cadastrar filme: " + e.getMessage());
        }
    }

    @Override
    public Filme buscarPorId(int id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                    "SELECT * FROM filmes WHERE Id = ?");
            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                Filme obj = new Filme();
                obj.setId(rs.getInt("Id"));
                obj.setNome(rs.getString("Nome"));
                return obj;
            }
            return null;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    @Override
    public List<Filme> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void atualizar(Filme filme) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deletar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
