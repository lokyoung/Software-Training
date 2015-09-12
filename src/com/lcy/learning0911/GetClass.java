package com.lcy.learning0911;

import java.lang.reflect.Method;

public class GetClass {
	public static void printClassMethods(Object obj){
		//获取类的类类型
		Class c1 = obj.getClass();
		System.out.println("该类的名称是：" + c1.getName());
		Method[] ms = c1.getMethods();
//		for (Method method : ms) {
//			System.out.println(method.getName());
//		}
		for(int i=0; i<ms.length; i++){
			System.out.println("类方法:" + ms[i].getName());
			System.out.println("返回值类型:" + ms[i].getReturnType());
			System.out.print("参数是:" + "(");
		    Class params[] = ms[i].getParameterTypes();
		    for (Class class1 : params) {
				System.out.print(class1 + ",");
			}
		    System.out.println(")");
		}
	}
//	public static void main(String args[]){
//		Word word = new Word();
//		printClassMethods(word);
//	}
}
