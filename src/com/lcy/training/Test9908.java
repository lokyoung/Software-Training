package com.lcy.training;

import java.util.Scanner;

public class Test9908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i = 3; i >= 1; i--) {
			System.out.print("请输入用户名：");
			String name = sc.next();
			System.out.print("请输入密码：");
			String password = sc.next();
			if (name.equals("lcy") && password.equals("123321")) {
				System.out.println("欢迎登录购物系统！");
				break;
			}
			if(i > 1){
			System.out.println("输入错误，您还有"+ (i-1) +"次机会");
			} else{
				System.out.println("登录失败！");
			}
		}
	}

}
