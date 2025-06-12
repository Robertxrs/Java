package fixacao_polimorfismo_u;

import entities.Product;
import entities.UsedProduct;
import entities.importedProduct;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program{


    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        
        System.out.println("Enter the number of employees: ");
        int n = r.nextInt()+1;
        
        for (int i = 1; i < n; i++) {
            System.out.println("Product #"+i+" data:");
            System.out.println("Common, used or imported(c/u/i)? ");
            char type = r.next().charAt(0);
            System.out.println("Name: ");
            r.nextLine();
            String name = r.nextLine();
            System.out.println("Price: ");
            double price = r.nextDouble();
            if (type == 'c') {
                list.add(new Product(name,price));
            }
            else if(type == 'u'){
                System.out.println("Manufacture date (DD/MM/YYYY:)");
                LocalDate date = LocalDate.parse(r.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(date,name,price));
            }else{
                System.out.println("Customs fee:");
                double valorTaxa = r.nextDouble();
                list.add(new importedProduct(valorTaxa,name,price));     
            }  
        }
            	System.out.println();
		System.out.println("ETIQUETAS DE PRECO:");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}   
        
    }
    
}
