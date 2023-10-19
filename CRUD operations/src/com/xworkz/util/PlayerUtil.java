package com.xworkz.util;

public class PlayerUtil {
	
	public static boolean validate(String string) {
		if(string != null && !string.isEmpty() && string.length()>3 && string.length()<30) {
			return true;
		}else {
			System.err.println(string);
		}
		return true;
	}
}
