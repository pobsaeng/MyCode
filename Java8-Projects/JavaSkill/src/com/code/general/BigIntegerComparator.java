package com.code.general;

import java.math.BigInteger;
public class BigIntegerComparator {
	public static void main(String[] args) {
		BigInteger bi1 = new BigInteger("40234");
		BigInteger bi2 = new BigInteger("40123");

		int res = bi1.compareTo(bi2);
		if (res == 0) {
			System.out.println("Both values are equal");
		} else if (res == 1) {
			System.out.println("First Value is greater");
		} else if (res == -1) {
			System.out.println("Second value is greater");
		}
	}
}
