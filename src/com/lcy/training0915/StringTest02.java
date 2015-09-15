package com.lcy.training0915;

import java.util.Scanner;

/**
 * Created by lokyoung on 15/9/15.
 */
public class StringTest02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一串字符:");
        String input  = sc.next();
        System.out.print("请输入要查找的字符:");
        String word = sc.next();
        int c = counter(input, word);
        System.out.println("\"" + input + "\"中包含" + c + "个\"" + word + "\"");
    }
    public static int counter(String input, String word){
        int count = 0;
        String[] s = new String[input.length()];
        for(int i=0; i<input.length(); i++){
            s[i] = input.substring(i,i+1);
        }
        for (String s1 : s) {
            if(s1.equals(word)){
                count += 1;
            }
        }
        return count;
    }
}
