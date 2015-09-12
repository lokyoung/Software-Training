package com.lcy.training0910;

import java.util.Scanner;

public class Visitor {
	private String name;
	private int age;

	public Visitor(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}
	
	public String check(int age){
		if(age > 18){
			return "20";
		} else{
		return "免费";
		}
	}
	
	public void show(){
		System.out.println(name + "的年龄为："+ age + ", 门票价格：" + check(age) + "\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("请输入姓名：");
			String name = sc.next();
			if (name.equals("n")) {
				System.out.println("程序结束。");
				break;
			} else {
				System.out.print("请输入年龄：");
				int age = sc.nextInt();
				Visitor v1 = new Visitor(name, age);
				v1.show();
			}
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
