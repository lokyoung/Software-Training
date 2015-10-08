package com.lcy.thinking.myenum;

/**
 * Created by lokyoung on 15/10/8.
 */
public class MoneyTest {
    Money degree;
    public MoneyTest(Money degree){
        this.degree = degree;
    }
    public void describe(){
        switch (degree){
            case DOLLAR:
                System.out.println("This is DOLLAR");
                break;
        }
    }
    public static void main(String[] args){
        /*
        for (Money m : Money.values()) {
            System.out.println(m + " oridinal: " + m.ordinal());
        }
        */
        new MoneyTest(Money.DOLLAR).describe();
    }
}
