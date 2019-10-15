package com.app.miscellaneous;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadMap {
	public static void main(String[] args) {
		String filePath = "D:/MyWork/Daily/today/Test.txt";		
		System.out.println("Hello");
//		String delimiter = "|";
//		try {
//			Map<String, String> map = readPropertiesFileAsMap(filePath, delimiter);
//			for (Map.Entry<String, String> entry : map.entrySet()) {    
//				System.out.println(entry.getKey() + ",  " + entry.getValue());
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			List<String> list = readFileToList(filePath, "key");
			for (String string : list) {
				System.out.println(string);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Map<String, String> readPropertiesFileAsMap(String filename,
			String delimiter) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		String line;
		while ((line = reader.readLine()) != null) {
			if (line.trim().length() == 0){
				continue;
			}	
			if (line.charAt(0) == '#'){//find first index and not get index find
				continue;
			}
			int delimPosition = line.indexOf(delimiter);//index find '|'
			String key = line.substring(0, delimPosition).trim();//0-7
			String value = line.substring(delimPosition + 1).trim();//8 up to
			map.put(key, value);
		}
		reader.close();
		return map;
	}
	public static List<String> readFileToList(String path, String status)throws Exception{
		ArrayList<String> list = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new FileReader(path));
		String line;
		while ((line = reader.readLine()) != null) {
			if (line.trim().length() == 0){
				continue;
			}	
			if (line.charAt(0) == '#'){//find first index and not get index find
				continue;
			}
			int delimPosition = line.indexOf("|");//index find '|'
			String key = line.substring(0, delimPosition).trim();//0-7
			String value = line.substring(delimPosition + 1).trim();//8 up to
			if(status.equalsIgnoreCase("key")){
				list.add(key);
			}else{
				list.add(value);
			}
			
		}
		reader.close();
		return list;
	}
}
