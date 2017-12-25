package domainentities;

public class User {
    private  String userName;
    private String password;
    public static String userString = "This is a user String";

    // constructors
    public User (){
        this("username", "password");
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;

    }

    // getters and setters
    public String getUserName() {
        return userName;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
