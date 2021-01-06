package com.kita.first.practice;

public class Practice17 {
	public static void main(String[] args) {
		//*
		//**
		//***
		//****
	
		int i, j ,line;
		for(i=1;i<=4;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
		System.out.print("\n");
		}
		
		System.out.print("\n\n");
		
		
//		j=0;
//		line=1;
//		
//		for(i=1;i<=4;i++) {		
//
//			if(j==i) {
//				System.out.print("\n");
//				line++;
//				j=0;
//			}
//			else if(j<i) {
//				System.out.print("*");
//				j++;	
//				if(line==i) {
//					i=0;
//				}
//				
//			}
//		}
		
		System.out.print("\n\n");
		
		line =1;
		int st=0;
		int star=4;
		
		for(i=1;i<=star*star;i++) {
			System.out.print("*");
			st++;
			if(st==line) {
				System.out.println();
				line++;
				st=0;
				
				
			}
			if(line > star) {
				break;
			}
		}
		
		for(i=1;i<=star;i++) {
			
		}
		System.out.print("\n\n");
		
		for(i =1, j=1;i<=star*(star+1)/2;i++) {
			System.out.print("*");
			if(i==j*(j+1)/2) {
				System.out.println();
				j++;
			}
		}
		System.out.print("\n\n");
		
		for(i=1;i<=star;i++) {
			for(int z=star;z>0;z--) {
//				if(i<z) {
//					System.out.print("");
//				}else {
//					System.out.print("*");
//				}
				System.out.print(i<z?"":"");
					
			}
			
			System.out.print("\n");
		}
	}
}
