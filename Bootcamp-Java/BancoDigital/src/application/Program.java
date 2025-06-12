package application;

import entites.ContaBancaria;
import entites.ContaCorrente;
import entites.ContaPoupanca;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);

        System.out.println("Escolha sua conta:");
        System.out.println("1 - Conta corrente");
        System.out.println("2 - Conta poupança");
        int tipo = rs.nextInt();
        ContaBancaria contaSelecionada = null;
        ContaBancaria contaCorrente = new ContaCorrente(0.00);
        ContaBancaria contaPoupanca = new ContaPoupanca(0.00);

        switch (tipo) {
            case 1:
                contaSelecionada = contaCorrente;
                break;
            case 2:
                contaSelecionada = contaPoupanca;
                break;
            default:
                System.out.println("Opção inválida");
                rs.close();
                return;
        }

        System.out.println("Escolha o que deseja:");
        System.out.println("1 - Sacar");
        System.out.println("2 - Depositar");
        System.out.println("3 - Transferir");
        int operacao = rs.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Digite o valor a sacar:");
                double valorSaque = rs.nextDouble();
                contaSelecionada.sacar(valorSaque);
                System.out.println(contaSelecionada.toString());
                break;
            case 2:
                System.out.println("Digite o valor a depositar:");
                double valorDeposito = rs.nextDouble();
                contaSelecionada.depositar(valorDeposito);
                System.out.println(contaSelecionada.toString());
                break;
            case 3:
                System.out.println("Digite o valor a transferir:");
                double valorTransferencia = rs.nextDouble();
                ContaBancaria contaTransferida = (contaSelecionada == contaCorrente) ? contaPoupanca : contaCorrente;
                contaSelecionada.transferir(contaTransferida, valorTransferencia);
                System.out.println("Conta origem: " + contaSelecionada.toString());
                System.out.println("Conta destino: " + contaTransferida.toString());
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }

        rs.close();
    }

}
