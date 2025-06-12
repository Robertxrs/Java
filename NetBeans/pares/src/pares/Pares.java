package pares;

import java.util.Scanner;

public class Pares {

    public static void main(String[] args) {
        Scanner res = new Scanner(System.in);
        int n, quantidadePar = 0;

        System.out.println("Quantos numeros vai ser: ");
        n = res.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            vect[i] = res.nextInt();
        }
        System.out.println("Numeros pares");
        for (int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0) {
                System.out.println("" + vect[i]);
                quantidadePar++;
            }
        }
        System.out.println("QUANTIDADE DE PARES " + quantidadePar);
    }

}
