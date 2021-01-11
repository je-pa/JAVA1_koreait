package com.kita.first.practice;

public class Practice28 {
	public static void main(String[] args) {
		/*
		 * 국어합계: ?, 평균: ? 00.0
		 * 수학합계: ?, 평균: ? 
		 * 영어합계: ?, 평균: ? 
		 * 전체합계: ?, 평균: ? 
		 */		
		
		int[][] arr= {
				{90,100,88}, //국어
				{34,99,45}, //수학
				{89,65,74} //영어
		};
		String[] clsArr= {"국어","수학","영어"};
		int sum=0;
		int count=0;
		int[] sumArr=new int[clsArr.length];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++,count++) {
				sumArr[i]+=arr[i][j];
			}
			System.out.printf("%s합계: %d 평균: %.1f\n",clsArr[i],sumArr[i],(float)sumArr[i]/arr[i].length);
			sum+=sumArr[i];
		}

		System.out.printf("전체합계: %d 평균: %.1f\n",sum,(float)sum/count);
	}
}
