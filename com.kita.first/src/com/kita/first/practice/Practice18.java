package com.kita.first.practice;

public class Practice18 {
	public static void main(String[] args) {
		int i, dan;
		dan=4;
		for(i=1;i<=9;i++) {
			System.out.printf("%d*%d=%d\n", dan,i,(dan*i));
		}
		
		i=1;
		while(i<=9) {
			System.out.printf("%d*%d=%d\n", dan,i,(dan*i));
			i++;
		}
	}
}
