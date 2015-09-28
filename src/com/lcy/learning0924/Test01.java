package com.lcy.learning0924;

import java.util.Random;

/**
 * Created by lokyoung on 15/9/24.
 */
public class Test01 {
    public static void main(String args[]){
        Random random = new Random();
        int a, b;
        for(int i=1; i<=24; i++){
            a = random.nextInt();
            b = random.nextInt();
            if(a < b){
                System.out.println("第" + i +"个数小于");
            } else if(a > b){
                System.out.println("第" + i +"个数大于");
            } else{
                System.out.println("第" + i +"个数等于");
            }
        }
    }
}
