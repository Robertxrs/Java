/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade1;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Questao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int convidados = 0;
    int inclua = 0;

    Scanner resposta = new Scanner (System.in); 

        System.out.println("Ola, Bem vindo ao Hotel: Family Home!");
        System.out.println("Quantos convidados para o Evento: ");
        convidados = resposta.nextInt();

    if(convidados < 0 || convidados > 350){
    System.out.println("[ERRO]Numero de convidados INVALIDO."); 
    }else if(convidados < 150){
    System.out.println("Devem usar o auditorio Alfa");
    }else if(convidados < 230){
    inclua = convidados - 150;    
    System.out.println("Use o auditorio Alfa e inclua mais "+inclua +" cadeiras");
    }else{
    System.out.println("Devem usar o auditorio Beta");     
 
} 
    }
    
}
