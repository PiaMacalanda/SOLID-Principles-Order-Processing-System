/** 
 * 📝Implements Invoice interface, 
 * ensuring single responsibility 
 * and adherence to the Open/Closed Principle.
 */

public class InvoiceAction implements Invoice {

    @Override
    public void generateInvoice(String fileName) {

        System.out.println("Invoice generated: " + fileName);
    }
}