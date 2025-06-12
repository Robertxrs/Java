package banco;

public class ContaBancaria {

    private String numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(String numeroConta, String nomeTitular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        deposit(depositoInicial);
    }

    public ContaBancaria(String numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double deposit(double deposito) {
        return saldo += deposito;
    }

    public void sacar(double deposito) {
        saldo -= deposito + 5.0;
    }

    public String toString() {
        return "Conta: "
                + numeroConta
                + " Titular: "
                + nomeTitular
                + " Saldo: R$ "
                + String.format("%.2f", saldo);
    }

}
