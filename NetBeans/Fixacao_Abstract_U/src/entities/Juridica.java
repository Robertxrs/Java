package entities;

public class Juridica extends Pessoa {

    private int funcionarios;

    public Juridica() {
    }

    public Juridica(int funcionarios, String name, double rendaAtual) {
        super(name, rendaAtual);
        this.funcionarios = funcionarios;
    }

    public int getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(int funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public double imposto() {
        if (funcionarios > 10) {
            return getRendaAtual() * 0.14;
        } else {
            return getRendaAtual() * 0.16;
        }
    }

}
