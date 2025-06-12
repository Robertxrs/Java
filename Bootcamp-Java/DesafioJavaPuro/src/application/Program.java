package application;

import model.facade.Facade;
import model.singleton.SingletonLazyHolder;
import model.strategy.Comportamento;
import model.strategy.ComportamentoAgressivo;
import model.strategy.ComportamentoDefensivo;
import model.strategy.ComportamentoNormal;
import model.strategy.Robo;

public class Program {

    public static void main(String[] args) {

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        
        Facade facade = new Facade();
        facade.migrarCliente("Santos", "0992020");
    }
}
