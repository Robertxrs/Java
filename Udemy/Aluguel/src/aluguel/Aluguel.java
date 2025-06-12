package aluguel;

import Entities.Rent;
import java.util.Locale;
import java.util.Scanner;

public class Aluguel {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner res = new Scanner(System.in);

        Rent[] quarto = new Rent[10];

        System.out.println("How many rooms will be rented ?");
        int n = res.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Rent @" + i + ":");
            System.out.println("Name: ");
            res.nextLine();
            String name = res.nextLine();
            System.out.println("Email: ");
            String email = res.next();
            System.out.println("Room: ");
            int roomNumber = res.nextInt();

            quarto[roomNumber] = new Rent(name, email);
        }
        System.out.println();
        System.out.println("Busy rooms");
        for (int i = 0; i < 10; i++) {
            if (quarto[i] != null) {
                System.out.println(i + " : " + quarto[i]);
            }

        }

        //Rent r = new Rent("Maria","maria@gmail.com");
        //System.out.println(r);
        res.close();
    }

}
