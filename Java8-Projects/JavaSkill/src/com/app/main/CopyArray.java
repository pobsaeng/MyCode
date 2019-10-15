package com.app.main;

import java.util.ArrayList;
import java.util.List;

public class CopyArray {
	public static void main(String args[]) {
		String[] arrMain = { "Java", "JSP", "JSF", "Struts", " Jboss",
				" Hibernate", " Spring" };
		List<String> listMain = new ArrayList<String>();
		
		String[] arrCopy = new String[4];

		List<String> list = new ArrayList<String>();
		if (arrMain.length > 0) {
			for (int i = 0; i < arrMain.length; i++) {
				list.add(arrMain[i].trim());
				listMain.add(arrMain[i].trim());
			}

			for (int i = 0; i < listMain.size(); i++) {
				if(listMain.contains("Struts")){
					listMain.get(i);
					
				}
			}
			System.out.println(listMain.size());
			System.out.println("index of: " + listMain.indexOf("Struts"));
//			if (list.size() > 0) {
//				for (String string : list) {
//					System.out.println(string);
//				}
//			}
		}

		System.out.println("-----");

//		if (arrMain.length > 0) {
//			System.arraycopy(arrMain, 3, arrCopy, 0, 4);
//			for (int i = 0; i < arrCopy.length; i++) {
//				System.out.println(arrCopy[i].trim());
//			}
//		}

	}
}
