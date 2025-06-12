package model.dao.impl;


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
import java.text.SimpleDateFormat;
import model.dao.MovieDao;
import model.entities.Movie;

/**
 * Implementação do DAO (Data Access Object) para a entidade Movie utilizando
 * JDBC.
 */
public class MovieDaoJDBC implements MovieDao {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Connection conn;

    /**
     * Construtor que recebe uma conexão como parâmetro.
     *
     * @param conn A conexão com o banco de dados.
     */
    public MovieDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    /**
     * Busca um filme pelo seu ID.
     *
     * @param id O ID do filme a ser buscado.
     * @return O filme encontrado ou null se não encontrado.
     * @throws DbException Se ocorrer algum erro durante a busca.
     */
    @Override
    public Movie findById(Integer id) {
        try ( PreparedStatement ps = conn.prepareStatement("SELECT * FROM filmes WHERE id = ?")) {
            ps.setInt(1, id);
            try ( ResultSet rs = ps.executeQuery()) {
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

    /**
     * Retorna todos os filmes cadastrados.
     *
     * @return Uma lista contendo todos os filmes.
     * @throws DbException Se ocorrer algum erro durante a busca.
     */
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

    /**
     * Insere um novo filme no banco de dados.
     *
     * @param obj O filme a ser inserido.
     * @throws DbException Se ocorrer algum erro durante a inserção.
     */
    @Override
    public void insert(Movie obj) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "INSERT INTO filmes (nome, data_lancamento, categoria) VALUES (?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);

            st.setString(1, obj.getName());
            st.setDate(2, new java.sql.Date(obj.getReleaseDate().getTime()));
            st.setString(3, obj.getCategory());

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

    /**
     * Atualiza um filme no banco de dados.
     *
     * @param obj O filme a ser atualizado.
     * @throws DbException Se ocorrer algum erro durante a atualização.
     */
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

    /**
     * Deleta um filme do banco de dados pelo seu ID.
     *
     * @param id O ID do filme a ser deletado.
     * @throws DbIntegrityException Se o filme estiver associado a outras
     * entidades no banco de dados.
     * @throws DbException Se ocorrer algum erro durante a exclusão.
     */
    @Override
    public void deleteById(Integer id) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "DELETE FROM filmes WHERE id = ?");
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
    }

    /**
     * Busca filmes pelo nome da categoria.
     *
     * @param category A categoria dos filmes a serem buscados.
     * @return Uma lista de filmes com a categoria especificada.
     * @throws DbException Se ocorrer algum erro durante a busca.
     */
    @Override
    public List<Movie> findByCategory(String category) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                    "SELECT * FROM filmes WHERE categoria = ? ORDER BY nome");
            st.setString(1, category);
            rs = st.executeQuery();

            List<Movie> list = new ArrayList<>();

            while (rs.next()) {
                Movie obj = new Movie();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("nome"));
                obj.setReleaseDate(rs.getDate("data_lancamento"));
                obj.setCategory(category); // Defina a categoria para o objeto Movie
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

    /**
     * Busca filmes pelo nome.
     *
     * @param name o Nome dos filmes a serem buscados.
     * @return Uma lista de filmes com a nome especificada.
     * @throws DbException Se ocorrer algum erro durante a busca.
     */
    @Override
    public List<Movie> findByName(String name) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                    "SELECT * FROM filmes WHERE nome = ? ORDER BY nome");
            st.setString(1, name);
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

}
