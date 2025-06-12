package factorymethod;

public class FactoryMethod {

    public static void main(String[] args) {

        FabricaInimigos fabrica = new FabricaInimigos();

        Inimigo obj1 = fabrica.criarInimigo(1);
        obj1.atacar("Azul");

        Inimigo obj2 = fabrica.criarInimigo(2);
        obj2.atacar("Verde");
    }

}
