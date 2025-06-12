/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package application;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale.setDefault(Locale.US);
        Scanner res = new Scanner(System.in);

        System.out.println("Enter how many heights");
        int n = res.nextInt();
        double[] vect = new double[n];

        System.out.println("Enter heights");
        for (int i = 0; i < n; i++) {
            vect[i] = res.nextDouble();
        }
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }
        double avg = sum / n;
        System.out.print("Average height: " + String.format("%.2f", avg));
        res.close();
    }

}
