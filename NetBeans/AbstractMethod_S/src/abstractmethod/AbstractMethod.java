package abstractmethod;

import java.util.Scanner;

public class AbstractMethod {

    public static void main(String[] args) {

        Scanner res = new Scanner(System.in);
        System.out.println("Informe 1-Games NOVOS ou 2-Games ANTIGOS");
        byte opc = res.nextByte();

        Modelo modelo = null;

        switch (opc) {
            case 1:
                modelo = new FabricaNovos();
                break;
            case 2:
                modelo = new FabricaAntigos();
        }
        SugestaoGame sugestao = new SugestaoGame(modelo);
        sugestao.gerar();

        System.out.println("Esportes: " + sugestao.getGameEsporte().toString());
        System.out.println("RPG: " + sugestao.getGameRpg().toString());

    }

}
