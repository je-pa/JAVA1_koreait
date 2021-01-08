package com.kita.first.practice;

public class Practice23 {
	public static void main(String[] args) {
		int[] arr= {23,67,2,11,6,90};
		//순차정렬
		int temp;
		
		for(int i=0;i<arr.length-1;i++) {
			for(int z=i+1;z<arr.length;z++) {
				if(arr[i]<arr[z]) {
					temp = arr[i];
					arr[i]=arr[z];
					arr[z]=temp;
				}
			}
		}
		for(int num:arr) {
			System.out.print(num+", ");
		}
		
		System.out.println();
		
		for(int i = 0;i<arr.length;i++) {
			if(i<arr.length-1) {
				System.out.print(arr[i]+", ");
			}else {
				System.out.print(arr[i]);
			}
		}
	}
}
