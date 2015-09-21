package com.lcy.learning0920;

import java.util.Random;

/**
 * Created by lokyoung on 15/9/21.
 */
public class Coin {
    public static void main(String[] args){
        Random r = new Random();
        int i = r.nextInt(2);
        if(i<1){
            System.out.println("正面");
        } else{
            System.out.println("反面");
        }
    }
}
