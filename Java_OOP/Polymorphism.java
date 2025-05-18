
 class Notification {
     public void send(String message)
     {
         System.out.println("Sending notification:"+message);
     }
 }
 class EmailNotification extends Notification
 {
     public void send(String message)
     {
         System.out.println("Sending email:"+message);
     }
 }
 class SMSNotification extends Notification
 {


     public void send(String message) {
         System.out.println("Sending SMS: " + message);
     }

 }

public class Polymorphism {
    public static void main(String[] args) {
        Notification sms=new SMSNotification();
        sms.send("You have a message!");
    }
}
