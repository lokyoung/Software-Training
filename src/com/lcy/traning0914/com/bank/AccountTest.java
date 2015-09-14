package com.lcy.traning0914.com.bank;

import java.util.Scanner;

/**
 * Created by lokyoung on 15/9/14.
 */
public class AccountTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Account a = new Account();
        System.out.println("1.存款 \t 2.取款 \t 0.退出");
        System.out.print("请选择你要办理的业务:");
        String s1 = sc.next();
        while (s1.equals("1") || s1.equals("2")){
            if(s1.equals("1")){
                System.out.print("请输入存款金额:");
                a.saveMoney(sc.nextInt());
                System.out.println("存款成功");
            } else{
                System.out.print("请输入取款金额:");
                int tMoney = sc.nextInt();
                if(tMoney > a.getMoney()){
                    System.out.println("取款失败，金额不足");
                } else{
                    a.takeMoney(tMoney);
                    System.out.println("取款成功");
                }
            }
            System.out.println("当前余额:" + a.getMoney());
            System.out.println("1.存款 \t 2.取款 \t 0.退出");
            System.out.print("请选择你要办理的业务:");
            s1 = sc.next();
        }
        System.out.println("谢谢使用");
    }
}
