package com.kita.first.level3.vendingmachine;

public class PrintV {
	void printMenus(Menu menu, int n){
		//메뉴판 이름과 가격 찍기 기능
		String item = menu.getMenuItem(n-1);
		int price = menu.getMenuPrice(n-1); // private라서 필드를 바로 못가져옴..
		System.out.printf("%d. %s %d원\n", n,item, price); //// 저번꺼랑 비교해보기
		
		
	}
	void printTotalPrice(Game game) {
			System.out.printf("합계 : %d원 \n",game.gettotalPrice());
		}
}
