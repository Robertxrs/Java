package abstractmethod;

public class FabricaNovos implements Modelo{
    
    public Esportes getEsportes(){
        return new Fifa("Fifa 24");
    }
    public RPG getRpg(){
        return new EldenRing("Elden Ring");
    }
}
