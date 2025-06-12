
package banco;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner res = new Scanner(System.in);
        ContaBancaria conta = null;

        System.out.println("Numero da conta:");
        String numeroConta = res.nextLine();
        System.out.println("Nome: ");
        String nomeTitular = res.nextLine();
        System.out.println("tem deposito inicial ?(s/n)");
        String resposta = res.nextLine();

        if (resposta.equals("s")) {
            System.out.println("Qual eh o valor depositado ?");
            double depositoInicial = res.nextDouble();
            conta = new ContaBancaria(numeroConta, nomeTitular, depositoInicial);
            System.out.println();
            System.out.println("Dados conta ");
            System.out.println(conta.toString());
        } else if (resposta.equals("n")) {
            conta = new ContaBancaria(numeroConta, nomeTitular);
            System.out.println();
            System.out.println("Dados conta ");
            System.out.println(conta.toString());
        }
        System.out.println("Deposito de quantos ");
        double deposito = res.nextDouble();
        conta.deposit(deposito);
        System.out.println(conta);
        System.out.println("Saque de quantos");
        double saque = res.nextDouble();
        conta.sacar(saque);
        System.out.println(conta);

    }

}
