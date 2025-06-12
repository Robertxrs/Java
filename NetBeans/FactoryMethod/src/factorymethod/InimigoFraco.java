package factorymethod;

public class InimigoFraco implements Inimigo {

    private String cor;

    @Override
    public void atacar(String cor) {

        System.out.println("Inimigo fraco desarmado " + cor);
    }
}
