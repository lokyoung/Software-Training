package com.lcy.training;

import java.util.Scanner;

public class Test9907 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("购物管理系统 > 客户管理系统 > 添加客户信息\n");
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			System.out.print("请输入会员号(4位整数)：");
			int num = sc.nextInt();
			if(num<1000 || num >9999){
				System.out.println("录入失败");
				continue;
			}
			System.out.print("请输入会员生日(月/日)：");
			String birth = sc.next();
			System.out.print("请输入会员积分：");
			int mark = sc.nextInt();
			System.out.println("您输入的会员信息是：\n" + num + "\t" + birth + "\t"
					+ mark + "\n");
		}
		System.out.println("程序结束！");
	}

}
