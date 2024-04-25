/** 
 * 📝Implements Notification interface, 
 * focusing solely on email notifications 
 * as per the Single Responsibility Principle.
 */ 

public class EmailNotification implements Notification {

    @Override
    public void sendEmailNotification(String email) {
        System.out.println("Email notification sent to: " + email);
    }
}