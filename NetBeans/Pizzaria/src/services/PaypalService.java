
package services;

public class PaypalService implements OnlinePaymentService{

    @Override
    public double paymentFee(double tax) {
        return tax * 0.05;
    }
    
}
