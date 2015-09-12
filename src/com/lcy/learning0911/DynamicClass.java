package com.lcy.learning0911;

public class DynamicClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//动态加载类，在运行时加载
			Class c = Class.forName(args[0]);
			//通过类类型，创建该类对象
			Office o = (Office)c.newInstance();
			o.start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
