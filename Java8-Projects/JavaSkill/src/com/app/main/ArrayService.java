package com.app.main;

public class ArrayService {
	private Object[] elementData;
	private int size;

	public ArrayService(int cap) {
		elementData = new Object[cap];
		size = 0;
	}
	public void getSize(){
		System.out.println("size:"+size);
	}
	public void add(Object e) {
		add(size, e);
	}

	public void remove(Object e) {
		int i = indexOf(e);
		if (i >= 0)
			remove(i);
	}

	public int indexOf(Object e) {
		for (int i = 0; i < size; i++)
			if (elementData[i].equals(e))
				return i;
		return -1;
	}

	public Object get(int index) {
		return elementData[index];
	}

	public void set(int index, Object e) {
		elementData[index] = e;
	}

	public void add(int index, Object e) {
		ensureCapacity(size + 1);
		for (int i = size; i > index; i--) {
			elementData[i] = elementData[i - 1];
		}
		elementData[index] = e;
		size++;
	}

	public void remove(int index) {
		for (int i = index + 1; i < size; i++) {
			elementData[i - 1] = elementData[i];
		}
		size--;
		elementData[size] = null;
	}

	private void ensureCapacity(int capacity) {
		if (capacity > elementData.length) {
			int s = Math.max(capacity, 2 * elementData.length);
			Object[] arr = new Object[s];
			for (int i = 0; i < size; i++){
				arr[i] = elementData[i];
			}
			elementData = arr;
		}
	}
	private String find(String e){
		for (int i = 0; i < elementData.length; i++) {
			if(e.compareTo(elementData[i].toString()) == 0) {
				return elementData[i].toString();
			}
		}
		return null;
	}
	private String findLike(String e){
		for (int i = 0; i < elementData.length; i++) {
			String sub = elementData[i].toString().substring(0, e.length());
			System.out.println(sub);
			if(e.compareTo(elementData[i].toString()) == 0) {
				return elementData[i].toString();
			}
		}
		return null;
	}
	private void printlnArray(){
		for (int i = 0; i < elementData.length; i++) {
			System.out.print(elementData[i] + " ");
		}
	}
	public static void main(String[] args) {
		Object obj[]={"A","B","C","D","E","F","G","H","I","J"};
		ArrayService array = new ArrayService(5);
		for (int i = 0; i < obj.length; i++) {
			array.add(obj[i]);
		}
//		array.getSize();
//		array.printlnArray();
//		for (int i = 0; i < array.size; i++) {
//			System.out.print(array.get(i)+"("+array.indexOf(array.get(i))+")");
//		}
		
//		System.out.println(array.findLike("C"));
	}
}
