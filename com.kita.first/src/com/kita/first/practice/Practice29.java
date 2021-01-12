package com.kita.first.practice;

import java.util.Scanner;

public class Practice29 {
	public static void main(String[] args) {
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
		Scanner scan = new Scanner(System.in);
		
		final int LEN = 3; //상수값은 대문자
		int[] rArr = new int[LEN];
		int[] myArr= new int[LEN];
		
		int max = 9;
		int min = 1;
		int s=0;
		int b=0;
		System.out.println("게임시작");
		
		for(int i=0; i<rArr.length; i++) {
			rArr[i] = (int)(Math.random() * (max-min+1)+min);
			for(int z=0; z<i; z++) {
				if(rArr[i]==rArr[z]) {
					i--;
					break;
				}
			}
		}
		for(int val : rArr) {
			System.out.println(val);
		}
		while(true) {
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
//			for(int i=0; i<myArr.length;i++){
//				System.out.printf("값%d: %d / ",(i+1),myArr[i]);
//			}
//			
//			System.out.println();
			
			for(int i=0; i<rArr.length;i++){
//				if(rArr[i]==myArr[i]) {
//				s++;
//				continue;
//			}
				for(int j=0;j<myArr.length;j++) {
					
					if(rArr[i]==myArr[j]) {
						if(rArr[i]==myArr[i]) {
							s++;
						} else {
							b++;							
						}
					}
					
//					if(rArr[i]==myArr[i]) {
//						s++;
//						break;
//					}else if(rArr[i]==myArr[j]) {
//						b++;
//					}
				}
			}
			System.out.printf("S:%d / B:%d / O:%d\n", s,b,LEN-s-b);
			
			if(s==3) {
				break;
			}else {
				s=0;
				b=0;
			}
			
		}
		
		System.out.print("Great End!");
		scan.close();

		
	}
}
