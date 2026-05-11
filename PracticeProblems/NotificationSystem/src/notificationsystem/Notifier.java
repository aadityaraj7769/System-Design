package notificationsystem;

public class Notifier {

    public void send(String message, User user, NotificationChannel channel) {
        channel.send(message, user);
    }

}
