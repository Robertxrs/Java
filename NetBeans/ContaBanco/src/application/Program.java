package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import exception.ParametrosInvalidosException;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Qual o primeiro número:");
            int num1 = sc.nextInt();
            System.out.println("Qual o segundo número:");
            int num2 = sc.nextInt();

            if (num1 >= num2) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }
            for (int i = num1; i <= num2; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (NumberFormatException e) {
            System.out.println("informe um numero");
        } catch (InputMismatchException e) {
            System.out.println("digite um numero");
        } finally {
            System.out.println("Obrigado por usar o programa.");
        }

    }
}
