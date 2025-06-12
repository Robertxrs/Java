
package factorymethod;

public class FabricaInimigos {
    
    public Inimigo criarInimigo(Integer tipo){
        if (tipo==1) {
            return new InimigoForte();
        }else if(tipo==2){
            return new InimigoFraco();
        } else{
            throw new IllegalArgumentException("tipo de inimigo INVALIDO");
        }    
    }
}