package com.lcy.training0928;

/**
 * Created by lokyoung on 15/9/29.
 */
public abstract class Pet {
    private String name;
    private int health;
    private int close;

    public Pet(String name, int health, int close) {
        this.name = name;
        this.health = health;
        this.close = close;
    }

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

    public abstract void say();
}
