package com.lcy.learning0911;

import java.lang.reflect.Method;

public class RefelctDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Word word = new Word();
//		ClassUtils.printField(word);
//		ClassUtils.printConstruct("1");
		Class c = word.getClass();
		try {
			Method m = c.getMethod("say", new Class[]{String.class});
			//无返回值为null，有返回值则接收到对象类型的返回值
			Object o = m.invoke(word, new Object[]{"hello"});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
