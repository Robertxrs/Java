package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Properties;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;

public class DB {

    
    /**
    * Classe utilitária para conexão com o banco de dados.
    */
    private static Connection conn = null;

    
     /**
     * Obtém a conexão com o banco de dados.
     * @return A conexão com o banco de dados.
     * @throws DbException Se ocorrer um erro ao conectar-se ao banco de dados.
     */
    public static Connection getConnection() {
        if (conn == null) {
            try {
                Properties props = loadProperties();
                String url = props.getProperty("dburl");
                conn = DriverManager.getConnection(url, props);
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
        return conn;
    }

    /**
    * Fecha a conexão com o banco de dados.
    * @throws DbException Se ocorrer um erro ao fechar a conexão.
    */
    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    /**
    * Fecha um Statement.
    * @param st O Statement a ser fechado.
    * @throws DbException Se ocorrer um erro ao fechar o Statement.
    */
    public static void closeStatement(Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    /**
    * Fecha um ResultSet.
    * @param rs O ResultSet a ser fechado.
    * @throws DbException Se ocorrer um erro ao fechar o ResultSet.
    */
    public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    private static Properties loadProperties() {
        try ( FileInputStream fs = new FileInputStream("db.properties")) {
            Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }
}
