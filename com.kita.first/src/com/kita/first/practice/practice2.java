package com.kita.first.practice;

public class practice2 {
	public static void main(String[] args) {
		/*
		 * name
		 * age
		 * vision
		 * bloodType
		 * 
		 * 제 이름은 박지은이고 나이는 24살입니다.
		 * 시력은 0.9이고 혈액형은 A형입니다.
		 */
		
		String name = "박지은";
		int age = 24;
		double vision = 0.9;
		char bloodType = 'A';
		
		System.out.print("제 이름은 "+ name + "이고 나이는 " +age+"살입니다.\n");
		System.out.print("시력은 "+vision+"이고 혈액형은 "+bloodType+"형입니다.\n");
		
		System.out.printf("제 이름은 %s이고 나이는 %s살입니다. \n시력은 %s이고 혈액형은 %s형입니다.", name,age,vision,bloodType);
	}
}
