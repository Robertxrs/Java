/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade2;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Atividade2 {

    public static void main(String[] args) {
        Scanner res = new Scanner(System.in);
        
        System.out.println("Bem vindo");
        
        System.out.println("Nome do Cliente: ");
        String nomeCliente = res.nextLine();
        
        System.out.println("Qual tipo de transporte: ");
        String tipo = res.nextLine();
        System.out.println("Valor do transporte: ");
        double valor = res.nextDouble();
        Transporte transporte = new Transporte(valor, tipo);

        System.out.println("Qual hospedagem deseja ficar: ");
        String descricao = res.nextLine();
        res.nextLine();
        System.out.println("Valor da Diaria: ");
        double valorDiaria = res.nextDouble();
        Hospedagem hospedagem = new Hospedagem(descricao, valorDiaria);

        System.out.println("Qual o destino: ");
        String destino = res.nextLine();
        res.nextLine();
        System.out.println("Quantos dias deseja ficar: ");
        int quantidadeDia = res.nextInt();

       
        
        
        System.out.println("Qual a margem de lucro: ");
        double margemLucro = res.nextDouble();
        res.nextLine();
        System.out.println("Qual o valor das Taxas adicionais: ");
        double taxasAdicionais = res.nextDouble();
        PacoteViagem pacoteViagem = new PacoteViagem(quantidadeDia, destino, margemLucro, taxasAdicionais, transporte,hospedagem);

        
        System.out.println("----Cliente: "+ nomeCliente+"----");
        
        System.out.println("Forma de Pagamento:"); 
        String formaPagamento = res.nextLine();
        res.nextLine();
        System.out.println("Cotacao do dolar: ");
        double dolar = res.nextDouble();
       
        
        Venda venda = new Venda(nomeCliente, formaPagamento, dolar, transporte, hospedagem, pacoteViagem);
        venda.exibirTotal();
  
    }
    
}
