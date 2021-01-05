package com.kita.first.practice;

public class Practice14 {
	public static void main(String[] args) {
		//구구단 가로
		for(int i =1;i<=9;i++) {
			for(int dan=2;dan<=9;dan++) {
				System.out.printf("%d*%d=%2d\t",dan,i,dan*i);
			}
			System.out.print("\n");
		}
	}
}
