public class Costumer{

    private String name;
    private Discount discount;

    public void name(String name){
        this.name = name;
    }

    public void discount(Discount discount){
        this.discount = discount;
    }

    public double applyDiscount(double amount){
        return amount - discount.calculateDiscount(amount);
    }
}