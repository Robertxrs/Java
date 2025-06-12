/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractmethod;

/**
 *
 * @author rober
 */
abstract class Games {

    private String nome;

    public Games(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return nome;
    }
}
