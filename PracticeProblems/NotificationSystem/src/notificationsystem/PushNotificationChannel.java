package notificationsystem;

public class PushNotificationChannel implements NotificationChannel {

    @Override
    public void send(String message, User user) {
        System.out.println("Sending Push Notification to user: " + user.getUserName() + "  " + message);
    }
}
