
package entities;

public class Produto {
    
    private Integer amount;
    private String name;

    public Produto() {
    }

    public Produto(Integer amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
