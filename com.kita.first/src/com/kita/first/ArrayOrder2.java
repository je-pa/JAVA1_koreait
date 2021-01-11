package com.kita.first;

public class ArrayOrder2 {
	public static void main(String[] args) {
		int[] arr = {1,7,45,0,2};//01234
		int temp;
		
		for(int i=1;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int num : arr) {
			System.out.print(num+", ");
		}
	}
}