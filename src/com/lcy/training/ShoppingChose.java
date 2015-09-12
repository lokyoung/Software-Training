package com.lcy.training;

import java.util.Scanner;

public class ShoppingChose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入消费金额：");
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		System.out.println("是否参加优惠换购活动：");
		CPrice.check(price);
		System.out.println("0：不换购");
		System.out.println("请选择：");
		int chose = sc.nextInt();
		String goods = null;
		switch (chose) {
		case 1:
			price = price + 2;
			goods = "1瓶百事可乐";
			break;
		case 2:
			price = price + 3;
			goods = "1瓶可口可乐";
			break;
		case 3:
			price = price + 10;
			goods = "5公斤面粉";
			break;
		case 4:
			price = price + 10;
			goods = "1个炒菜锅";
			break;
		case 5:
			price = price + 20;
			goods = "1瓶欧莱雅";
			break;
		case 0:
			break;
		}
		System.out.println("本次消费金额：" + price);
		if(goods == null){
			
		} else{
			System.out.println("成功换购");
		}
	}

}
