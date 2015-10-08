package com.lcy.training1008;

import java.util.Scanner;

/**
 * Created by lokyoung on 15/10/8.
 */

class Person{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception{
        if(age<=100 && age>=1) {
            this.age = age;
        } else{
            throw new Exception("年龄必须在1到100之间");
        }
    }
}

public class Exception02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入年龄：");
        int age = sc.nextInt();
        Person person = new Person();
        try{
            person.setAge(age);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
