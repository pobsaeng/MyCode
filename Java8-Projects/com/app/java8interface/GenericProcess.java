package com.app.java8interface;

interface GenericProcessClass<T, U, V> {
	abstract T insertAndupdate(U number1, V number2);
	abstract T delet(U number1);
}

public class GenericProcess {
	public static void main(String[] args) {
		GenericProcessClass<Integer, Integer, Integer> addInt = new GenericProcessClass<Integer, Integer, Integer>() {
			@Override
			public Integer insertAndupdate(Integer number1, Integer number2) {
				return number1 + number2;
			}

			@Override
			public Integer delet(Integer number1) {
				return null;
			}		
		};
		System.out.println(addInt.insertAndupdate(10, 30));
	}
}