package com.lcy.thinking.params;

/**
 * Created by lokyoung on 15/10/8.
 */
public class VariableString {
    public static void vString(String...args){
        for (String arg : args) {
            System.out.println(arg);
        }
    }
    public static void main(String[] args){
        vString("1", "2", "3");
    }
}
