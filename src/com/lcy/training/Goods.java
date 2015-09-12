package com.lcy.training;

public class Goods {
	private String brand;
	private double weight;
	private String type;
	private int price;
	public Goods(String brand, double weight, String type, int price){
		this.brand = brand;
		this.weight = weight;
		this.type = type;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
