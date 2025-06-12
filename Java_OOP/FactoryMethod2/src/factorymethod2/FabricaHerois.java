package factorymethod2;

public class FabricaHerois {

    public Heroi CriarHerois(Integer tipo) {
        if (tipo == 1) {
            return new Mago();
        } else if (tipo == 2) {
            return new Guerreiro();
        } else if (tipo == 3) {
            return new Arqueiro();
        }
        throw new IllegalArgumentException("tipo de inimigo INVALIDO");
    }
}
