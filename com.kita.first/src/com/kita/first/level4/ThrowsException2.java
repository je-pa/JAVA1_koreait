package com.kita.first.level4;

public class ThrowsException2 {
	void method1() throws Exception{
		ThrowsException te = new ThrowsException();
		
		try{
			te.parseInputStrToInt();
		}catch(Exception e) {
			
		}
	}
}
