package notificationsystem;

public class SmsChannel implements NotificationChannel {

    @Override
    public void send(String message, User user) {
        System.out.println("Sending SMS to userr: " + user.getUserName() + "  " + message);
    }
}
