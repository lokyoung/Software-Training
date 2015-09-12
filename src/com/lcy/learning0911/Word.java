package com.lcy.learning0911;

public class Word implements Office{
	String name;
	static int i;
	public void start(){
		System.out.println("Word start");
	}
	public void say(String s1){
		System.out.println(s1);
	}
}
