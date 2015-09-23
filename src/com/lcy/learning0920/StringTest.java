package com.lcy.learning0920;

/**
 * Created by lokyoung on 15/9/21.
 */
public class StringTest {
    public static void TestString(String s1, String s2){
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
    public static void main(String[] args){
        TestString("1", "1");
        TestString("1", "2");
    }
}
