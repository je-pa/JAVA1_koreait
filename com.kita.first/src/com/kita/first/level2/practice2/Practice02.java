package com.kita.first.level2.practice2;

public class Practice02 {
	public static void main(String[] args) {
		Practice02 my = new Practice02();
		int n1 = my.sum(5,6);
		int n2 = my.minus(4,7);
		int n3 = my.nultiply(n1,n2);
		double n4 = my.divide(5,3);
		System.out.printf("%d %d %d %.2f",n1,n2,n3,n4);
		
		int n5 =my.sum(5,6,7);
	}
	
	int sum(int n1, int n2) {
		return n1+n2;
	}
	
	int sum(int n1, int n2, int n3) {
		return n1+n2+n3;
	}
	
	int minus(int n1, int n2) {
		return n1-n2;
	}
	int nultiply(int n1, int n2) {
		return n1*n2;
	}
	double divide(int n1, int n2) {
		return (double)n1/n2;
	}
}
