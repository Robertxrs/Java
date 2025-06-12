package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement ps = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            conn = DB.getConnection();
            ps = conn.prepareStatement("INSERT INTO filmes(id,nome,data_lancamento,categoria) VALUES (?, ?, ?, ?)");
            ps.setInt(1, 2);
            ps.setString(2, "casamento as cegas");
            ps.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
            ps.setString(4, "romance");

            int rowsAffected = ps.executeUpdate();
            System.out.println("Done! Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(ps);
            DB.closeConnection();
        }

    }

}
