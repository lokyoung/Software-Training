package com.lcy.training0928;

/**
 * Created by lokyoung on 15/9/28.
 */
public class Dog {

    private String name;
    private int health;
    private int close;
    private String type;

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


    public Dog(String name, int health, int close, String type){
        this.name = name;
        this.health = health;
        this.close = close;
        this.type = type;
    }

    public void say(){
        System.out.println("我的名字叫" + name + ", 健康值是:" + health +
                        ", 和主人的亲密度是" + close + ", 我是一只" + type);
    }
}
