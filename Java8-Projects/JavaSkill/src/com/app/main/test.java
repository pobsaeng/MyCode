package com.app.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class test {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("001");
		list1.add("002");
		
		List<String> list2 = new ArrayList<String>(list1);
		list2.add("003");
		list2.add("004");
		
		List<String> list3 = new ArrayList<String>(list2);
		list3.add("005");
		list3.add("006");
		
		for (String string : list3) {
			System.out.println(string);
		}

	}

	public static boolean isEmpty(Object object) {
		if (object == null) {
			return true;
		} else if (object instanceof String) {
			String str = (String) object;
			if (str.trim().equals("")) {
				return true;
			}
		} else if (object instanceof Collection) {
			Collection collection = (Collection) object;
			if (collection.isEmpty()) {
				return true;
			}
		} else if (object instanceof Map) {
			Map map = (Map) object;
			if (map.size() == 0) {
				return true;
			}
		} else if (object.getClass().isArray()) {
			Object[] array = (Object[]) object;
			if (array.length == 0) {
				return true;
			}
			boolean result = true;
			for (int i = 0; i < array.length; i++) {
				result = result && isEmpty(array[i]);
			}
			return result;
		}
		return false;
	}
}
