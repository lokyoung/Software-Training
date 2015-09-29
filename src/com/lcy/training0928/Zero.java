package com.lcy.training0928;

import java.util.Scanner;

/**
 * Created by lokyoung on 15/9/28.
 */
public class Zero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float f = sc.nextInt();
        if(f == 0.0){
            System.out.println("相等");
        } else{
            System.out.println("不等");
        }
    }
}
