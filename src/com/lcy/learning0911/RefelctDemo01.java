package com.lcy.learning0911;

public class RefelctDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foo foo = new Foo();
		/*
		 * f1,f2 为Foo类的类类型(class type)
		 * 类也是对象，是Class类的实例对象
		 */
		Class f1 = Foo.class;

		Class f2 = foo.getClass();
		// f1, f2都表示Foo类的类类型，一个类只能是Class类的一个实例对象
		System.out.println(f1 == f2);
		try {
			Class f3 = Class.forName("com.lcy.learning.Foo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Foo f = (Foo)f1.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class Foo {

}
