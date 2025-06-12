/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractmethod;

/**
 *
 * @author rober
 */
public class SugestaoGame {

    private Esportes gameEsporte;
    private RPG gameRpg;
    private Modelo fabricaModelo;

    public SugestaoGame(Modelo fabrica) {
        fabricaModelo = fabrica;
    }

    public Esportes getGameEsporte() {
        return gameEsporte;
    }

    public RPG getGameRpg() {
        return gameRpg;
    }

    public void gerar() {
        gameEsporte = fabricaModelo.getEsportes();
        gameRpg = fabricaModelo.getRpg();

    }
}
