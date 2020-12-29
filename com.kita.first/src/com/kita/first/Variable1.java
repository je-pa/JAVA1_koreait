package com.kita.first;

public class Variable1 {
	public static void main(String[] args) {
		//일반변수 (나머지는 참조변수)
		
		//문자하나
		char v1;
		v1 = 'A'; //변수를 초기화 (A : 초기값)
//		char v1_1;
//		v1_1 = 'a';
		
		//정수형
		byte v2 = (byte)128; // 강제형 변환
		System.out.println(v2);
		short v3;
		int v4; //가정용 맞춤
		long v5;
		
		//실수형
		float v6 = 10.1f;//f : 대문자 소문자 안가림 float타입으로 바꿈
		double v7;//기본 (조금더 정확하게 하려고)
		
		//논리
		boolean v8;//참 거짓
		v8 = true;//초기값
		v8 = false;
		
		int num1 = 5;
		System.out.println(num1);
		num1 = 9;
		System.out.println(num1);
		
		int n1, n2, n3;
		
		//상수
		final int NUM2 = 6;
		System.out.println(NUM2);
		//NUM2 = 7;
		
		//참조변수 (대문자로 시작) (주소의 값을 변수에 저장함)
		String v9 = "안녕하세요"; //문자열
		System.out.println("v9");//변수값담아서 사용 (리터럴값은 지양)
		
		Variable1 v;
	}
}
