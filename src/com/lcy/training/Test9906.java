package com.lcy.training;

public class Test9906 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		while(i<=10){
			sum = sum + i;
			if(sum > 20){
				break;
			}
			i = i + 1;
		}
		System.out.println(sum);
		System.out.println(i);
	}

}
