package com.pluralsight.week10.enumexercise;

public class User {
    private String username;
    private UserRole userRole;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public void printRole() {
        System.out.println(this.userRole);
    }

    public void printPermissions() {
        switch (userRole) {
            case USER:
                System.out.println("You are a user. Don't break the application please.");
                break;
            case EDITOR:
                System.out.println("You are an editor. Be creative.");
                break;
            case ADMIN:
                System.out.println("You are an admin. Be responsible.");
                break;
        }
    }

    public String getRoleName() {
        String s = switch(userRole) {
            case USER -> "regular user";
            case EDITOR -> "creative editor";
            case ADMIN -> "responsible admin";
        };
        return s;
    }
}
