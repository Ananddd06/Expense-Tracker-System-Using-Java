package src;

import java.util.*;

public class UserManager {
    private Map<String, User> users = new HashMap<>();

    // Register a new user
    public boolean register(String username, String password) {
        if (users.containsKey(username)) {
            return false; // Username already exists
        }
        users.put(username, new User(username, password)); // Add the user
        return true;
    }

    // Log in an existing user
    public boolean login(String username, String password) {
        User user = users.get(username); // Get the user by username
        return user != null && user.getPassword().equals(password); // Check if user exists and password matches
    }
}
