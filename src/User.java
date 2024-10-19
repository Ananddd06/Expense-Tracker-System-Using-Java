package src;

public class User {
    // for getting the username and the password
    private String username;
    private String password;

    public User(String username, String password) {
        // get that by using this kind of format
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        // get the username of the user
        return this.username;
    }

    public String getPassword() {
        // get the password of the particular username
        return this.password;
    }
}
