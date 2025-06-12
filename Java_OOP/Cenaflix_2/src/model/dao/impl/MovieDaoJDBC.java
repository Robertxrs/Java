package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import db.DB;
import db.DbException;
import db.DbIntegrityException;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import model.dao.MovieDao;
import model.entities.Movie;

public class MovieDaoJDBC implements MovieDao {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Connection conn;

    public MovieDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public Movie findById(Integer id) {
        try (PreparedStatement ps = conn.prepareStatement("SELECT * FROM filmes WHERE id = ?")) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    int movieId = rs.getInt("id");
                    String name = rs.getString("nome");
                    java.sql.Date releaseDate = rs.getDate("data_lancamento");
                    String category = rs.getString("categoria");

                    return new Movie(movieId, name, releaseDate, category);
                }
            }
        } catch (SQLException e) {
            throw new DbException("Error finding movie by ID: " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Movie> findAll() {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                    "SELECT * FROM filmes ORDER BY nome");
            rs = st.executeQuery();

            List<Movie> list = new ArrayList<>();

            while (rs.next()) {
                Movie obj = new Movie();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("nome"));
                obj.setReleaseDate(rs.getDate("data_lancamento"));
                obj.setCategory("categoria");
                list.add(obj);
            }
            return list;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    @Override
    public void insert(Movie obj) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "INSERT INTO filmes"
                    + "(nome) "
                    + "VALUES "
                    + "(?)",
                    Statement.RETURN_GENERATED_KEYS);

            st.setString(1, obj.getName());

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    obj.setId(id);
                }
            } else {
                throw new DbException("Unexpected error! No rows affected!");
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public void update(Movie obj) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "UPDATE filmes "
                    + "SET nome = ? "
                    + "WHERE id = ?");

            st.setString(1, obj.getName());
            st.setInt(2, obj.getId());

            st.executeUpdate();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public void deleteById(Integer id) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "DELETE FROM department WHERE id = ?");
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
    }

}
