package notificationsystem;

public class NotificationChannelFactory {

    public static NotificationChannel getChannel(ChannelType type) {
        if(type == ChannelType.EMAIL) {
            return new EmailChannel();
        }
        else if(type == ChannelType.SMS) {
            return new SmsChannel();
        }
        else {
            return new PushNotificationChannel();
        }
    }
}
