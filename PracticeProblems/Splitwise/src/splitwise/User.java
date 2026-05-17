package src.splitwise;

public class User {

      private String userId;
      private String userName;
      private String phoneNumber;

      public User(String userId, String userName, String phoneNumber) {
            this.userId = userId;
            this.userName = userName;
            this.phoneNumber = phoneNumber;
      }

      public String getUserId() {
            return userId;
      }

      public String getUserName() {
            return userName;
      }

      public String getPhoneNumber() {
            return phoneNumber;
      }
}
