package com.lcy.learning0930;

/**
 * Created by lokyoung on 15/9/30.
 */
/*
class Book{
    boolean b = true;
    public Book(boolean b){
        this.b = b;
    }
    void check(){
        b = false;
    }
    protected void finalize(){
        if(true){
            System.out.println("Error!");
        }
    }
}
*/
public class Finalize01 {
    public static void main(String[] args){
        Tank t1 = new Tank("full");
        t1.empty();
        new Tank("full");
        System.gc();
    }
}

class Tank{
    private String status;
    public Tank(String status){
        this.status = status;
    }
    public void empty(){
        status = null;
    }
    protected void finalize(){
        if(status != null){
            System.out.println("Error: The tank is not null!");
        }
    }
}

