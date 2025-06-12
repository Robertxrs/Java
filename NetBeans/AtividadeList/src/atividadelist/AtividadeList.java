
package atividadelist;

import Entities.Funcionarios;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AtividadeList {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner res = new Scanner(System.in);

        List<Funcionarios> list = new ArrayList<>();
        System.out.println("How many rooms will be rented ?");
        int n = res.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Position# " + (i + 1) + ":");
            System.out.print("ID:");
            int id = res.nextInt();
            System.out.print("Name: ");
            String nome = res.next();
            System.out.print("Salario: ");
            double salario = res.nextDouble();
            Funcionarios func = new Funcionarios(id, nome, salario);
            list.add(func);
        }
        System.out.print("Digite o id do funcionario que vai receber aumento: ");
        int idsalary = res.nextInt();
        Integer pos = position(list, idsalary);
        if (pos == null) {
            System.out.println("Esse id nao existe");
        } else {
            System.out.println("Quanto porcento: ");
            double porcentagem = res.nextDouble();
            list.get(pos).AumentoSalario(porcentagem);
        }

        System.out.println("Lista: ");
        for (Funcionarios x : list) {
            System.out.println(x.toString());
        }
    }

    static Integer position(List<Funcionarios> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
