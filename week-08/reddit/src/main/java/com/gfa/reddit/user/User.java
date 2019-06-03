package com.gfa.reddit.models;

import com.gfa.reddit.password.Password;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class User {

    @Id
    private String username;

    private String password;

    String cookie;

    @OneToMany(mappedBy = "user")
    List<Password> passwords;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public List<Password> getPasswords() {
        return this.passwords;
    }

    public void setPasswordItems(List<Password> passwords) {
        this.passwords = passwords;
    }

    /**
     * @param cookie the cookie to set
     */
    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    /**
     * @return the cookie
     */
    public String getCookie() {
        return cookie;
    }

    public String getUsername() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
