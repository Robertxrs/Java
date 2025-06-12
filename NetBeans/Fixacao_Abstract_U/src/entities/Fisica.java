package entities;

public class Fisica extends Pessoa {

    private double gastoSaude;

    public Fisica(double gastoSaude, String name, double rendaAtual) {
        super(name, rendaAtual);
        this.gastoSaude = gastoSaude;
    }

    public double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double imposto() {
        double impostoBasico = (getRendaAtual()< 20000.0)? getRendaAtual() * 0.15 : getRendaAtual()*0.25; 
        impostoBasico -= getGastoSaude() * 0.5;
        if (impostoBasico < 0.0) {
            return 0;
        }
        return impostoBasico;
    }

}
