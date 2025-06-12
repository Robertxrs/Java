package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import db.DB;
import db.model.Filme;
import db.model.FilmeDao;
import db.model.FilmeDaoImpl;

public class Program {

    public static void main(String[] args) {

        Connection conn = null;
        try {
            conn = DB.getConnection();
            FilmeDao filmeDao = new FilmeDaoImpl(conn);

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Filme filme = new Filme(0, "3 Porquinhos", sdf.parse("22/04/2000"), "Infantil");

            filmeDao.cadastrar(filme);
        } catch (ParseException e) {
            System.err.println("Erro ao converter data: " + e.getMessage());
        } finally {
            DB.closeConnection();
        }
    }

}
