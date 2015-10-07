package com.lcy.learning0930;

/**
 * Created by lokyoung on 15/9/30.
 */
public class This01 {
    public void method01(){
        //在方法内部调用同一个类的另一个方法，可以不用写this，编译器会自动加上
        method02();
        this.method02();
    }

    public void method02(){

    }
}
