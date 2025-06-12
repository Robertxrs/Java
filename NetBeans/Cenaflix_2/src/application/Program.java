package application;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;
import model.dao.DaoFactory;
import model.dao.MovieDao;
import model.entities.Movie;

public class Program {

    public static void main(String[] args) throws ParseException {
  
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        MovieDao movieDao = DaoFactory.createMovieDao();

        
        System.out.println("\n=== TEST 1: insert =======");
        Movie newMovie = new Movie(4, "Os incriveis",sdf.parse("31/07/2010"), "Acao");
        movieDao.insert(newMovie);
        System.out.println("Inserted! New id: " + newMovie.getId());
        
        System.out.println("=== TEST 2: findById =======");
        Movie mov = movieDao.findById(2);
        System.out.println(mov);

        System.out.println("\n=== TEST 3: findAll =======");
        List<Movie> list = movieDao.findAll();
        for (Movie m : list) {
            System.out.println(m);
        }
        System.out.println("\n=== TEST 4: update =======");
        Movie dep2 = movieDao.findById(1);
        dep2.setName("Food");
        movieDao.update(dep2);
        System.out.println("Update completed");
        

        System.out.println("\n=== TEST 5: delete =======");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        movieDao.deleteById(id);
        System.out.println("Delete completed");
        sc.close();
  
        
    }

}
