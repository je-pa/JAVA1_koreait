package com.kita.first;

public class Array1 {
	public static void main(String[] args) {
		int[] arr1= new int[4]; // int타입 4칸 이름은 arr1 
		arr1[0]=1;
		arr1[1]=4;
		arr1[2]=5;
		arr1[3]=2;
		
		System.out.println(arr1[0]);
		
		int[] arr4 = {1,4,5,2};
		
		int[] arr5;
		arr5 =new int[] {1,2,3}; //arr5 = {1,2,3}; 안됨
		
		int[] arr6 = new int[5];
		
		for(int i=0 ; i<arr6.length ; i++) { //갯수 길이
			arr6[i] = i+1;
		}
		
		for(int i=0 ; i<arr6.length ; i++) {
			System.out.print(arr6[i]+" ");//나눈 이유 : 한번에 하나의 역할만 하는게 좋음 -> 부품이 잘게 쪼개져 있을수록 사용성 좋음
		}
	}
}