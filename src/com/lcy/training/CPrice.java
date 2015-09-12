package com.lcy.training;

public class CPrice {
	public static void check(int price){
		if(price <50){
			
		} else if(price >= 50 && price < 100){
			System.out.println("1：满50元，加2元换购百事可乐一瓶");
		} else if(price >= 100 && price < 200){
			System.out.println("1：满50元，加2元换购百事可乐一瓶");
			System.out.println("2：满100元，加3元可口可乐");
			System.out.println("3：满100元，加10元5公斤面粉");
		} else{
			System.out.println("1：满50元，加2元换购百事可乐一瓶");
			System.out.println("2：满100元，加3元可口可乐");
			System.out.println("3：满100元，加10元5公斤面粉");
			System.out.println("4：满200元，加10元炒菜锅");
			System.out.println("5：满200元，加20元欧莱雅");
		}
	}
}
