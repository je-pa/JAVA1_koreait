package com.kita.first.practice;

import java.util.Scanner;

public class Practice25 {
	public static void main(String[] args) {
		/*
		 * 자판기게임
		 * 메뉴 : 콜라, 사이다, 캔커피, 데자와, 환타, 웰치스
		 * 가격 : 900, 700, 400, 500, 600, 1000
		 * 
		 * ---메뉴---
		 * 1. 콜라 900원
		 * 2. 사이다 700원
		 * .
		 * .
		 * .
		 * 6. 웰치스 1000원
		 * 
		 * 메뉴를 입력하세요(0 입력 시 종료): 1
		 * 콜라 900원
		 * 메뉴를 입력하세요(0 입력 시 종료): 3
		 * 캔커피 400원
		 * .
		 * .
		 * .
		 * 메뉴를 입력하세요(0 입력 시 종료):0
		 * 합계:3700원
		 */
		String[] menuArr = {"콜라", "사이다", "캔커피", "데자와", "환타", "웰치스"};
		int[] priceArr = {900, 700, 400, 500, 600, 1000};
		int num;
		int total=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("---메뉴---");
		for (int i=0;i<menuArr.length;i++) {
			System.out.printf("%d. %s %,d원\n",i+1,menuArr[i],priceArr[i]);
		}
		
		while(true) {
			System.out.println("메뉴를 입력하세요(0 입력 시 종료):");
			int input = sc.nextInt();
			
			if(input>menuArr.length || input<0) {
				System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
				continue;
			}else if(input==0) {
				System.out.printf("합계:%d",total);
				break;
			}else {
				for(int i=1;i<=menuArr.length;i++) {
					if(input==i) {
						System.out.printf("%s %,d원\n",menuArr[i-1],priceArr[i-1]);
						total+=priceArr[i-1];
					}
				}
			}
		}
	}
}
