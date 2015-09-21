package com.lcy.learning0918;

/**
 * Created by lokyoung on 15/9/18.
 */
public interface Shape {
    public void draw();
    public void erase();
    public void move();
    public String getColor();
    public void setColor();
}

class Cricle implements Shape{
    public void draw(){

    }
    public void erase(){}
    public void move(){}
    public String getColor(){
        System.out.println("Cricle");
        return "Cricle";
    }
    public void setColor(){}
}

class Square implements Shape{
    public void draw(){}
    public void erase(){}
    public void move(){}
    public String getColor(){
        System.out.println("Square");
        return "Square";
    }
    public void setColor(){}
}