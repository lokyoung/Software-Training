package com.lcy.training0930;

/**
 * Created by lokyoung on 15/9/30.
 */
public abstract class MobilePhone {
    private String brand;
    private String type;

    public MobilePhone(String brand, String type){
        this.brand = brand;
        this.type = type;
        System.out.println("这是一款型号为" + type + "的" + brand + "手机");
    }

    public abstract void sendInfo();
    public abstract void call();
    public abstract void info();
}
