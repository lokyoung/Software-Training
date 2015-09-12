package com.lcy.learning0911;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtils {
	public static void printClassMethods(Object obj){
		//获取类的类类型
		Class c1 = obj.getClass();
		System.out.println("该类的名称是：" + c1.getName());
		/*
		 * getMethods()获取方法包括从父类继承来的
		 * getDeclaredMethods()为自身定义的方法
		 * */
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
	public static void printField(Object obj) {
		/*
		 * 成员变量也是对象
		 * java.lang.reflect.Field
		 * Field类封装了关于成员变量的操作
		 * getFields()获取该类所有成员变量
		 * getDeclaredFields()获取该类自己定义的成员变量
		 * */
		Class c = obj.getClass();
		Field[] f = c.getDeclaredFields();
		for (Field field : f) {
			//获取数据类型
			Class fieldtype = field.getType();
			String fieldname = fieldtype.getName();
			System.out.println(fieldname);
		}
		
	}
	
	public static void printConstruct(Object obj){
		Class c = obj.getClass();
		Constructor[] cs = c.getDeclaredConstructors();
		for (Constructor constructor : cs) {
			Class []param = constructor.getParameterTypes();
			for (Class class1 : param) {
				System.out.println(class1);
			}
		}
	}
}
