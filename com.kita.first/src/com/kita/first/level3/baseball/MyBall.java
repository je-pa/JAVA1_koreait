package com.kita.first.level3.baseball;

import java.util.Scanner;

public class MyBall {
	//내가 숫자값 입력하고 예외 처리하는 클래스
	int max;
	int min;
	int[] myArr;
	private Scanner scan;
	
	public MyBall(int len, int max, int min) {
		init(len,max,min);
	}
	private void init(int len, int max, int min) {
		myArr= new int[len];
		this.max =max;
		this.min=min;
		scan = new Scanner(System.in);
	}
//	setNumber()
//	{	
//		
//	}
//	getMyNum(int idx){
//		
//	}
	
	void inputNum() {
		for(int i=0; i<myArr.length;i++){
			System.out.printf("값%d: ",(i+1));
			int n=scan.nextInt();
			
			if(min<=n&&n<=max)
				myArr[i]=n;
			else {
				System.out.print("범위값내의 값을 입력해 주세요.\n");
				i--;
			}
			
			for(int z=0; z<i; z++) {
				if(myArr[i]==myArr[z]) {
					System.out.print("중복되는 값을 입력하셨습니다.\n");
					i--;
					break;//중복된게 하나라도 있으면 나머지는 볼필요없으므로
				}
			}
		}
	}
}
