package com.kita.first.level4;

public class JavaAPI {
	public static void main(String[] args) {
		Parent p = new Parent();
		
		String str ="안녕";
		StringBuffer sb=new StringBuffer("안녕"); //수정될수있
		boolean result = (str.equals(sb)); // String타입만 true
		boolean result2 = ("안녕".contentEquals(str)); //
		boolean result3 = (str.contentEquals(sb));
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		
		System.out.println(p.toString());
		
		str="124";
		Integer.parseInt(str);
		str="2.4";
		Double.parseDouble(str);
		Float.parseFloat(str);
		
		Math.random();
		int max =9;
		int min =1;
		int num = (int)(Math.random()*(max-max+1)+min);
		
		String.valueOf(num);
	}
}
