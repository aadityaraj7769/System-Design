package notificationsystem;

public class User {
    private String userId;
    private String email;
    private String userName;
    private String phoneNumber;
    private String deviceId;

    public User(String uId, String mail, String name, String number, String dId) {
        userId = uId;
        email = mail;
        userName = name;
        phoneNumber = number;
        deviceId = dId;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDeviceId() {
        return deviceId;
    }

}
