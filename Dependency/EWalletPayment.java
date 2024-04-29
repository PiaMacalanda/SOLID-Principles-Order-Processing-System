public class EWalletPayment implements PaymentMethod{

    @Override
    public void processPayment (Order order){

        System.out.println ("You are paying in GCash");
     }
  }