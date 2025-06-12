package factorymethod2;

public class FactoryMethod2 {

    public static void main(String[] args) {

        FabricaHerois fabrica = new FabricaHerois();

        Heroi obj1 = fabrica.CriarHerois(1);
        obj1.atacar();

        Heroi obj2 = fabrica.CriarHerois(2);
        obj2.atacar();

        Heroi obj3 = fabrica.CriarHerois(3);
        obj3.atacar();

    }

}
