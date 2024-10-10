package com.xiaojianbang.java;

public class Account {
    private String name= null;
    private String password = null;
    private int balance = 0;

    public Account(String name, String password, int balance) {
        if(name.length() > 4 || name.length() < 2) {
            System.out.println("姓名长度没有在2-4之间 默认设置为tom");
            this.name = "tom";
        }
        else{
            System.out.println("姓名设置成功");
            this.name = name;
        }
        setPassword(password);
        setBalance(balance);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() != 6) {
            System.out.println("密码长度不是6位 默认设置为123456");
            this.password = "123456";
        }
        else{
            System.out.println("密码设置成功");
            this.password = password;
        }

    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance < 20) {
            System.out.println("余额必须要大于20 设置为20");
            this.balance = 20;
        }
        else {
            System.out.println("余额设置成功");
            this.balance = balance;
        }

    }

    public String getName() {
        return name;
    }
}
