package com.lcy.training;

public class Price {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods g = new Goods("爱国者", 12.4, "内置锂电池", 499);
		System.out.println(g.getBrand());
		System.out.println(g.getPrice());
		System.out.println(g.getType());
		System.out.println(g.getWeight());
	}

}
