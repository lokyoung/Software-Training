package com.lcy.learning0930;

/**
 * Created by lokyoung on 15/9/30.
 */
public class Dog {
    public void bark(int i, String s){
        System.out.println("barking");
    }
    public void bark(String s, int i){
        System.out.println("howling");
    }

    public static void main(String[] args){
        Dog d = new Dog();
        d.bark(1, "1");
        d.bark("1", 1);
    }
}
