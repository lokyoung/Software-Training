package com.lcy.learning0922;

/**
 * Created by lokyoung on 15/9/23.
 */
public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public static void main(String[] args){
        Person person1 = new Person("tom");
        Person person2 = new Person("jerry");

//        person1 = person2;
//        person1.name = "tom";
//        System.out.println(person2.name);

        person1.name = person2.name;
        person1.name = "tom";
        System.out.println(person2.name);
    }
}
