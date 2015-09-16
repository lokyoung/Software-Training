package com.lcy.training0915;

import java.util.Scanner;

/**
 * Created by lokyoung on 15/9/15.
 */
public class StringTest0101 {
    public static void main(String[] args) {
        Register r = new Register();
        Scanner sc = new Scanner(System.in);
        boolean b;
        do {
            System.out.println("欢迎使用注册系统");
            System.out.print("请输入用户名:");
            String name = sc.next();
            System.out.print("请输入密码:");
            String pwd1 = sc.next();
            System.out.print("请再次输入密码:");
            String pwd2 = sc.next();
            b = r.verify(name, pwd1, pwd2);
        } while (b);
    }
}
