/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_4;

/**
 *
 * @author rober
 */
public class IPI implements Imposto {
        private double valorProduto;
    private double frete;
    private double seguro;
    private double outrasDespesas;
    private double aliquota;

    public IPI(double valorProduto, double frete, double seguro, double outrasDespesas, double aliquota) {
        this.valorProduto = valorProduto;
        this.frete = frete;
        this.seguro = seguro;
        this.outrasDespesas = outrasDespesas;
        this.aliquota = aliquota;
    }

    @Override
    public double calcularImposto() {
        double baseDeCalculo = valorProduto + frete + seguro + outrasDespesas;
        return baseDeCalculo * (aliquota / 100);
    }

    @Override
    public String getDescricao() {
        return "IPI";
    }
}
