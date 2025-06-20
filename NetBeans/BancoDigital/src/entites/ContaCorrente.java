package entites;

public class ContaCorrente extends ContaBancaria {

    private Double saldo;

    public ContaCorrente(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor < saldo && valor > 0) {
            saldo -= valor;
        }
    }

    @Override
    public void transferir(ContaBancaria contaTranferida, double valor) {
        if (valor < saldo && valor > 0) {
            this.sacar(valor);
            contaTranferida.depositar(valor);
        }
    }

    @Override
    public String toString() {
        return "Conta Corrente - saldo: " + saldo;
    }

    
    
}
