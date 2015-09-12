package com.lcy.training;

import java.util.*;

public class ShopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainMenu mm = new MainMenu();
		System.out.println("请选择，输入数字");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int i = Integer.parseInt(s);
		if(i == 1){
			for(int j=0;j<=50;j++){
				System.out.println();
				}
			ShopMenu sm = new ShopMenu();
		} else{
			for(int j=0;j<=50;j++){
				System.out.println();
				}
		}
//		ShopMenu sm = new ShopMenu();
	}

}
