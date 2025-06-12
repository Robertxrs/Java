package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int total = 0;

        System.out.println("---------CALCULADORA---------");
        System.out.println("Digite  o primeiro numero da sua conta:");
        int num1 = r.nextInt();

        System.out.println("Digite  o sinal(+ - / *):");
        String sinal = r.next();
        System.out.println("Digite o segundo numero da sua conta:");
        int num2 = r.nextInt();

        if (sinal.equals("+")) {
            total = num1 + num2;
        } else if (sinal.equals("-")) {
            total = num1 - num2;
        } else if (sinal.equals("/")) {
            total = num1 / num2;
        } else if (sinal.equals("*")) {
            total = num1 * num2;
        } else {
            System.out.println("Ocorreu um erro");
        }
        System.out.println("O total foi " + total);

    }

}
