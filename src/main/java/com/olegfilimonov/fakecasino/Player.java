package com.olegfilimonov.fakecasino;

/**
 * @author Oleg Filimonov
 */
public class Player {
    String username;
    int balance;

    public Player(String username, int balance) {
        this.username = username;
        this.balance = balance;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void removeBalance(int amount) {
        this.balance -= amount;
    }

    public void addBalance(int amount) {
        this.balance += amount;
    }
}