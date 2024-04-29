public class PaymentProcessor {
    
    private final PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(Order order) {
        paymentMethod.processPayment(order.getAmount());
    }
}