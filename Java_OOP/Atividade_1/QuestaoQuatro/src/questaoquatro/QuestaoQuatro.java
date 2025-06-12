/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questaoquatro;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class QuestaoQuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
        Object[] hospedes = new Object[100];
        int totalCadastros = 0;
        boolean encontrado = false;
        String nomePesquisa;

    while (true) {
        System.out.println("Digite: ");
        System.out.println("1- cadastrar ");
        System.out.println("2- pesquisar ");
        System.out.println("3- sair");
        int opcao = Integer.parseInt(input.nextLine());
        
        switch (opcao) {

        case 1:
        if (totalCadastros >= hospedes.length) {
        System.out.println("Máximo de cadastros atingido.");
        } else {
        System.out.println("Informe o nome do hóspede:");
        String nomeHospede = input.nextLine();
        hospedes[totalCadastros] = nomeHospede;
        totalCadastros++;
        }
        break;

        case 2:
        System.out.println("Informe o nome para pesquisa:");
        nomePesquisa = input.nextLine();
        
        for (int i = 0; i < totalCadastros; i++) {
        if (hospedes[i].equals(nomePesquisa));
        System.out.println("Hóspede " + nomePesquisa + " foi encontrado no índice " + i);
            encontrado = true;
            break;
            }
        
        if (!encontrado){  
        System.out.println("Hóspede " + nomePesquisa + " não encontrado.");
        break;
        }case 3:
            System.out.println("Saiu do Cadastro!");
            System.exit(0);
            break;
        default:
            System.out.println("Opção inválida. Tente novamente.");
            break;
      }      
        }
    }
    
}
