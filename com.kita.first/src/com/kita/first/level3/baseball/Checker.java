package com.kita.first.level3.baseball;

public class Checker {
	//스트라이크, 볼, 아웃 개수 확인하는 클래스
	static boolean check(Baseball ball, MyBall myBall, int len) {
		int s=0;
		int b=0;
		int[] rArr = new int[len];
		int[] myArr = new int[len];
		
		for(int i=0;i<len;i++) {
			rArr[i]=ball.getRNum(i);
			myArr[i]=myBall.getMyBall(i);
		} //필요없넹.
		
		for(int i=0; i<len;i++){
			for(int j=0;j<len;j++) {
				if(rArr[i]==myArr[j]) { //ball.getRNum(i) == myBall.getMyNum(z)
					if(rArr[i]==myArr[i]) { //i==z
						s++;
					} else {
						b++;							
					}
				}
			}
		}
		System.out.printf("S:%d / B:%d / O:%d\n", s,b,len-s-b);
		
		if(s==3) { //3=len
			return false;
		}else {
			return true;
		}// boolean result = (s!=gameCnt); // s==len이면 false 가 떠야함
		 // return result;
		////-> return =s!=gameCnt;
	}
}