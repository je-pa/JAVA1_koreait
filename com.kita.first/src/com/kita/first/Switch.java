package com.kita.first;

public class Switch {
	public static void main(String[] args) {
		//1~6 총 6개의 메뉴 랜덤 뽑기
		int rNum;
		rNum = ((int)(Math.random()*6)+1);
		String food = null;
		
		switch (rNum) {
		case 1:
			food ="집밥"; break;
		case 2:
			food ="떡볶이"; break;
		case 3: case 4:
			food ="치킨"; break;
		case 5:
			food ="족발"; break;
		default:
			food ="피자"; break;
		}
		
		System.out.printf("오늘 저녁은 %s이다", food);
	}
}
