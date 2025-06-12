/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_3;

/**
 *
 * @author rober
 */
public class Horista extends Funcionario {
    private float valorHora;
    private int hora;

    public Horista(String n, double s, String c, String e, String t, String st,float valorHora, int hora) {
        super(n, s, c, e, t,st);
        this.valorHora=valorHora;
        this.hora=hora;
    }

    
    
    @Override
    public double calcularPagamento(){
        return hora * valorHora;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
        
     //Também é necessário que ambos sejam capazes de aplicar aumento (informado em %) em seus rendimentos.
       

    @Override
    public void exibeDados(){
    System.out.println("------------");
    System.out.println("Dados do Horista");
    System.out.println("nome: "+nome);
    System.out.println("CPF: "+cpf);
    System.out.println("Telefone: "+telefone);
    System.out.println("Endereco: "+endereco);
    System.out.println("Setor: "+setor);
    System.out.println("Valor a Hora: "+valorHora);
    System.out.println("Quantidade de Hora: "+hora);
    System.out.println("Salario:"+ calcularPagamento());
    }    

    @Override
    public void aplicaAumento(float aumento){
         salario += salario * (aumento/ 100.0);
    }
}
