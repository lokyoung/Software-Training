package com.lcy.learning0920;

/**
 * Created by lokyoung on 15/9/21.
 */
public class Dog {
    private String name;
    private String says;


    public static void main(String[] args){
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        d1.name = "dog1";
        d2.name = "dog2";
        d1.says = "haha";
        d2.says = "wangwang";

        Dog d3 = new Dog();
        d3 = d2;
        System.out.println(d3 == d2);
        System.out.println(d3.equals(d2));
        System.out.println(d3.name == d2.name);
        System.out.println(d3.name.equals(d2.name));
    }
}
