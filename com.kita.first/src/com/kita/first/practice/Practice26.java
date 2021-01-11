package com.kita.first.practice;

public class Practice26 {
	public static void main(String[] args) {
		//1~9<-랜덤으로 겹치지 않게 배열에 초기화시키기
		int[] arr = new int[9];
		int rNum;
		int x=0;
		for(int i=0;i<arr.length;i++) {
			rNum = (int) ((Math.random()*9)+1);
			arr[i]=rNum;
			while(true) {
				for(int z=0;z<i;z++) {
						if(arr[i]==arr[z]) {
							x=1;
						}
				}
				if(x==1) {
					rNum = (int) ((Math.random()*9)+1);
					arr[i]=rNum;
					x=0;
				}else {
					break;
				}
			}
		}

		
		
		for(int n:arr) {
			System.out.print(n+", ");
		}
	}
}