package com.lcy.learning0930;

/**
 * Created by lokyoung on 15/9/30.
 */
public class This02 {
    int i = 0;
    String s = "";
    public This02(int i){
        this.i = i;
    }
    public This02(String s){
        this.s = s;
    }
    public This02(int i, String s){
        this(i); //this调用另外一个构造方法必须放在当前构造方法的第一行，且只能用一次
        this.s = s;
    }
}
