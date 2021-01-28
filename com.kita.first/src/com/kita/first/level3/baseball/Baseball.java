package com.kita.first.level3.baseball;

public class Baseball {
	//컴퓨터가 랜덤으로 숫자 뽑는 클래스 
	
	int max;
	int min;
	final int LEN = 3;
	int[] rArr;
	
	/*
	public Baseball(int gameCnt) {
		init(gameCnt);
	}
	private void init(int gameCnt) {
		rArr =new int[gameCnt];
		
	}
	*/
	
	public Baseball(int len, int max, int min) {
		rArr = new int[len];
		this.max =max;
		this.min=min;
		random();
	}
	
	//메소드 
	public int getRNum(int idx) {
		return rArr[idx];
	}
	
	private void random() {
		for(int i=0; i<rArr.length; i++) {
			rArr[i] = (int)(Math.random() * (max-min+1)+min);
			for(int z=0; z<i; z++) { //중복값 거르기
				if(rArr[i]==rArr[z]) {
					i--;
					break;
				}
			}
		}
	}
	
		
	void showAnswer() {
		for(int val : rArr) {
			System.out.println(val);
		}
	}
}
