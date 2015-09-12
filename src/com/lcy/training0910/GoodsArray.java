package com.lcy.training0910;

public class GoodsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = new String[] { "Nike背包", "Adidas运动衫", "李宁运动鞋", "Kappa外套",
				"361度背包" };
		System.out.println("本次参与活动的特价商品有：");
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
	}

}
