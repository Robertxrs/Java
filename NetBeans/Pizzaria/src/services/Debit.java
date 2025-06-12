
package services;

public class Debit implements OnlinePaymentService{

    @Override
    public double paymentFee(double tax) {
        return (tax * 0.10) - tax * 0.04 ;
    }
    
}
