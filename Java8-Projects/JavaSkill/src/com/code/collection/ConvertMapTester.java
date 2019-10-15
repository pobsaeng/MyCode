package com.code.collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertMapTester {
  public static void main(String[] args) {
    // keys are Strings
    // objects are also Strings
    Map<String, String> map = new HashMap<String, String>();
    fillData(map);
    
    System.out.println("-------convert keys to array---------");
    String[] strings = keysAsArray(map);
    for (String string : strings) {
      System.out.println(string);
    }
    System.out.println("-------convert values to array---------");
    String[] values = valuesAsArray(map);
    boolean value = valueIn("Mobile", values);
    System.out.println("value: " + value);
    for (String string : values) {
      System.out.println(string);
    }
    System.out.println("-------convert keys to list---------");
    List<String> list = keysAsList(map);
    for (String string : list) {
      System.out.println(string);
    }
  }

  private static void fillData(Map<String, String> map) {
    map.put("Android", "Mobile");
    map.put("Eclipse IDE", "Java");
    map.put("Jboss IDE", "Java");
    map.put("Netbeans", "Java"); 
  }
  private static String[] keysAsArray(Map<String, String> map) {
    return map.keySet().toArray(new String[map.keySet().size()]);
  }
  private static String[] valuesAsArray(Map<String, String> map) {
	    return map.values().toArray(new String[map.values().size()]);
  }
  // assumes the key is of type String
  private static List<String> keysAsList(Map<String, String> map) {
    List<String> list = new ArrayList<String>(map.keySet());
    return list;
  }
  public static boolean valueIn(String value, String[] strList) {
      List list = Arrays.asList(strList);
      return list.contains(value);
  }
} 