package notificationsystem;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("uid1", "aadityar@gmail.com", "Aditya", "7488938889", "xyz");

        Notifier notifier = new Notifier();
        notifier.send("Hi! How are you", user1, NotificationChannelFactory.getChannel(ChannelType.SMS));
    }
}
