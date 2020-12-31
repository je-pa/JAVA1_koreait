package com.kita.first.practice;

import java.util.Scanner;

public class Practice8 {
	public static void main(String[] args) {
		/*
		 * 몇 월인지 입력해주세요.(1~12월)
		 * 3~5월 : 봄
		 * 6~9월 : 여름
		 * 9~11월 : 가을
		 * 12~2월 : 겨울
		 * 
		 * n월은 oo입니다.
		 */
		
		System.out.println("몇 월인지 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		String season = null;
		
		switch(month) {
		case 3: case 4: case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		case 12: case 1: case 2:
			season = "겨울";
			break;

		default:
			System.out.println("잘 못 입력하셨습니다.");
		}
		System.out.printf("%d는", month );
	}
}
