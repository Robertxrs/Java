/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questaodois;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class QuestaoDois {

    public static void main(String[] args) {
 
    Scanner res = new Scanner(System.in);
 
    
    System.out.println("Informe o nome do primeiro cliente: ");
    String nome1 = res.nextLine(); 
    System.out.println("Informe a idade do primeiro cliente: ");
    int idade1 = res.nextInt(); 
    res.nextLine(); 
    System.out.println("Informe o nome do segundo cliente: ");
    String nome2 = res.nextLine(); 
    System.out.println("Informe a idade do segundo cliente: ");
    int idade2 = res.nextInt(); 
    res.nextLine(); 
    String quartoMaisVelho = "A";
    String quartoMaisNovo = "B";

    int idadeMaisVelha = Math.max(idade1, idade2);
    boolean clienteMaisVelho = idadeMaisVelha >= 60;
    int desconto = clienteMaisVelho ? 40 : 0;
 
    if(idade1 < idade2){
    quartoMaisNovo = "A";
    quartoMaisVelho = "B";
   } 
        System.out.println("Quarto A " + (quartoMaisVelho == "A" ? nome1 : nome2) +
        (" com desconto de " + desconto + "%; Quarto B: ") +
        (quartoMaisNovo == "B" ? nome2 : nome1));

    }
}
