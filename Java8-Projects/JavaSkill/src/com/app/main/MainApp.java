package com.app.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

class A {
	A(){
		System.out.println("A");
	}
}
public class MainApp extends A{
	MainApp(){
		System.out.println("B");
	}

	static Boolean b1[] = new Boolean[5];

	public static void main(String[] args) {
//		String x = new String("test");
//		String y = "test";
//		System.out.println(x == y);
//		System.out.println(x.equals(y));


//		 System.out.println(b1[0]);
		float a = 10.20f;
		float b = 10.20f;

		new MainApp();


	}
	public static void show(Object o){
		System.out.println("Hello");
	}
}
