package matriz;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner res = new Scanner(System.in);

        System.out.println("Quantas colonas e fileiras na tabela ?");   
        int n = res.nextInt();
        System.out.println("Digita entao");
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = res.nextInt();
            }
        }
        System.out.println("Main diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][i] + "");
        }
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("Negative numbers: " + count);
        res.close();
    }

}
