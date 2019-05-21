package com.gfa.bankofsimba.Model;

public class BankAccount {
    private String name;
    private int balance;
    private String animalType;
    private String password;

    public BankAccount(String name, int balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
    }

    public BankAccount() {
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
