package com.app.miscellaneous;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class MonitorThread extends Thread {
	private static final String TIFF_EXT = ".TIFF";
	private static final String TIF_EXT = ".TIF";
	private static final String PNG_EXT = ".PNG";
	private static final String JPEG_EXT = ".JPG";
	private static final String TXT_EXT = ".Txt";

	String filePath = "D:/MyWork/Daily/today";
	File monitorFolder = new File(filePath);
	public void run() {
		while (true) {
			if (monitorFolder.canRead() && monitorFolder.canWrite()
				&& monitorFolder.isDirectory()) {
			File[] files;
			try {
			try {
				String distinationFolder = "D:/MyWork/Daily/moveTest";
				File fileMonitorTemp = new File(distinationFolder);
				if (!fileMonitorTemp.exists()) {
					fileMonitorTemp.mkdirs();
					System.out.println("Create Folder Success!");
				}
				files = listCorrectFile(monitorFolder.listFiles());
				if (files != null && files.length > 0) {
					boolean moveStatus = false;
					for (int i = 0; i < files.length; i++) {
						if (files[i].canRead() && files[i].isFile()) {
							File newFile = new File(distinationFolder, files[i].getName());
							moveStatus = files[i].renameTo(newFile);
						}
					}
					if(moveStatus){
						System.out.println("+++Move Files Success!!!+++");
						System.out.println("From: "+monitorFolder.getAbsolutePath());
						moveFilesToFolder(distinationFolder);						
					}
				}else{
					System.out.println("wait for input..");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	}
	public static void moveFilesToFolder(String disPath){
		File[] files;
		try {
			File f = new File(disPath);
			files = listCorrectFile(f.listFiles());
			System.out.println("To: "+f.getAbsolutePath());
			System.out.println();
			System.out.println("+++ Display list the files +++");
			for (File file : files) {
				System.out.println(file.getName());
			}
				if (files != null && files.length > 0) {
					for (int i = 0; i < files.length; i++) {
						if (files[i].canRead() && files[i].isFile()) {
							if(files[i].getName().equalsIgnoreCase("HP115701100051O.txt")){
								System.out.println("\n++ items in "+files[i].getName()+"++");
								Map<Object, Object> map = new Properties();
								((Properties) map).load(new BufferedReader(new FileReader(files[i].getAbsoluteFile())));

								for (Map.Entry<Object, Object> entry : map.entrySet()) {    
									System.out.println(entry.getKey() + ",  " + entry.getValue());
								}
								System.out.println("\n++ display key name is \'AppendApplicationNo\' ++");
								for (Map.Entry<Object, Object> entry : map.entrySet()) {    
									if(entry.getKey().toString().equalsIgnoreCase("AppendApplicationNo") 
											&& entry.getValue().toString().equalsIgnoreCase("11570110005")){
										System.out.println(entry.getKey() + ",  " + entry.getValue());
									}
								}
							}
						}
					}
				}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static File[] listCorrectFile(File[] files) throws Exception {
		List<File> fileList = new ArrayList<File>();

		for (int i = 0; i < files.length; i++) {
			if (files[i].isFile()) {
				String fileName = files[i].getName();
				int dot = fileName.lastIndexOf(".");
				String extension = fileName.substring(dot);

				if (dot > -1) {
					if (TIFF_EXT.equalsIgnoreCase(extension)
							|| TIF_EXT.equalsIgnoreCase(extension)
							|| PNG_EXT.equalsIgnoreCase(extension)
							|| JPEG_EXT.equalsIgnoreCase(extension)
							|| TXT_EXT.equalsIgnoreCase(extension)) {
						fileList.add(files[i]);
					}
				}
			}
		}

		File[] fileTemps = new File[fileList.size()];
		for (int i = 0; i < fileTemps.length; i++) {
			fileTemps[i] = fileList.get(i);
		}

		return fileTemps;
	}
}
