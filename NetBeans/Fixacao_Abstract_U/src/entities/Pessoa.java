package entities;

public abstract class Pessoa {

    private String name;
    private double rendaAtual;

    public Pessoa() {
    }

    public Pessoa(String name, double rendaAtual) {
        this.name = name;
        this.rendaAtual = rendaAtual;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRendaAtual() {
        return rendaAtual;
    }

    public void setRendaAtual(double rendaAtual) {
        this.rendaAtual = rendaAtual;
    }

    public abstract double imposto();

}
