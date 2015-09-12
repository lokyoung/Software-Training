package com.lcy.training;

import java.util.Scanner;

public class LuckyOne {
	public static void main(String[] args) {
		int lnum = (int) (Math.random() * 10);
		System.out.println("请输入您的4位会员号：");
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.next());
		if (num >= 1000 && num <= 9999) {
			int nnum = num / 100 % 10;
			if (lnum == nnum) {
				System.out.println("恭喜！");
			} else {
				System.out.println("很遗憾。幸运数字是：" + lnum);
			}
		} else{
			System.out.println("Invalid number");
		}
	}
}
