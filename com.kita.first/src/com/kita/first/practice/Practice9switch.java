package com.kita.first.practice;

import java.util.Scanner;

public class Practice9switch {
	public static void main(String[] args) {
		
		System.out.print("점수를 입력해 주세요:");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		scan.close();
		char rank = 'D';
		String sign = "";
		
		switch(score/10) {
		case 10:
			if (0<=score && score<=100) {
				switch(score/10) {
					
				}
			}
		}
	}
}
