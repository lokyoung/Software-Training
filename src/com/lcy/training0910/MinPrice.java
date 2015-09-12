package com.lcy.training0910;

import java.util.Scanner;

public class MinPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d[] = new double[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入4家店的价格");
		double min = 0;
		for(int i=0; i<d.length; i++){
			System.out.print("请输入第"+(i+1)+"家店的价格：");
			d[i] = sc.nextDouble();	
			if(i==0){
				min = d[0];
			} else{
				if(d[i] < min){
					min = d[i];
				}
			}
		}
		System.out.println("最低价格是：" + min);
	}

}
