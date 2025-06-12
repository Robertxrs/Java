package model.dao;

import java.util.List;
import model.entities.Movie;

public interface MovieDao {
    
    void insert(Movie obj);
    void update(Movie obj);
    void deleteById(Integer id);
    Movie findById(Integer id);
    List<Movie>findAll();
    List<Movie>findByCategory(String category);
    List<Movie>findByName(String name);
}


