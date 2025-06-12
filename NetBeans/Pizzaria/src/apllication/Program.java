
package apllication;

import entities.Pedido;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;


public class Program {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");          
          
        System.out.println("PIZZARIA");      
        System.out.print("Numero do pedido: ");
        int number = sc.nextInt();
        System.out.println("Data do pedido: ");
        LocalDate date = LocalDate.parse(sc.nextLine(),fmt);
        System.out.print("Quantos pedidos: ");
        Integer amount = sc.nextInt();
        
        Pedido pedido = new Pedido(number, date, amount);
        for (int i = 0; i < amount; i++) {
            
        }
        
    }
    
}
