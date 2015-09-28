package com.lcy.training0928;

import java.util.Scanner;

/**
 * Created by lokyoung on 15/9/28.
 */
public class BuyPet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎来到宠物店");
        System.out.print("请输入要领养的宠物名字：");
        String name = sc.next();
        System.out.print("请选择要领养的宠物类型：(1.狗狗 2.企鹅)");
        int type = sc.nextInt();
        if(type==1){
            System.out.print("请选择狗狗的品种：(1.拉布拉多 2.哈士奇)");
            int i = sc.nextInt();
            String dtype;
            switch (i){
                case 1:
                    dtype = "拉布拉多";
                    break;
                case 2:
                    dtype = "哈士奇";
                    break;
                default:
                    dtype = "大白";
                    break;
            }
            System.out.print("请输入狗狗的健康值(1到100之间):");
            int health  = sc.nextInt();
            if(health<1 || health > 100){
                System.out.println("健康值应该在1到100之间，默认值为60。");
                health = 60;
            }
            Dog d = new Dog(name, health, 0, dtype);
            d.say();
        } else if(type==2){

        } else{
            System.out.println("输入错误");
        }
    }
}
