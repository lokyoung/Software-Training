package com.lcy.learning0920;

/**
 * Created by lokyoung on 15/9/21.
 */
public class FloatDomain {
    private float f1;

    public static void main(String[] args){
        FloatDomain fd1 = new FloatDomain();
        FloatDomain fd2 = new FloatDomain();
        fd1.f1 = 2;
        fd2.f1 = 3;
        System.out.println("fd1.f1 = " + fd1.f1);
        System.out.println("fd2.f1 = " + fd2.f1);

//        fd1 = fd2;
//        fd1.f1 = 5;
//        System.out.println("fd1.f1 = " + fd1.f1);
//        System.out.println("fd2.f1 = " + fd2.f1);


        fd1.f1 = fd2.f1;
        fd1.f1 = 5;
        System.out.println("fd1.f1 = " + fd1.f1);
        System.out.println("fd2.f2 = " + fd2.f1);
    }
}
