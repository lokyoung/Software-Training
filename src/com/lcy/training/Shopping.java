package com.lcy.training;

import java.util.*;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入折扣");
		Scanner sc = new Scanner(System.in);
		double cut = Double.parseDouble(sc.next());
		BuyGoods bg = new BuyGoods("足球鞋", 450, 1, 0.8);
		System.out.println("**********消费单************\n"
				         + "购买物品\t 单价 \t 个数 \t 金额");
		
	}

}
