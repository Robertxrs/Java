
package fixingenumeracao_u;

import entitie.Client;
import entitie.OrderItem;
import entitie.Product;
import entitie.Order;
import entities.enums.OrderStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program{

    public static void main(String[] args) throws ParseException {
        Scanner res = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Name: ");
        String name = res.nextLine();
        System.out.println("Email: ");
        String email = res.nextLine();
        System.out.println("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(res.next());
        Client client = new Client(name,email,birthDate);
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(res.next());
        
        System.out.println("Enter order data: ");
        int n = res.nextInt();
       
        Order order = new Order(new Date(), status, client);
        
        for (int i = 1; i < n; i++) {
            System.out.println("Enter item # "+i+" data:");
            System.out.print("Product name: ");
            res.nextLine();
            String productName = res.nextLine();
            System.out.print("Product price: ");
            double price = res.nextDouble();
            System.out.print("Quantity");
            int quantity = res.nextInt();
            Product product = new Product(productName,price); 
            OrderItem itens = new OrderItem(product, price,quantity);
            
            order.addItem(itens);                        
        }
            System.out.println("Order");   
        
    }
    
}
