package com.lcy.training;

import java.util.Scanner;

public class ShopManage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\t欢迎登录购物管理系统");
		System.out.println("\t\t 1.login");
		System.out.println("\t\t 2.exit");
		System.out.println("****************************************");
		System.out.print("请选择，输入数字：");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		switch (i) {
		case 1:
			for (int j = 0; j <= 10; j++) {
				System.out.println();
			}
			System.out.println("1.客户信息管理");
			System.out.println("2.购物结算");
			System.out.println("3.真情回馈");
			System.out.println("4.注销");
			int k = sc.nextInt();
			switch (k) {
			case 1:
				for (int j = 0; j <= 10; j++) {
					System.out.println();
				}
				System.out.println("购物管理系统>客户信息管理");
				System.out.println("1.显示所有客户信息");
				System.out.println("2.添加客户信息");
				System.out.println("3.修改客户信息");
				System.out.println("4.查询客户信息");
				break;
			case 2:
				break;
			case 3:
				for (int j = 0; j <= 10; j++) {
					System.out.println();
				}
				System.out.println("购物管理系统>真情回馈");
				System.out.println("1.幸运大放送");
				System.out.println("2.幸运抽奖");
				System.out.println("3.生日问候");
				break;
			case 4:
				break;
			default:
				break;
			}
			break;
		case 2:
			for (int j = 0; j <= 10; j++) {
				System.out.println();
			}
			break;
		default:
			break;
		}
	}

}
