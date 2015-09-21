package com.lcy.learning0920;

import java.util.Random;

/**
 * Created by lokyoung on 15/9/21.
 */
public class CalSpeed {
    private float speed;
    private float time;
    private float length;

    public float calSpeed(){
        speed = length/time;
        return speed;
    }

    public static void main(String[] args){
        Random r = new Random();
        CalSpeed cs = new CalSpeed();
        cs.time = r.nextFloat();
        cs.length = r.nextFloat();
        System.out.println(cs.calSpeed());
    }
}
