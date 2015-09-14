package com.lcy.traning0914;

/**
 * Created by lokyoung on 15/9/14.
 */
public class Manager {
    private String name;
    private String password;

    public Manager(String name, String password){
        this.name = name;
        this.password = password;
    }
    public void show(){
        System.out.println("管理员姓名：" + name + "\t密码为：" + password);
    }

    public static void main(String args[]){
        Manager m = new Manager("lcy", "123321");
        m.show();
    }
}
