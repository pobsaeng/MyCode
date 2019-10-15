package com.code.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapSorting {
	public static void main(String[] args) {
		Map<String,String> map = addValueToMap();

		
		long start = System.nanoTime();
//		CollectionsSort(map);
		ArraySort(map);
		long d = (System.nanoTime() - start);
		System.out.println("" + d / 1E9);
	}
	//adding values to Map
	public static Map<String,String> addValueToMap(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("3", "A");
		map.put("2", "B");
		map.put("1", "C");
		map.put("4", "D");
		map.put("5", "E");
		return map;
	}
	//sort by Collections
	public static void CollectionsSort(Map<String, String> map) {
		List<String> list = new ArrayList<String>();
		for (String str : map.keySet()) {
			list.add(str);
		}
		Collections.sort(list);
		for (String str : list) {
			System.out.println(str);
		}
	}
	//sort by Arrays
	public static void ArraySort(Map<String, String> map) {
		Object[] objArr = new Object[map.size()];
		int count = 0;
		for (String str : map.keySet()) {
			objArr[count] = str;
			count++;
		}
		Arrays.sort(objArr);
		for (Object str : objArr) {
			System.out.println(str);
		}
	}
}
