package com.lcy.learning0918;

/**
 * Created by lokyoung on 15/9/18.
 */
public class ShapeController {
    public static void main(String args[]){
        Cricle c = new Cricle();
        Square s = new Square();
        sendMessage(c);
        sendMessage(s);
    }
    public static void sendMessage(Shape shape){
        shape.getColor();
    }
}
