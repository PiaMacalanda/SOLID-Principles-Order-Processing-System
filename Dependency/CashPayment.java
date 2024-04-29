public class CashPayment implements PaymentMethod{

    @Override
    public void processPayment (Order order){

        System.out.println ("You are paying using Cash");
     }
  }