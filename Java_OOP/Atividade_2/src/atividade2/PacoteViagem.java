/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade2;

/**
 *
 * @author rober
 */
public class PacoteViagem {
        Transporte transporte;
    Hospedagem hospedagem;
    private int quantidadeDia;
    private String destino;
    private double margemLucro;
    private double taxasAdicionais;

    public PacoteViagem(int quantidadeDia, String destino, double margemLucro, double taxasAdicionais,Transporte transporte,Hospedagem hospedagem) {
        this.quantidadeDia = quantidadeDia;
        this.destino = destino;
        this.margemLucro = margemLucro;
        this.taxasAdicionais = taxasAdicionais;
        this.transporte = transporte;
        this.hospedagem = hospedagem;
    }



    public double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }

    public double getTaxasAdicionais() {
        return taxasAdicionais;
    }

    public void setTaxasAdicionais(double taxasAdicionais) {
        this.taxasAdicionais = taxasAdicionais;
    }

   
    public int getQuantidadeDia() {
        return quantidadeDia;
    }

    public void setQuantidadeDia(int quantidadeDia) {
        this.quantidadeDia = quantidadeDia;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

   
    
    public double calcularTotalHospedagem(){
        return quantidadeDia * hospedagem.getValorDiaria();
    }
    public double calcularLucro(){
        return (margemLucro * calcularTotalHospedagem()/100);
        }
    public double calcularTotalPacote(){
       return transporte.getValor() +  calcularTotalHospedagem() + taxasAdicionais + margemLucro;
    }
    
    

}
