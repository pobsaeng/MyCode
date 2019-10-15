package com.app.miscellaneous;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ReadTextFileToHashmap {
	public static void main(String[] args) throws Exception {
		String filePath = "D:/MyWork/Daily/today/Test.txt";
		File f = new File(filePath);
		if (f.exists() && !f.isDirectory()) {// path มีจริง, ไม่เป็น
												// Directory ว่าง
			Map<Object, Object> map = new Properties();
			((Properties) map).load(new BufferedReader(new FileReader(filePath)));
			System.out.println("------------display custom file--------------");
		
		String splitSell[] = null;
		 Set<String> set = new LinkedHashSet<String>();
		 List<String> list = readFile(filePath);
		 for (int i = 0; i < list.size(); i++){
		     splitSell = (list.get(i)).split("|");
		     System.out.println(splitSell[i]);
		     set.add(splitSell[0]);
		 }
		
		}
	}

	public static List<String> readFile(String filename) {
		List<String> records = new ArrayList<String>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = reader.readLine()) != null) {
				records.add(line);
			}
			reader.close();
			return records;
		} catch (Exception e) {
			System.err.format("Exception occurred trying to read '%s'.",
					filename);
			e.printStackTrace();
			return null;
		}
	}
}