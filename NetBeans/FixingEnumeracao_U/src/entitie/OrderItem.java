
package entitie;

public class OrderItem {
    private Product product;
    private double price;
    private Integer quantity;
   
    

    public OrderItem() {
    }

    public OrderItem(Product product, double price, Integer quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }


    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public double subTotal(){
        return quantity * price;
    }

    @Override
    public String toString() {
       return getProduct().getName()
               +", $"
               +String.format("%.2f", price)
               + ", Quantity: "
               + quantity
               + ", Subtotal: $"
               + String.format("%.2f",subTotal());
    }
    
    
}
