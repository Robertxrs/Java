package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import db.DB;
import java.text.ParseException;
import java.text.SimpleDateFormat; 
public class Program {

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement ps = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
            conn = DB.getConnection();
            ps = conn.prepareStatement("INSERT INTO seller (Name, Email, BirthDate, BaseSalary, "
                    + "DepartmentId) VALUES (?, ?, ?, ?, ?)");
            ps.setString(1,"Carl Purple");
            ps.setString(2,"carl@gmail.com");
            ps.setDate(3,new java.sql.Date(sdf.parse("22/04/1985").getTime()));
            ps.setDouble(4, 3000.0);
            ps.setInt(5, 4);
            
            int rowsAffected = ps.executeUpdate();
            System.out.println("Done! rows affecte: "+ rowsAffected);
        }catch(SQLException e){
            e.printStackTrace();
        }catch(ParseException e){
            e.printStackTrace();
        }finally{
            DB.closeConnection();
            DB.closeStatement(ps);
    }
        
        
    }

}
