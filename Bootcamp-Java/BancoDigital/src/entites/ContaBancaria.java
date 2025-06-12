
package entites;

public abstract class ContaBancaria {
    
    protected Double saldo;
    
    public abstract void depositar(double valor);
    
    public abstract void sacar(double valor);
    
    public abstract void transferir(ContaBancaria contaTranferida, double valor);

    public Double getSaldo() {
        return saldo;
    }



    
    
    

    
}
