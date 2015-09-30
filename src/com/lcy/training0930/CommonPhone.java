package com.lcy.training0930;

/**
 * Created by lokyoung on 15/9/30.
 */
public class CommonPhone extends MobilePhone implements Play{

    public CommonPhone(String brand, String type){
        super(brand, type);
    }

    @Override
    public void sendInfo() {
        System.out.println("发送信息....");
    }

    @Override
    public void call() {
        System.out.println("拨打电话....");
    }

    @Override
    public void info() {

    }

    @Override
    public void play(String content) {
        System.out.println("开始播放音乐："+ content);
    }
}
