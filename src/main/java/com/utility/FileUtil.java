package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class FileUtil {
	
	 public static void main(String[] args) { 
	 //getProperty("logoimage1"); 
		 getLocator("clickonpro");
	 }
	 
	/*public static String getProperty(String key) {
		String value=null;
		String path=null;
		
		try {
			FileInputStream fis = new FileInputStream(path+"/src/test/resources/ObjectRepository.properties");

			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(key);
			System.out.println(value);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;

	}
*/	
	public static String[] getLocator(String key) {
		String[] values = null;
		String path=System.getProperty("user.dir");
		System.out.println(path);
		try {
			
			FileInputStream fis = new FileInputStream(path+"/src/test/resources/ObjectRepository.properties");
			Properties prop = new Properties();
			prop.load(fis);
			String part = prop.getProperty(key);
			values = part.split("##");
			//System.out.println("Locator Type: " + values[0]);
			//System.out.println("Locator Value: " + values[1]);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();

		}
		return values;

	}
}
