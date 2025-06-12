/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_4;

/**
 *
 * @author rober
 */
public class PIS implements Imposto  {
    private double credito, debito;

    public PIS(double credito, double debito) {
        this.credito = credito;
        this.debito = debito;
    }
    @Override
    public double calcularImposto(){
      return (debito - credito)*0.0165;  
    }
    @Override
    public String getDescricao(){
        return "PIS";
    }
   

}
