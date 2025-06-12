package abstractmethod;

public class FabricaAntigos implements Modelo{
    
    public Esportes getEsportes(){
        return new WiningEleven("Winning Eleven");
    }
    public RPG getRpg(){
        return new Zelda("Zelda Adventure");
    }
}
