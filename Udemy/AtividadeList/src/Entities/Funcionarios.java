/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author rober
 */
public class Funcionarios {
    private String nome;
    private int id;
    private double salario;

            
    public Funcionarios() {
    }


    public Funcionarios( int id,String nome, double salario) {
        super();
        this.id = id;
        this.nome = nome;
        this.salario = salario;
       
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(String email) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void AumentoSalario(double porcentagemAumento){
        salario = salario +(salario * porcentagemAumento / 100);
        
    }

    @Override
    public String toString() {
        return "ID:"+id+", Name:"+nome+", Salary:"+salario;
    }
    
    
}
