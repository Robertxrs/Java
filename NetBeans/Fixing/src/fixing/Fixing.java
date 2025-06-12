package fixing;

import java.util.Locale;
import java.util.Scanner;

public class Fixing {

    public static void main(String[] args) {
        // TODO code application logic here
        Locale.setDefault(Locale.US);
        Scanner res = new Scanner(System.in);
        System.out.println("Quantidade de produto");
        int n = res.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Nome do produto");
            res.nextLine();
            String name = res.nextLine();
            System.out.println("Valor do produto");
            double price = res.nextDouble();
            vect[i] = new Product(name, price);

        }
        double sum = 0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }
        double avg = sum / n;

        System.out.println("Valor medio = " + String.format("%.2f", avg));

        res.close();
    }

}
