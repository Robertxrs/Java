/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questaocinco;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class QuestaoCinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
            
 
    int numAndares = 4; 
    int numQuartos = 3;
    boolean[][] quartos = new boolean[numAndares][numQuartos];
    Scanner input = new Scanner(System.in);
 
    while (true) {
        System.out.println("Digite:");
        System.out.println("1 - Ocupar quarto");
        System.out.println("2 - Desocupar quarto");
        System.out.println("3 - Mostrar ocupação");
        System.out.println("4 - Sair");
        int opcao = input.nextInt();
 
    switch (opcao) {
 
    case 1:
 
        System.out.print("Digite o andar e o quarto (ex: 4 2): ");
        int andar = input.nextInt();
        int quarto = input.nextInt();
        if (validarQuarto(andar, quarto, numAndares, numQuartos) && !quartos[andar - 1][quarto - 1]) {

        quartos[andar - 1]
        [quarto - 1] = true;

        System.out.println("Quarto " + andar + "-" + quarto + " foi ocupado.");

        } else {
        System.out.println("Quarto inválido ou já ocupado. Tente novamente.");
        break;
 }
    case 2:
        System.out.print("Informe o andar e o quarto (ex: 2 3): ");
        andar = input.nextInt();
        quarto = input.nextInt();
 
        if (validarQuarto(andar, quarto, numAndares, numQuartos) && quartos[andar - 1][quarto - 1]) {
        quartos[andar - 1]
        [quarto - 1] = false;
        System.out.println("Quarto " + andar + "-" + quarto + " foi desocupado.");
    
        } else {
        System.out.println("Quarto inválido ou já desocupado. Tente novamente.");
        break;
 }
    case 3:
        mostrarOcupacao(quartos);
        break;
 
    case 4:
        System.out.println("Saindo do programa.");
        System.exit(0);
        break;
 
    default:
        System.out.println("Opção inválida. Tente novamente.");
        break;
 
        }
 
    }
 
}
 
    private static boolean validarQuarto(int andar, int quarto, int numAndares, int numQuartosPorAndar) {
        return andar >= 1 && andar <= numAndares && quarto >= 1 && quarto <= numQuartosPorAndar;
}
    private static void mostrarOcupacao(boolean[][] quartos) {
    System.out.println("Ocupação do hotel:");
 
    for (int i = 0; i < quartos.length; i++) {
    System.out.println((i + 1) + "º andar:");
    for (int j = 0; j < quartos[i].length; j++) {
    String ocupacao = quartos[i][j] ? "ocupado" : "desocupado";
    System.out.println("- quarto " + (j + 1) + " " + ocupacao);
 
        }
        }
    }
    
}
