package com.kita.first.practice;

import java.util.Scanner;

public class Practice21 {
	public static void main(String[] args) {
		/*
		 * 컴퓨터가 뽑은 랜덤 수(10~90)
		 * Up&Down
		 * Great!
		 */
		Scanner sc = new Scanner(System.in);
		int max=90, min=10;
		int rNum;
		rNum = ((int)(Math.random()*81)+10);
		
		while(true) {
			System.out.println("숫자를 입력하세요.(10~90)");
			int input = sc.nextInt();
			
			if(input>max || input<min) {
				System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
			}else if(input>rNum) {
				System.out.println("Down");
			}else if(input<rNum) {
				System.out.println("Up");
			}else {
				break;
			}
		}
		sc.close();
		System.out.println("Great!");
	}
}
