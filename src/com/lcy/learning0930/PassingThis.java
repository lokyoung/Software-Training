package com.lcy.learning0930;

/**
 * Created by lokyoung on 15/9/30.
 */
public class PassingThis {
    public static void main(String[] args){
        new Person().eat(new Apple());
    }
}

class Person{
    public void eat(Apple apple){
        Apple peeled = apple.getPeeld();
        System.out.println("Yummy");
    }
}

class Peeler{
    static Apple peel(Apple apple){
        return apple;
    }
}

class Apple{
    Apple getPeeld(){
        return Peeler.peel(this);
    }
}
