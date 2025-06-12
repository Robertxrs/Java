/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questaotres;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class QuestaoTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
    int gratuidades = 0;
    int meias = 0;
    double total= 0;
    String nome = "";

 
    Scanner res = new Scanner(System.in);
 
    System.out.println("Informe o valor padrao da diaria (R$)");
    double valorDiaria = res.nextDouble();
    res.nextLine();
 
    do{
        System.out.println("Informe o nome do hospede (ou digite PARE para encerrar): ");
        nome = res.nextLine();
    if (nome.equalsIgnoreCase("PARE")){
    break;
    
 }  System.out.println("Informe a idade do hospede: ");
    int idade = res.nextInt();        
    res.nextLine();

 

 
 
    if(idade < 4){
    System.out.println(nome+" possui gratuidade");
    gratuidades++;

   }else if(idade >80){
        total += valorDiaria /2; 
        System.out.println(nome+" paga meia");
 
        meias++;
 }
        else{
        System.out.println(nome+" paga inteira");
        total += valorDiaria;
    }   
        }while(!nome.equalsIgnoreCase("PARE"));
        System.out.println("Total de hospedagens: R$"+total+" ;"+ gratuidades+" gratuidade(s) ;"+meias+" meia(s)");

    }
    
}
