package alturas;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner res = new Scanner(System.in);

        int n, nmenores;
        double alturaTotal, alturaMedia, percentualMenores;
        System.out.println("Quantas pessoas serao digitas");
        n = res.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.println("Nome: ");
            nomes[i] = res.next();
            System.out.println("Idade: ");
            idades[i] = res.nextInt();
            System.out.println("Altura: ");
            alturas[i] = res.nextDouble();
        }
        nmenores = 0;
        alturaTotal = 0;
        for (int i = 0; i < n; i++) {
            if (idades[i] < 18) {
                nmenores++;
            }
            alturaTotal = alturaTotal + alturas[i];
        }
        alturaMedia = alturaTotal / n;
        percentualMenores = ((double) nmenores / n) * 100.0;

        System.out.printf("\nAltura media = %.2f\n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.printf("%s\n", nomes[i]);
            }
        }

        res.close();

    }

}
