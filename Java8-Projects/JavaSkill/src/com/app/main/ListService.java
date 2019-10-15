package com.app.main;

import java.util.ArrayList;
import java.util.List;

public class ListService {
	private List<Object> listObj;

	public ListService() {
		listObj = new ArrayList<Object>();
	}
	public void add(Object e) {
		listObj.add(e);
	}
	public void set(int index, Object e) {
		if(index >= 0 && index < listObj.size()){
			listObj.set(index, e);
		}
	}
	public void remove(int index){
		if(index != -1){
			listObj.remove(index);
		}
	}
	public void remove(Object obj){
		if(obj != null){
			listObj.remove(obj);
		}
	}
	public Object get(Object e) {
		return listObj.indexOf(e);
	}
	public Object get(int index) {
		return listObj.get(index);
	}
	public void display(){
		for(Object obj : listObj){
			System.out.print(obj+" ");
		}
	}
	public void displayLang(int start, int end){
		for (int i = start; i <= end; i++) {
			System.out.println(listObj.get(i));
		}
	}
	public static void main(String[] args) {
		String[] arrlist = {"A","B","C","D","E","F","G","H","I","J"};
		ListService list = new ListService();
		for (int i = 0; i < arrlist.length; i++) {
			list.add(arrlist[i]);
		}
//		list.display();
//		System.out.println(list.get("F"));
//		System.out.println(list.get(4));
//		list.remove("B");
//		list.set(9, "Q");
//		list.display();
		
		String s = list.get("B").toString();
		String e = list.get("G").toString();
		if(!"-1".equals(s) && !"-1".equals(e)){
			list.displayLang(Integer.parseInt(s), Integer.parseInt(e));
		}
	}
}
