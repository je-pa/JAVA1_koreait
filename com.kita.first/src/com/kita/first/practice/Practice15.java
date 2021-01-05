package com.kita.first.practice;

public class Practice15 {
	public static void main(String[] args) {
		/*
		 *  *
		 *  **
		 *  ***
		 *  ****
		 */

		int star=4;
		for(int i =1;i<=star*star;i++) {
			System.out.print("*");
			if(i%star==0) {
				System.out.print("\n");
			}
		}
	}
}
