package com.app.main;

public class Test1 {
	public static void main(String[] args) {
		for (int n = 3200; n < 100000; n *= 2) {
			int[] a = new int[n];
			long start = System.nanoTime();
			int diff = maxDiff(a);
			long d = (System.nanoTime() - start);
			System.out.println(n + " : " + d / 1E9);
		}
	}

	static int maxDiff(int[] d) {
		int maxDiff = 0;
		for (int i = 0; i < d.length; i++) {
			for (int j = i + 1; j < d.length; j++) {
				int diff = Math.abs(d[i] - d[j]);
				if (diff > maxDiff)
					maxDiff = diff;
			}
		}
		return maxDiff;
	}
}