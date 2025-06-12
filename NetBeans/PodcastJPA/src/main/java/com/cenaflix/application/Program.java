package com.cenaflix.application;

import com.cenaflix.model.dao.PodcastDAO;
import com.cenaflix.model.dao.UsuarioDAO;
import com.cenaflix.model.entities.Podcast;
import com.cenaflix.model.entities.Usuarios;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.time.LocalTime;

public class Program {

    public static void main(String[] args) {
        /*
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pod");         
       
        Podcast novoPodcast = new Podcast("Matheus", "Episodio Teste", 1, LocalTime.of(1, 30), "http://example.com/podcast");
        PodcastDAO dao = new PodcastDAO();
        dao.cadastrar(novoPodcast);
        System.out.println("Podcast cadastrado com sucesso!");
               
        Usuarios novoUsuario = new Usuarios("Matheusds" , "123456m","Usuario");
        UsuarioDAO dao = new UsuarioDAO();
        dao.cadastrar(novoUsuario);
        System.out.println("Usuario cadastrado com sucesso!");

        emf.close();
         */
    }

}
