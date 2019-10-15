package com.app.main;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPlayer {
	public static void main(String[] args) {
		List<String> list = addList();
//		getIndexOfListDisplay(list);
		System.out.println("---main data----");
		for(int i=0; i<list.size(); i++){
			System.out.print(list.get(i) + "("+i+")" + ",");
		}
		System.out.println();
		System.out.println("---- find from number 2-5 ----");
		int startIndex = 2;
		int endIndex = 5;
		for (String item : list) {
		    int index = list.indexOf(item);
		    if (index >= startIndex && index <= endIndex) {
		    	System.out.println(list.get(index));
		    }
		}
		System.out.println("---- find from text JSP-Struts ----");
		int findIndex1;
		int findIndex2;
		String startSearchIndex = "JSP";
		String endSearchIndex = "Struts";
		
		if (list.contains(startSearchIndex) && list.contains(endSearchIndex)) {
			findIndex1 = list.indexOf(startSearchIndex);
			findIndex2 = list.indexOf(endSearchIndex);
			for (int i = findIndex1; i <= findIndex2; i++) {
				System.out.print(list.get(i)+",");
			}
		}
	}

	public static void getIndexOfListDisplay(List<String> list) {
		int index = 0;
		if (list.size() < 0)return;

		if (list.contains("Struts")) {
			index = list.indexOf("Struts");
			System.out.println("index: " + index +" - " + list.size());
			for (int i = index; i < list.size(); i++) {
				System.out.print(list.get(i)+",");
			}
		}
		System.out.println();
		System.out.println("=form=");
		for (String string : list) {
			System.out.print(string + ",");
		}
	}

	public static List<String> addList() {
		String[] arrString = { "Java", "JSP", "JSF", "Struts", " Jboss",
				" Hibernate", " Spring" };
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < arrString.length; i++) {
			list.add(arrString[i].trim());
		}
		return list;
	}
}
