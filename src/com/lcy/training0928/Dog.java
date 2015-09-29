package com.lcy.training0928;

/**
 * Created by lokyoung on 15/9/28.
 */
public final class Dog extends Pet{

    private String type;

    public Dog(String name, int health, int close, String type) {
        super(name, health, close);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public void say(){
        System.out.println("我的名字叫" + super.getName() + ", 健康值是:" + super.getHealth() +
                        ", 和主人的亲密度是" + super.getClose() + ", 我是一只" + type);
    }

}
