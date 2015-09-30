package com.lcy.training0930;

/**
 * Created by lokyoung on 15/9/30.
 */
public class AptitudePhone extends MobilePhone implements Network, TakePhoto, Play {

    public AptitudePhone(String brand, String type) {
        super(brand, type);
    }

    @Override
    public void sendInfo() {
        System.out.println("发送带有文字和图片的信息.......");
    }

    @Override
    public void call() {
        System.out.println("开启视频通话.......");
    }

    @Override
    public void info() {

    }

    @Override
    public void networkConn() {
        System.out.println("连接网络中.....");
    }

    @Override
    public void takePhoto() {
        System.out.println("拍照....");
    }

    @Override
    public void play(String content) {
        System.out.println("播放影片" + content);
    }
}
