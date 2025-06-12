
package services;

public class Credit implements OnlinePaymentService{

    @Override
    public double paymentFee(double tax) {
       return tax * 0.09; 
    }
    
}
