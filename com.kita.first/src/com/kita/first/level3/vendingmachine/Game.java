package com.kita.first.level3.vendingmachine;

import java.util.Scanner;

public class Game {
	Scanner scan =new Scanner(System.in);
	private int count =0 ;
	private int totalPrice=0;
	void setCount(){
		count++;
	}
	int getCount(){
		return count;
	}
	
	void setTotalPrice(){
		totalPrice += totalPrice;
	}
	int gettotalPrice(){
		return totalPrice;
	}
	
	//번호 입력 받기
	int inputNum() {
		System.out.println("메뉴를 입력하세요(0 입력 시 종료): ");
		return scan.nextInt();
	}
	
	//메뉴 가격 합산
	void sumMenuPrice(Menu menu, int num) {
		totalPrice +=menu.getMenuPrice(num);
	}
	
	//입력받은 분기 가르기
	void divideNum(int num, int len) {
		if(num<1 || num>len) {
			System.out.println("범위 내의 숫자를 입력하세요.");
		} else if(num == 0) {
			
		}
		isContinue(num);
	}
	
	boolean isContinue(int num)/*불린값을 리털할때는 보통 is를 붙임*/{
		if(num==0) {
			return false;
		}
		return true;
	}
	
	//메뉴 가격 합산
	
	//입력받은 번호의 음료 내용 프린트
	
}
