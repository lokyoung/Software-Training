package com.lcy.learning1006;

/**
 * Created by lokyoung on 15/10/6.
 */
class Tank{
    static String s1 = "s1";
    static String s2;
    static{
        s2 = "s2";
        System.out.println(s1);
        System.out.println(s2);
    }
    Tank(){
        System.out.println("Tank init");
    }
}
public class StaticTest {
    public static void main(String[] args){
        Tank tank = new Tank();
    }
}
