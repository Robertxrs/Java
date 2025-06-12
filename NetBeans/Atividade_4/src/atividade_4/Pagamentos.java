/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_4;

/**
 *
 * @author rober
 */
import java.util.ArrayList;
import java.util.List;


public class Pagamentos {
    private String nomeEmpresa;
    private List<Imposto> impostos = new ArrayList<>();

    public Pagamentos(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void adicionarImposto(Imposto imposto) {
        impostos.add(imposto);
    }

    public void calcExibirImpostos() {
        System.out.println("Impostos a pagar para a empresa " + nomeEmpresa + ":");
        for (Imposto imposto : impostos) {
            System.out.println(imposto.getDescricao() + ": R$" + imposto.calcularImposto());
        }
    }

}
