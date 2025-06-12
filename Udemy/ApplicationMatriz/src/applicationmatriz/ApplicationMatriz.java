package applicationmatriz;

import java.util.Scanner;

public class ApplicationMatriz {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        System.out.println("Quantas colunas e fileiras vai ser ?");
        int c = r.nextInt();
        int f = r.nextInt();
        System.out.println("Digita quais numeros serao");
        int[][] matriz = new int[c][f];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = r.nextInt();
            }
        }
        int x = r.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matriz[i - 1][j]);
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.println("Right: " + matriz[i][j + 1]);
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("Down: " + matriz[i + 1][j]);
                    }
                }

            }

        }

        r.close();
    }
}
