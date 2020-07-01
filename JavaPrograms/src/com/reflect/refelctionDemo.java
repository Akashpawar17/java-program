package com.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class refelctionDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class c = Class.forName("com.reflect.Test");
		
		Test t = (Test)c.newInstance();
		
		Method m = c.getDeclaredMethod("show", null);
		
		
		m.setAccessible(true);
		m.invoke(t, null);

	}

}
