package com.gfa.reddit.user;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRequest {

    public long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String username;
    public String password;
    public String passwordAgain;

    List<String> errors;

    public UserRequest() {
        errors = new ArrayList<>();
    }

    public boolean validLogin() {
        errors.clear();
        if(this.username == null || this.username.isEmpty()) {
            errors.add("Please fill the username.");
        }
        if(this.password == null || this.password.isEmpty()) {
            errors.add("Please fill the password.");
        }
        if(checkSpecialChars(this.username)) {
            errors.add("Username should not contain any special characters.");
        }
        return errors.size() == 0;
    }

    public boolean validReg() {
        validLogin();
        if(this.passwordAgain == null || this.passwordAgain.isEmpty()) {
            errors.add("Please fill the password again.");
        }
        if(this.password != null && !this.password.equals(passwordAgain)) {
            errors.add("The two passwords should match");
        }
        return errors.size() == 0;
    }

    private boolean checkSpecialChars(String text) {
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);
        return m.find();
    }

    public void addError(String error) {
        this.errors.add(error);
    }

    public List<String> getErrors() {
        return errors;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordAgain() {
        return this.passwordAgain;
    }

    public void setPasswordAgain(String passwordAgain) {
        this.passwordAgain = passwordAgain;
    }

    public UserRequest username(String username) {
        this.username = username;
        return this;
    }

    public UserRequest password(String password) {
        this.password = password;
        return this;
    }

    public UserRequest passwordAgain(String passwordAgain) {
        this.passwordAgain = passwordAgain;
        return this;
    }
}
