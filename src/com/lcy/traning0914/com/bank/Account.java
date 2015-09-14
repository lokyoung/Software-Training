package com.lcy.traning0914.com.bank;

/**
 * Created by lokyoung on 15/9/14.
 */
public class Account {
    private int money;

    public Account(){
        money = 0;
    }

    public void saveMoney(int sMoney){
        money += sMoney;
    }

    public void takeMoney(int tMoney){
        money -= tMoney;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
