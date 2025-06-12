
package enumeracao;

import Entitie.Order;
import entities.enums.OrderStatus;
import java.util.Date;


public class Application {

    public static void main(String[] args) {
        
        Order order = new Order(1080, new Date(), OrderStatus.PEDING_PAYMENT);
           
        System.out.println(order);
        
        OrderStatus os1 = OrderStatus.DEVILERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        
        
    }
    
}
