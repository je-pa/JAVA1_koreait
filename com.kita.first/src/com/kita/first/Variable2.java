package com.kita.first;

public class Variable2 {
	public static void main(String[] args) {
		int num = 5_000_000;
		System.out.println(num);
		
		//강제형 변환 자동형 변환
		int n1 = 10;
		long n2 =20;
		
		long result1 = n1 + n2; //long이 더커서 자동변환
		System.out.println(result1);
		
		int result2= (int)(n1 + n2);//강제변환 필요
		System.out.println(result1);
	}
}
