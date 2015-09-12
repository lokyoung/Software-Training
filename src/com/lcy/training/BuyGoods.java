package com.lcy.training;

public class BuyGoods {
	private String name;
	private double price;
	private int count;
	private double totalprice;
	private double cut;
	public BuyGoods(String name, double price, int count, double cut){
		this.setName(name);
		this.setPrice(price);
		this.setCount(count);
		this.totalprice = price * count * cut;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTotalprice() {
		return totalprice;
	}
}
