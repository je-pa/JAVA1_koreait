package com.kita.first.practice;

import java.util.Scanner;

public class Practice16 {
	public static void main(String[] args) {
		/*
		 *  1~6까지 랜덤으로 메뉴 뽑기를  한 번 한 후에!
		 *  뽑힌메뉴:oo
		 *  마음에 들면 Y 눌러서 반복 끝내고
		 *  "오늘의 메뉴는 oo입니다"
		 *  마음에 안 들면 N 눌러서 다시 랜덤 뽑기
		 */
			Scanner sc = new Scanner(System.in);
			String food = null;
				
			do {
				int rNum;
				rNum = ((int)(Math.random()*6)+1);
							
				if(rNum==1) {
					food = "치킨";
				}else if(rNum==2) {
					food = "햄버거";
				}else if(rNum==3) {
					food = "족발";
				}else if(rNum==4) {
					food = "떡볶이";
				}else if(rNum==5) {
					food = "피자";
				}else if(rNum==6) {
					food = "집밥";
				}
				System.out.println("뽑힌 메뉴 : "+food);
				System.out.print("마음에 듭니까?(Y/N)");
				String result = sc.next();
				if("Y".equals(result) ) {
					break;
				}
//				switch(result) {
//				case "Y": break; 
//				default : System.out.print("다시 뽑습니다.");
//				} 왜 안됑
			}while(true);
			
			System.out.printf("오늘 저녁은 %s이다.", food);
					
	}
}
