package com.kita.first;

import java.util.Scanner;

public class Swtich2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sNum = scan.next();
		String menu;
		switch(sNum) {
		case "일":
			menu = "치킨";
			break;
		case "이":
			menu = "치킨2";
			break;
		case "삼":
			menu = "치킨3";
			break;
		case "사":
			menu = "치킨4";
			break;
		case "오":
			menu = "치킨5";
			break;
		default:
			menu ="피자"; break;
		}
		
		System.out.printf("%s",menu);
	}
}
