package com.lcy.learning;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by lokyoung on 15/9/20.
 */
public class Main {
    public static void main(String[] args){
        Scanner  sin = new Scanner(System.in);
        BigInteger a,b,ans;
        int cas;
        cas=sin.nextInt();
        for(int t=1;t<=cas;t++){
            a=sin.nextBigInteger();
            b=sin.nextBigInteger();
            ans=a.add(b);
            System.out.println("Case "+t+":");
            System.out.println(a+" + "+b+" = "+ans);
            System.out.println();
        }
    }
}
