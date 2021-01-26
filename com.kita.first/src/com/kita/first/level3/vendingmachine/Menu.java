package com.kita.first.level3.vendingmachine;

import java.util.Scanner;

import com.kita.first.Scan;
import com.kita.first.level3.Utils;

public class Menu {
	//필드
	private String[] menuArr;
	private int[] priceArr;
	
	//생성자
	public Menu(int len) {
		menuArr = new String[len];
		priceArr = new int[len];
	}
	
	//메소드
	
	//메뉴배열에 메뉴이름 집어넣기
	public void setMenuItem(int index, String item) {
		menuArr[index]=item;
	}
	//가격배열에 메뉴가격 집어넣기
	public void steMenuPrice(int index, int price) {
		priceArr[index]=price;
	}
	//메뉴배열의 index번째 문자열 값 리턴
	public String getMenuItem(int index){
		return menuArr[index];
	}
	//가격배열의 index번째 int 값 리턴
	public int getMenuPrice(int index){
		return priceArr[index];
	}
	
	//메뉴배열에 순차적으로 값 입력
	void inputArrItems(String[] arr){
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d번째 값 입력: ",i+1);
			String str =scan.next();
			arr[i] =str;
		}
		scan.close();
	}
	
	//가격배열에 순차적으로 값 입력
	void inputArrItems(int[] arr){
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d번째 값 입력: ",i+1);
			
			String str=scan.next();
			int num = Utils.parStrToInt(str);
			if(num==0) {
				System.out.println("잘못입력했습니다. 다시 입력해주세요");
				i--;
				continue;
			}
			arr[i] =num;
		}
		scan.close();
	}
}
