package com.lcy.learning0911;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class RefelctDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		ArrayList al1 = new ArrayList();
		System.out.println("编译时:" + (al == al1));
		System.out.println("al.size=" + al.size());
		//这里由于指定了String为该集合的泛型，所以错误
		//al.add(1);
		/*
		 * java中集合的泛型，只在编译时有效，编译后就没有效果了
		 * 可以通过动态加载来绕过编译
		 * */
		Class c1 = al.getClass();
		Class c2 = al1.getClass();
		System.out.println("运行时:" + (c1 == c2));
		Method m;
		try {
			m = c1.getMethod("add", Object.class);
			m.invoke(al, 1);
			System.out.println("al.size=" + al.size());
			System.out.println(al);
			for (Object object : al) {
				System.out.println(al);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
