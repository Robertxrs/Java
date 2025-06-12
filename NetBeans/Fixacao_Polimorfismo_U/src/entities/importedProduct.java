
package entities;

public class importedProduct extends Product{
    private double valorTaxa;

    public importedProduct(double valorTaxa, String name, double price) {
        super(name, price);
        this.valorTaxa = valorTaxa;
    }

    public importedProduct() {
    }

    public double getValorTaxa() {
        return valorTaxa;
    }

    public void setValorTaxa(double valorTaxa) {
        this.valorTaxa = valorTaxa;
    }
    public double  totalPrice(){
        return getPrice() + valorTaxa;
    }
    
	@Override
	public String priceTag() {
		return getName() 
				+ " $ " 
				+ String.format("%.2f", totalPrice())
				+ " (Customs fee: $ " 
				+ String.format("%.2f", valorTaxa)
				+ ")";
}
}