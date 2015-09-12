package com.lcy.training;

import java.util.Scanner;

public class Fenshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入分数：");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		double count;
		if (i > 0) {
			if (i < 2000) {
				count = 0.9;
			} else if (i >= 2000 && i < 4000) {
				count = 0.8;
			} else if (i >= 4000 && i < 8000) {
				count = 0.7;
			} else {
				count = 0.6;
			}
			System.out.println("折扣是：" + count);
		} else {
			System.out.println("没有积分！");
		}

	}

}
