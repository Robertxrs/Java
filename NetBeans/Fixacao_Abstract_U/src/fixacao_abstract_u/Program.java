package fixacao_abstract_u;

import entities.Fisica;
import entities.Juridica;
import entities.Pessoa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);
        System.out.println("Enter the number of taxpayers: ");
        int n = r.nextInt() + 1;
        List<Pessoa> list = new ArrayList<Pessoa>();
        for (int i = 1; i < n; i++) {
            System.out.println("Taxpayer #" + i + " data: ");
            System.out.println("Individual or company(i/c)? ");
            char type = r.next().charAt(0);
            System.out.println("Name: ");
            String name = r.next();
            System.out.println("Anual income:");
            double rendaAtual = r.nextDouble();
            if (type == 'i') {
                System.out.println("Health expenditures:");
                double gastoSaude = r.nextDouble();
                list.add(new Fisica(gastoSaude, name, rendaAtual));
            } else {
                System.out.println("Number of employees: ");
                int funcionarios = r.nextInt();
                list.add(new Juridica(funcionarios, name, rendaAtual));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID: ");
        for (Pessoa pe : list) {
            System.out.println(pe.getName() + ": $" + String.format("%.2f", pe.imposto()));
        }
        double sum = 0.0;
        for (Pessoa pe : list) {
            sum += pe.imposto();
        }
        System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));
        r.close();
    }

}
