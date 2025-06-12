/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_3;

/**
 *
 * @author rober
 */
public class Assalariado extends Funcionario{
        
    
    public Assalariado(String n, double s, String c, String e, String t, String st) {
    super(n, s, c, e, t, st);
    }

 
    
    @Override
    public double calcularPagamento() {
        return salario;
    }

        public void  aplicarAumento(float aumento){
        salario = salario * aumento; 
    }
    
        
        @Override
        public void exibeDados(){
        System.out.println("------------");
        System.out.println("Dados do Assalariado");
        System.out.println("nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("Telefone: "+telefone);
        System.out.println("Endereco: "+endereco);
        System.out.println("Setor: "+setor);
        System.out.println("Salario mensal: "+salario);
    }

    @Override
    public void aplicaAumento(float aumento){
        salario += salario * (aumento/ 100.0);  
    }
}
