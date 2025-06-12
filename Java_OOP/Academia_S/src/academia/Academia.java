package academia;

import java.util.Scanner;

public class Academia {

    public static void main(String[] args) {
    Scanner res = new Scanner(System.in);
        System.out.println("Informe 1-Exercicios de Resistencia ou 2-Exercicios de Velocidade");
        byte opc = res.nextByte();

        Modelo modelo = null;

        switch (opc) {
            case 1:
                modelo = new FabricaResistencia();
                break;
            case 2:
                modelo = new FabricaVelocidade();
        }
        SugestaoExercicios sugestao = new SugestaoExercicios(modelo);
        sugestao.gerar();

        System.out.println("Musculacao: " + sugestao.getExeMusculacao().toString());
        System.out.println("Corrida: " + sugestao.getExeCorrida().toString());

    }
    }


