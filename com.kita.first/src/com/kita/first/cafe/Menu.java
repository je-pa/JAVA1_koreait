package com.kita.first.cafe;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private List<MenuItem> arr=new ArrayList<MenuItem>();
	
	public Menu() {
		arr.add(new MenuItem("아메리카노",2000));
		arr.add(new MenuItem("카페라떼",2300));
		arr.add(new MenuItem("카페모카",2500));
		arr.add(new MenuItem("카라멜마끼아또",2600));
	}
	
	public void menuSetter(MenuItem mi) {
		arr.add(mi);
	}
	
	public String showMenus() {
		System.out.println("Menu");
		for(int i=0;i<arr.size();i++) {
			MenuItem m = arr.get(i);
			System.out.printf("%d. %s\t\t%,d원\n", i+1, m.getName());
		}
		return "";
	}
	
	public MenuItem choose(int idx) {
		return arr.get(idx);
	}
	
}




////필드
//private String[] menuArr;
//private int[] priceArr;
//
////생성자
//public Menu(int len) {
//	menuArr = new String[len];
//	priceArr = new int[len];
//	System.out.printf("%d칸짜리 배열이 생성되었습니다",len);
//}
//
////메소드
//
////메뉴배열에 메뉴이름 집어넣기
//public void setMenuItem(int index, String item) {
//	menuArr[index]=item;
//}
////가격배열에 메뉴가격 집어넣기
//public void steMenuPrice(int index, int price) {
//	priceArr[index]=price;
//}
////메뉴배열의 index번째 문자열 값 리턴
//public String getMenuItem(int index){
//	return menuArr[index];
//}
////가격배열의 index번째 int 값 리턴
//public int getMenuPrice(int index){
//	return priceArr[index];
//}
//
////메뉴배열에 순차적으로 값 입력
//void inputArrItems(){
//	Scanner scan = new Scanner(System.in);
//	
//	for(int i=0;i<menuArr.length;i++) {
//		System.out.printf("%d번째 메뉴이름 입력: ",i+1);
//		String str =scan.next();
//		menuArr[i] =str;
//	}
//	
//}
//
////가격배열에 순차적으로 값 입력
//void inputArrPrices(){
//	Scanner scan = new Scanner(System.in);
//	
//	for(int i=0;i<priceArr.length;i++) {
//		System.out.printf("%d번째 값 입력: ",i+1);
//		
//		String str=scan.next();
//		int num = Utils.parStrToInt(str);
//		if(num==0) {
//			System.out.println("잘못입력했습니다. 다시 입력해주세요");
//			i--;
//			continue;
//		}
//		priceArr[i] =num;
//	}
//	
//}