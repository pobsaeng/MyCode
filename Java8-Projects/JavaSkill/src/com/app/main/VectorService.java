package com.app.main;

import java.util.Vector;

class VectorService {
	public static void display(Vector v) {
		for (int i = 0; i < v.size(); i++) {
			System.out.print(v.elementAt(i) + " ");
		}
		System.out.println();
	}

	public static void main(String args[]) throws Exception {
		Vector v = new Vector();// default capacity 10
//		add(v);
//		System.out.println(v.size());
//		display(v);
//
//		insert(v, "POB", 12);
//		remove(v, 12);
	}

	public static void add(Vector v) {
		Object obj[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"  };//12
		if (v != null) {
			for (int i = 0; i < obj.length; i++) {
				v.addElement(obj[i]);
			}
		}

	}
	public static void remove(Vector v, int i) {
		if (v != null && i != -1) {
			v.removeElementAt(i);
		}
	}

	public static void insert(Vector v, Object obj, int i) {
		if (v != null && i != -1) {
			v.insertElementAt(obj, i);
		}
	}

	public static Object get(Vector v, int index) {
		return v.indexOf(8);
	}
}
