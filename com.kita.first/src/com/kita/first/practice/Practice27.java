package com.kita.first.practice;

public class Practice27 {
	public static void main(String[] args) {
		//{{1,2,3},{4,5,6},{7,8,9},{10,11,12}}
		int arr[][]=new int[4][3];
		int num=1;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++,num++) {
				arr[i][j]=num;//num++ 따로안쓰고 여기 바로적어도 됨
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%2d, ",arr[i][j]);
			}
			System.out.println();
		}
	}
}
