/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_4;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Atividade_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner res = new Scanner(System.in);

        System.out.print("Informe o nome da empresa: ");
        String nomeEmpresa = res.nextLine();

        Pagamentos pagamentos = new Pagamentos(nomeEmpresa);

        while (true) {
            System.out.print("Informe o tipo de imposto (PIS ou IPI) ou digite PARE para encerrar: ");
            String tipoImposto = res.nextLine();

            if (tipoImposto.equals("PARE")||tipoImposto.equals("pare")) {
                break;
            }

            if (tipoImposto.equals("PIS")||tipoImposto.equals("pis")) {
                System.out.print("o valor do debito: ");
                double debito = res.nextDouble();
                System.out.print("o valor do credito: ");
                double credito = res.nextDouble();
                res.nextLine(); 

                Imposto pis = new PIS(debito, credito);
                pagamentos.adicionarImposto(pis);
                
            } else if (tipoImposto.equals("IPI")||tipoImposto.equals("ipi")) {
                System.out.print("o valor do produto: ");
                double valorProduto = res.nextDouble();
                System.out.print("o valor do frete: ");
                double frete = res.nextDouble();
                System.out.print(" o valor do seguro: ");
                double seguro = res.nextDouble();
                System.out.print("o valor de outras despesas: ");
                double outrasDespesas = res.nextDouble();
                System.out.print("a aliquota: ");
                double aliquota = res.nextDouble();
                res.nextLine(); 
                
                Imposto ipi = new IPI(valorProduto, frete, seguro, outrasDespesas, aliquota);
                pagamentos.adicionarImposto(ipi);
                
            } else {
                System.out.println("Tente novamente.");
            }
        }

        pagamentos.calcExibirImpostos();

        res.close();
    }
    
}
