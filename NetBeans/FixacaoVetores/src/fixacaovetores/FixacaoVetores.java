
package fixacaovetores;

import java.util.Scanner;

public class FixacaoVetores {

    public static void main(String[] args) {


        Scanner res = new Scanner(System.in);
        double soma, media;
        
        System.out.println("Quantos numeros voce vai digitar? ");
        int n = res.nextInt();  
        
        double[] vect = new double[n];
        
        
        for(int i=0;i<n;i++){
            System.out.println("Digite um numero");
            vect[i] = res.nextDouble();
           
        }
           soma=0;
        for(int i=0;i<n;i++){
            soma = soma + vect[i];
        }   
        media = soma / n;
        
        System.out.println("Valores: ");
        for(int i=0;i<n;i++){
            System.out.println(""+vect[i]);
        }
        System.out.println("\nSoma = "+ soma );
        System.out.println("Media = "+media);
       
        res.close();
    }
    
}
