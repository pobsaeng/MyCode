package com.app.java8.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class DoubleToStringFunction {

	static Function<Integer, String> doubleToStringCall = new Function<Integer, String>() {
		public String apply(Integer value) {
			if (value == 50) {
				return "Value is 5";
			} else {
				return "Value is not 5";
			}
		}
	};

	public static void main(String[] args) {

		//System.out.println(DoubleToStringFunction.doubleToStringCall.apply(50));

		List<Integer> value = new ArrayList<>();
		value.add(50);
		value.add(10);
		value.add(20);
		Integer value2 = aggegatedQuantity.apply(value);
		
		System.out.println("Calculated value: " + value2);

	}

	static Function<List<Integer>, Integer> aggegatedQuantity = t -> {
		int aggregatedQuantity = 0;

		for (Integer vak : t) aggregatedQuantity += vak;
		
		return aggregatedQuantity;
	};

}