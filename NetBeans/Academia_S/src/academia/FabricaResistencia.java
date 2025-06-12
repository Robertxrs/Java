package academia;

public class FabricaResistencia implements Modelo {

    public Musculacao getMusculacao() {
        return new LegPress("Leg Press");
    }

    public Corrida getCorrida() {
        return new Maratona("Maratona de 20km");
    }

}
