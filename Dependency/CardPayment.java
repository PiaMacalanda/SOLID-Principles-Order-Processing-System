public class CardPayment implements PaymentMethod{

    @Override
    public void paymentMethod(double amount) {

        System.out.print("You are paying using CreditCard");
    }
}