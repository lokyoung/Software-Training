package com.lcy.training0928;

/**
 * Created by lokyoung on 15/9/28.
 */
public class Penguin {
    private String name;
    private int health;
    private int close;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getClose() {
        return close;
    }

    public void setClose(int close) {
        this.close = close;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Penguin(String name, int health, int close, String sex){
        this.name = name;
        this.health = health;
        this.close = close;
        this.sex = sex;
    }

    public void say(){
        System.out.println("Penguin say!");
    }
}
