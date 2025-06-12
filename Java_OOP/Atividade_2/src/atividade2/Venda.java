/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade2;

/**
 *
 * @author rober
 */
public class Venda {
        private String nomeCliente;
    Transporte transporte;
    Hospedagem hospedagem;
    private String formaPagamento;
    PacoteViagem pacoteViagem;
    private double dolar;

   public Venda(String nomeCliente, String formaPagamento, double dolar, Transporte transporte, Hospedagem hospedagem, PacoteViagem pacoteViagem) {
    this.nomeCliente = nomeCliente;
    this.formaPagamento = formaPagamento;
    this.dolar = dolar;
    this.transporte = transporte;
    this.hospedagem = hospedagem;
    this.pacoteViagem = pacoteViagem;
}


    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public PacoteViagem getPacoteViagem() {
        return pacoteViagem;
    }

    public void setPacoteViagem(PacoteViagem pacoteViagem) {
        this.pacoteViagem = pacoteViagem;
    }
    
    public double dolarReais(){
        return dolar * pacoteViagem.calcularTotalPacote();
    }
    public void exibirTotal(){
        System.out.println("----VENDA----");
        System.out.println("Nome: "+nomeCliente);
        System.out.println("Transporte: " + transporte.getValor());
        System.out.println("Hospedagem: "+hospedagem.getValorDiaria()); 
        System.out.println("Valor em dolar : "+pacoteViagem.calcularTotalPacote());
        System.out.println("Valor em reias : "+ dolarReais());     
    }

}
