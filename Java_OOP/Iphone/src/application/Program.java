package application;

import functions.InternetBrowser;
import functions.MusicPlayer;
import functions.Telephone;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha as opcoes do iphone:");
        System.out.println("1-Reprodutor de musica");
        System.out.println("2-Ligacoes");
        System.out.println("3-Internet");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                MusicPlayer player = new MusicPlayer();
                player.addMusic("Musica 1");
                player.addMusic("Musica 2");
                player.addMusic("Musica 3");
                player.showPlaylist();
                System.out.print("Escolha uma musica para tocar: ");
                String selectedMusic = scanner.nextLine();
                player.playMusic(selectedMusic);
                System.out.println("1-Pausar");
                System.out.println("2-Parar");
                int op = scanner.nextInt();
                if (op == 1) {
                    player.pauseMusic();
                } else if (op == 2) {
                    player.stopMusic();
                } else {
                    System.out.println("Opcao nao encontrada");
                }
                break;
            case 2:
                System.out.println("Deseja fazer uma ligacao para que numero?");
                String number = scanner.nextLine();
                Telephone p = new Telephone(number);
                p.makeCall(number);
                System.out.println("Deseja finalizar a ligacao ?(s/n)");
                String opcaoT = scanner.nextLine();
                if (opcaoT == "s") {
                    p.endCall();
                } else {
                    System.out.println("Ligacao continuada");
                }
                p.endCall();
                break;
            case 3:
                System.out.println("Escreva a url onde deseja navegar: ");
                String url = scanner.nextLine();
                InternetBrowser n = new InternetBrowser(url);
                n.navegarUrl(url);
                break;
            default:
                System.out.println("Opcao inválida");
        }

        //Iphone das classes e interfaces com a 
        //proposta de representar os papéis do iPhone de:
        //Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.
    }

}
