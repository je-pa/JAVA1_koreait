package com.kita.first.level2;

public class Method2 {
	public static void main(String[] args) { //실행클래스 : 하나만 있어도 됨
		Calc myCalc=new Calc(); //라이브러리 클래스 가져옴
		
		int result=myCalc.sum(1, 2);
		System.out.println(result);
	}
}
