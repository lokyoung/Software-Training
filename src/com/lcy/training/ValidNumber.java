package com.lcy.training;

import java.util.Scanner;

public class ValidNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入会员号(4位整数)：");
		int num = Integer.parseInt(sc.next());
		if (num >= 1000 && num <= 9999) {
			System.out.print("请输入会员生日(月／日<用两位数表示>)：");
			String birth = sc.next();
			System.out.print("请输入积分：");
			int count = sc.nextInt();
			System.out.println("已录入的会员信息是：");
			System.out.print(num + "/t" + birth + "/t" + count);
		} else {
			System.out.println("会员号不合法！");
		}
	}

}
