package com.lcy.learning0930;

/**
 * Created by lokyoung on 15/9/30.
 */
public class This {
    private int i = 0;
    public This increment(){
        i++;
        return this;
    }

    public void print(){
        System.out.println("i = " + i);
    }

    public static void main(String[] args){
        This t = new This();
        t.increment().increment().print();
    }
}
