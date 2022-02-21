package com.example.leetcode;

import java.lang.reflect.Field;

public class Test {
	public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//		Student student = new Student();
//		Class<? extends Student> classObject1 = student.getClass();
//		System.out.println("classObject1.getDeclaredFields() = " + Arrays.toString(classObject1.getDeclaredFields()));
//
//		Class<?> classObject2 = Class.forName("com.example.leetcode.model.Student");
//		System.out.println("classObject2.getDeclaredFields() = " + Arrays.toString(classObject2.getDeclaredFields()));
//
//		Class<Student> classObject3 = Student.class;
//		System.out.println("classObject3.getDeclaredFields() = " + Arrays.toString(classObject3.getDeclaredFields()));

//		String s = "Hello world";
//		System.out.println("s = " + s);
//
//		Field value = String.class.getDeclaredField("value");
//		value.setAccessible(true);
//
//		char[] values = (char[]) value.get(s);
//		values[5] = '_';
//		System.out.println("values = " + new String(s));

		Integer a = 1;
		Integer b= 1;
		System.out.println("a ==b = " + (a==b));

		Integer aa = 128;
		Integer bb= 128;
		System.out.println("aa==bb = " + (aa==bb));


	}
}
