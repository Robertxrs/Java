package factorymethod;

public class InimigoForte implements Inimigo {

    private String cor;

    @Override
    public void atacar(String cor) {
        System.out.println("Inimigo forte atacando de forma poderosa! " + cor);
    }
}
