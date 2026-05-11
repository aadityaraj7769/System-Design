package notificationsystem;

public interface NotificationChannel {
  void send(String message, User user);
}
