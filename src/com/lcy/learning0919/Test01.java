package com.lcy.learning0919;

/**
 * Created by lokyoung on 15/9/19.
 */
public class Test01 {
    public static void main(String args[]) {
        Car car = new Car(1, '1');
        System.out.println(car.i);
        System.out.println(car.c);
        car.Car();
    }
}
class Car{
    int i;
    char c;
    public Car(){

    }

    public Car(int i, char c){
        this.i = i;
        this.c = c;
    }

    public void Car(){
        System.out.println("car!");
    }
}
