package com.lcy.training1008;

import java.util.Scanner;

/**
 * Created by lokyoung on 15/10/8.
 */
public class Exception01 {

    public static void lesson(String i) throws Exception{
        switch (i){
            case "1":
                System.out.println("java");
                break;
            case "2":
                System.out.println("C#");
                break;
            case "3":
                System.out.println("C");
                break;
            default:
                throw new Exception("输入错误");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入课程代号(1~3之间的数字)：");
        String i = sc.next();
        try{
            lesson(i);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("欢迎提出建议");
        }
    }
}
