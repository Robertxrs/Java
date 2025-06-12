/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.cenaflix.application;

import com.cenaflix.model.dao.UsuarioDAO;
import com.cenaflix.model.entities.Usuarios;

/**
 *
 * @author rober
 */
public class Program {

    public static void main(String[] args) {
        System.out.println("Hello World!");
   
    // Criando um usuário para teste
        Usuarios usuario = new Usuarios();
        usuario.setLogin("yuri");
        usuario.setSenha("senha");
        usuario.setCargo("Administrador");
        
        UsuarioDAO udao = new UsuarioDAO();
        udao.cadastrar(usuario);
        
    
    }    
}
