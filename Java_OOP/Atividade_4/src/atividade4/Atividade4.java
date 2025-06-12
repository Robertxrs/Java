 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade4;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Atividade4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome da empresa: ");
        String nomeEmpresa = scanner.nextLine();

        Pagamentos pagamentos = new Pagamentos(nomeEmpresa);

        while (true) {
            System.out.print("Informe o tipo de imposto (PIS ou IPI) ou 'pare' para encerrar: ");
            String tipoImposto = scanner.nextLine();

            if (tipoImposto.equalsIgnoreCase("pare")) {
                break;
            }

            if (tipoImposto.equalsIgnoreCase("PIS")) {
                System.out.print("Informe o valor do débito: ");
                double debito = scanner.nextDouble();
                System.out.print("Informe o valor do crédito: ");
                double credito = scanner.nextDouble();
                scanner.nextLine(); // Limpar a quebra de linha

                Imposto pis = new PIS(debito, credito);
                pagamentos.adicionarImposto(pis);
            } else if (tipoImposto.equalsIgnoreCase("IPI")) {
                System.out.print("Informe o valor do produto: ");
                double valorProduto = scanner.nextDouble();
                System.out.print("Informe o valor do frete: ");
                double frete = scanner.nextDouble();
                System.out.print("Informe o valor do seguro: ");
                double seguro = scanner.nextDouble();
                System.out.print("Informe o valor de outras despesas: ");
                double outrasDespesas = scanner.nextDouble();
                System.out.print("Informe a alíquota: ");
                double aliquota = scanner.nextDouble();
                scanner.nextLine(); // Limpar a quebra de linha

                IPI ipi = new IPI(valorProduto, frete, seguro, outrasDespesas, aliquota);
                pagamentos.adicionarImposto(ipi);
            } else {
                System.out.println("Tipo de imposto não reconhecido. Tente novamente.");
            }
        }

        pagamentos.calcularEExibirImpostos();

        scanner.close();
    }

    private static class Pagamentos {

        public Pagamentos(String nomeEmpresa) {
        }

        private void calcularEExibirImpostos() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void adicionarImposto(Imposto ipi) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void adicionarImposto(IPI ipi) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}
