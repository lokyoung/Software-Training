package com.lcy.thinking.array;

/**
 * Created by lokyoung on 15/10/6.
 */
public class ArrayStringCons {
    public static void main(String[] args){
        ArrayCons ac = new ArrayCons("1");
    }
}
class ArrayCons{
    ArrayCons(String param){
        System.out.println(param);
        ArrayCons[] ac = new ArrayCons[5];
    }
}
