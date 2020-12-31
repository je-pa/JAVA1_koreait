package com.kita.first.practice;

public class Practice7 {
	public static void main(String[] args) {
		//1~6 총 6개의 메뉴 랜덤 뽑기
		int rNum;
		rNum = ((int)(Math.random()*6)+1);
		String food = null;
		
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
		
		System.out.printf("오늘 저녁은 %s이다.", food);
	}
}
