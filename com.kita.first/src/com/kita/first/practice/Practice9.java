package com.kita.first.practice;

import java.util.Scanner;

public class Practice9 {
	public static void main(String[] args) {
		/*
		 	점수를 입력해 주세요: (0~100)
		  	90점 이상 A
			80점 이상 B
			70점 이상 C
			나머지는 D입니다. ( +, - 없다) 
			 		
			100 초과면 잘못 입력하였습니다.
			
			일의 자리 수가 7점 이상이면 +
			일의 자리 수가 3점 이하이면 -
			 		
			예를 들어, 95점: A, 97점: A+, 83점: B-
		 */
		System.out.print("점수를 입력해 주세요:");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		scan.close();
		char rank = 'D';
		String sign = "";
		
		if(0<=score && score<=100) {
			if(score>=70) {
				if(score==100) {
					sign = "+";
				}
				else if(score%10>=7) {
					sign = "+";
				}else if(score%10<=3) {
					sign = "-";
				}
			}
			if(score>=90) {
				rank = 'A';
			}else if(score>=80) {
				rank = 'B';
			}else if(score>=70) {
				rank = 'C';
			}
			System.out.printf("%d점 : %c%s",score,rank,sign);
		}else {
			System.out.println("잘못 입력하였습니다.");
		}	
		
	}
}