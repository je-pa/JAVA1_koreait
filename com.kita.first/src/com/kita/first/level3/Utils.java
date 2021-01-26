package com.kita.first.level3;

public class Utils {
	public static int parStrToInt(String str) {
		int result;
		try {
			result = Integer.parseInt(str);
		} catch(Exception e) {
			result=0;
		}
		return result;
	}
}
