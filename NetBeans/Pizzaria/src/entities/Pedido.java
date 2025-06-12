
package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    
    private Integer number;
    private LocalDate date;
    private List<Produto> itens;
    private int amount;

    private static  DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
  
    public Pedido() {
    }

    public Pedido(Integer number, LocalDate date, int amount) {
        this.number = number;
        this.date = date;
        this.amount = amount;
    }
  
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Produto> getItens() {
        return itens;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return date.format(fmt);
    }


    
    
}
