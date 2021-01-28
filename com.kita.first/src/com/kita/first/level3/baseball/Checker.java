package com.kita.first.level3.baseball;

public class Checker {
	//스트라이크, 볼, 아웃 개수 확인하는 클래스
	static private int s;
	static private int b;
	
	static boolean check(Baseball ball, MyBall myBall, int len) {
		for(int i=0; i<len;i++){
			for(int j=0;j<len;j++) {
				if(ball.rArr[i]==myBall.myArr[j]) {
					if(ball.rArr[i]==myBall.myArr[i]) {
						s++;
					} else {
						b++;							
					}
				}
			}
		}
		System.out.printf("S:%d / B:%d / O:%d\n", s,b,len-s-b);
		
		if(s==3) {
			return false;
		}else {
			return true;
		}
	}
}
