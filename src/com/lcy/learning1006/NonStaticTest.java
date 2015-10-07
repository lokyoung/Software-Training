package com.lcy.learning1006;

/**
 * Created by lokyoung on 15/10/6.
 */
class Tank1{
    String s1;
    {
        s1 = "s1";
    }
    public Tank1(){
        System.out.println(s1);
    }
}
public class NonStaticTest {
    public static void main(String[] args){
        Tank1 tank1 = new Tank1();
    }
}
