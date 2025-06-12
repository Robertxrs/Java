/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academia;

/**
 *
 * @author rober
 */
public class SugestaoExercicios {

    private Musculacao exeMusculacao;
    private Corrida exeCorrida;
    private Modelo fabricaModelo;

    public SugestaoExercicios(Modelo fabrica) {
        fabricaModelo = fabrica;
    }

    public Musculacao getExeMusculacao() {
        return exeMusculacao;
    }

    public Corrida getExeCorrida() {
        return exeCorrida;
    }

    public void gerar() {
        exeMusculacao = fabricaModelo.getMusculacao();
        exeCorrida = fabricaModelo.getCorrida();

    }
}
