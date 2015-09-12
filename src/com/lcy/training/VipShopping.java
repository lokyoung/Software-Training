package com.lcy.training;

import java.util.Scanner;

public class VipShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b;
		System.out.println("是否为会员(y/n)");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
//		System.out.println(s1);
		if(s1.equals("y")){
			b = true;
		} else{
			b = false;
		}
//		System.out.println(b);
		System.out.println("请输入购物金额：");
		double price = sc.nextDouble();
		if(b){
			if(price >= 200){
				price = price * 0.75;
			} else{
				price = price * 0.8;
			}
		} else{
			if(price >= 100){
				price = price * 0.9;
			} else{
				
			}
		}
		System.out.println("实际支付：" + price);
	}

}
