package com.lcy.training0910;

public class Customer {
	private int marks;
	private String cardType;
	public Customer(int marks, String cardType){
		this.marks = marks;
		this.cardType = cardType;
	}
	public void show(){
		System.out.println("会员积分：" + marks + "\n会员卡类型：" + cardType);
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	public static void main(String args[]){
		Customer c = new Customer(1000, "金卡");
		c.show();
	}
}
