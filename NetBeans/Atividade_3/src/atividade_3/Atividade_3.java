/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_3;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Atividade_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner res = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[10];
        int numFuncionarios = 0;

        while (true) {
            System.out.println("Selecione a opcao de funcionario:\nA - Assalariado\nH - Horista\nP - Pular");
            String tipo = res.next();

            if (tipo.equals("A") || tipo.equals("a")) {
                System.out.print("Nome: ");
                String nome = res.next();
                System.out.print("CPF: ");
                String cpf = res.next();
                System.out.print("Endereco: ");
                String endereco = res.next();
                System.out.print("Telefone: ");
                String telefone = res.next();
                System.out.print("Setor: ");
                String setor = res.next();
                System.out.print("Salario Mensal: ");
                double salario = res.nextDouble();

                funcionarios[numFuncionarios] = new Assalariado(nome, salario, cpf, endereco, telefone, setor);
                numFuncionarios++;
                
            } else if (tipo.equals("H") || tipo.equals("h")) {
                System.out.print("Nome: ");
                String nome = res.next();
                System.out.print("CPF: ");
                String cpf = res.next();
                System.out.print("Endereco: ");
                String endereco = res.next();
                System.out.print("Telefone: ");
                String telefone = res.next();
                System.out.print("Setor: ");
                String setor = res.next();
                System.out.print("Horas Trabalhadas: ");
                int hora = res.nextInt();
                System.out.print("Valor da Hora: ");
                float valorHora = res.nextFloat(); 
                double salario = valorHora * hora;

                funcionarios[numFuncionarios] = new Horista(nome, salario, cpf, endereco, telefone, setor, valorHora, hora);
                numFuncionarios++;
                
            } else if (tipo.equals("P") || tipo.equals("p")) {
                System.out.println("Pulando o cadastro de funcionarios.");
                break;  
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        System.out.println("-----Dados dos Funcionarios e Pagamentos:-----");
        for (int i = 0; i < numFuncionarios; i++) {
            System.out.println("-------------------");
            System.out.println("Nome: " + funcionarios[i].getNome());
            System.out.println("CPF: " + funcionarios[i].getCpf());
            System.out.println("Endereco: " + funcionarios[i].getEndereco());
            System.out.println("Telefone: " + funcionarios[i].getTelefone());
            System.out.println("Setor: " + funcionarios[i].getSetor());
            System.out.println("Salario: ");
            

            System.out.print("Informe o aumento percentual: ");
            float aumento = res.nextFloat();
            
            funcionarios[i].aplicaAumento(aumento);
            System.out.println("Pagamento: " + funcionarios[i].calcularPagamento());
            System.out.println();
        }

        res.close();
    }
    
}
