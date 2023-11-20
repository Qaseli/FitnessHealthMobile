package com.example.fitnesshealthmobile;

public class Users {

    String Name, Email, Feedback;

    public Users() {
    }

    public Users(String name, String email, String feedback) {
        Name = name;
        Email = email;
        Feedback = feedback;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getFeedback() {
        return Feedback;
    }

    public void setFeedback(String feedback) {
        Feedback = feedback;
    }
}
