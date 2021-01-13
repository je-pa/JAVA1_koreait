package com.kita.first.level2;

import java.util.Scanner;

public class Calc {
	//필드 : 속성
//	static int n1=1;//다 공유하는 친구 
//	final int N2=3; //안변하는 값
	
	//생성자
	
	//메소드 :동작 행위 (->이름은 동사로 만들면 좋음)
	public static void main(String[] args) {
		Calc myCalc1=new Calc();
		myCalc1.powerOn();
		myCalc1.powerOff();
		int num_sum = myCalc1.sum(3,2);
		int num_minus = myCalc1.sum(3,2);
		int num_multiply = myCalc1.multiply(3,2);
		float num_divide = myCalc1.divide(3,2);
		
		System.out.printf("%d %d %d %.2f",num_sum,num_minus,num_multiply,num_divide);
	}
	
	void powerOn() { 
		System.out.println("전원을 켭니다."); 
	}
	
	void powerOff(){
		System.out.println("전원을 끕니다.");
	}
		
	int sum(int n1, int n2) { 
		int result = n1+n2;
		return (result);
	}
	
	int minus(int n1, int n2) {
		return n1-n2;
	}
	
	int multiply(int n1, int n2) {
		return n1*n2;
	}
	
	float divide(int n1, int n2) {
		return (float)n1/n2;
	}
}
