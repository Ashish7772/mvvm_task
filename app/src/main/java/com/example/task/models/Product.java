package com.example.task.models;

public class Product {

    String welcome;
    String money;
    String account;

    public String getWelcome() {
        return welcome;
    }

    public void setWelcome(String welcome) {
        this.welcome = welcome;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Product(String welcome, String money, String account) {
        this.welcome = welcome;
        this.money = money;
        this.account = account;
    }
}
