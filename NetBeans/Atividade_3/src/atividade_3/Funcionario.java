/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_3;

/**
 *
 * @author rober
 */
public abstract class Funcionario {
        protected String nome;
    protected String cpf;
    protected String endereco;
    protected String telefone;
    protected String setor;
    protected double salario;
    
    
    public Funcionario(String n, double s,String c, String e,String t,String x){
        this.nome = n;
        this.salario=s;
        this.cpf = c;
        this.endereco=e;
        this.telefone=t;
        this.setor=x;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getSetor() {
        return setor;
    }

    public double getSalario() {
        return salario;
    }
   
    
    
    public abstract double calcularPagamento();
    
    public void exibeDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Salario: "+salario);
    }
    
     public abstract void aplicaAumento(float aumento);
    
    
}
