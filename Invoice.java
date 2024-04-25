/** 
 * 📝Separating invoice responsibilities into its own interface 
 * for a single responsibility and easier management.
 */ 

public interface Invoice {

    void generateInvoice(String fileName);
}
