package com.lcy.learning1006;

/**
 * Created by lokyoung on 15/10/6.
 */
public class Initialize {
    public int i;
    public void init(){
        System.out.println(i);
    }
    public static void main(String[] args){
        Initialize i = new Initialize();
        i.init();
    }
}
