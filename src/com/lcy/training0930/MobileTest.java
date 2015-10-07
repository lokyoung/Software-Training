package com.lcy.training0930;

/**
 * Created by lokyoung on 15/9/30.
 */
public class MobileTest {
    public static void main(String[] args){
        CommonPhone cm = new CommonPhone("诺基亚", "1000");
        cm.call();
        cm.play("Season in the sun");
        cm.sendInfo();
        System.out.println();

        AptitudePhone ap = new AptitudePhone("苹果", "6");
        ap.call();
        ap.sendInfo();
        ap.play("蝙蝠侠");
        ap.takePhoto();
        ap.networkConn();
    }
}
