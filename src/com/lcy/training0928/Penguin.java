package com.lcy.training0928;

/**
 * Created by lokyoung on 15/9/28.
 */
public final class Penguin extends Pet {

    private String sex;

    public Penguin(String name, int health, int close, String sex) {
        super(name, health, close);
        this.sex = sex;
    }

    public void say(){
        System.out.println("我的名字叫" + super.getName() + ", 健康值是:" + super.getHealth() +
                ", 和主人的亲密度是" + super.getClose() + ", 我的性别是" + sex);
    }
}
