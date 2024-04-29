public class OrderProcessor {
    private PaymentProcessor paymentProcessor;
  
    public OrderProcessor(PaymentProcessor paymentProcessor) {
      this.paymentProcessor = paymentProcessor;
    }
  
  
    public void processOrder(Order order) {
      if (paymentProcessor.authorizePayment(order.getTotalPrice(), order.getCustomerCardInfo())) {
        // ... fulfill order
        processPayment();
      } else {
        // Handle payment failure
      }
    }

    public void processPayment(){
        System.out.println("I processed the payment!");
    }
  }
  