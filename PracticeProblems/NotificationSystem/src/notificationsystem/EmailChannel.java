package notificationsystem;

public class EmailChannel implements NotificationChannel {

    @Override
    public void send(String message, User user) {
        System.out.println("Sending EMAIL to user: " + user.getUserName() + " " + message);
    }
}
