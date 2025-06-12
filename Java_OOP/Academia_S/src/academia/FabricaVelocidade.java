package academia;

public class FabricaVelocidade implements Modelo {

    public Musculacao getMusculacao() {
        return new Esteira("Esteira");
    }

    public Corrida getCorrida() {
        return new Sprints("Sprints de Alta Intensidade");
    }
}
