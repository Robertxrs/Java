package application;

import entities.Product;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault( Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Product> liist = new ArrayList<>();
        
        System.out.println("Enter file path: ");
        String sourceFileStr = sc.nextLine();
        
        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();
        
        boolean sucess = new File(sourceFolderStr + "\\out").mkdir();
        
        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
        
        try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
            String itemCsv = br.readLine();
            while(itemCsv != null){
                System.out.println(itemCsv);
                itemCsv = br.readLine();
            }
        }catch(IOException e){
            System.out.println("Error writing file: "+ e.getMessage());
        }
        
        sc.close();
        
       
    }
    
}
