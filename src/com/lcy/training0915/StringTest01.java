package com.lcy.training0915;

import java.util.Scanner;

/**
 * Created by lokyoung on 15/9/15.
 */
public class StringTest01 {
    public static void main(String[] args){
        User u = new User();
        Scanner sc = new Scanner(System.in);
        while (!u.isCheck()){
            System.out.println("欢迎使用注册系统");
            System.out.print("请输入用户名:");
            u.setName(sc.next());
            System.out.print("请输入密码:");
            u.setPassword(sc.next());
            System.out.print("请再次输入密码:");
            u.setPasswordConfirm(sc.next());
            System.out.println(u.result());
        }
    }
}
