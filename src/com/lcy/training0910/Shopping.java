package com.lcy.training0910;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d[] = new double[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入会员本月的消费记录");
		double sum = 0;
		for(int i=0; i<d.length; i++){
			System.out.print("请输入第"+(i+1)+"笔购物金额：");
			d[i] = sc.nextDouble();	
			sum = sum +d[i];
		}
		System.out.println("序号\t\t\t金额(元)");
		for(int i=0; i<d.length; i++){
			System.out.println((i+1) + "\t\t\t" + d[i]);
		}
		System.out.println("总金额\t\t\t" + sum);
	}

}
