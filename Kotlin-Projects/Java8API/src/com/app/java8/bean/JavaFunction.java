package com.app.java8.bean;

import java.util.function.Function;

public class JavaFunction {
	public static void main(String[] args) {
		
		JavaFunction gn = new JavaFunction();

		System.out.println( gn.funcValidateFlag.apply("Pope") );
		
		System.out.println( JavaFunction.funcStaticCheck.apply("Camray") );
		
		System.out.println( gn.funcFlagCheck.apply("Joe") );
		
	}

	public Function<String, Double> funcValidateFlag = (v) -> v.equalsIgnoreCase("Pope") ? 55.0 : 0.0;
	
	public static Function<String, Integer> funcStaticCheck = (v) -> v.equalsIgnoreCase("Camray") ? 1000 : 500;
	
	public Function<String, String> funcFlagCheck = (v) -> {
		return v.equalsIgnoreCase("Joe") ? "Yes!" : "No!";
	};
}
