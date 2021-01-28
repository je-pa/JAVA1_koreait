package com.kita.first.level3.baseball;

import java.util.Scanner;

public class Game {
	//실제 게임 실행하는 실행 클래스
	public static void main(String[] args) {
			/*
			 * int gameCnt =3;
			 * Baseball ball = new Baseball(gameCnt);
			 * MyBall myBall = new MyBall(gameCnt);
			 * 
			 * do{
			 * 	myBall.SetNumbers();
			 * } while(Checker.check(gameCnt, ball, myBall));
			 * 
			 * System.out.println("게임종료");
			 */
		
			/*
			 * 야구게임
			 * 값1: 
			 * 값2: 
			 * 값3: 
			 * S:_/ B:_/ O:_
			 * .
			 * .
			 * s:3/B:0/O:0
			 * Great End!
			 */
			
			final int LEN = 3; //상수값은 대문자
			int max = 9;
			int min = 1;
			Baseball ball = new Baseball(LEN, max, min);
			MyBall myBall = new MyBall(LEN, max, min);
			System.out.println("게임시작");
			
			//컴퓨터가 랜덤으로 숫자 뽑는 클래스
			
//			while(true) {
//				////내가 숫자값 입력하고 예외 처리하는 클래스	
//		
//				//스트라이크, 볼, 아웃 개수 확인하는 클래스
//				
//				if(s==3) {
//					break;
//				}else {
//					s=0;
//					b=0;
//				}
//				
//			}
			
			  do{
			  	myBall.inputNum();
			  } while(Checker.check(ball, myBall, LEN));
			 
			System.out.print("Great End!");
	}
}
