package com.kita.first.practice;

public class Practice3 {
	public static void main(String[]args) {
		//n1 (+=)n2
		int n1=10;
		int n2=3;
		
		n1+=n2;
		int result1 = n1;
		
		n1=10;
		n1-=n2;
		int result2=n1;
		
		n1=10;
		n1*=n2;
		int result3=n1;
		
		n1=10;
		n1/=n2;
		int result4=n1;
		
		n1=10;
		n1%=n2;
		int result5=n1;
		
		System.out.print(result1+"\n"+ result2+"\n"+ result3+"\n"+ result4+"\n"+ result5 );
	}
}
