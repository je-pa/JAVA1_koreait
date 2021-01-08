package com.kita.first.practice;

public class Practice24 {
	public static void main(String[] args) {
		//선택정렬 젤작은인데스 번호 min에 담음
		int[] arr= {23,67,2,11,6,90};
		int min =0;
		int temp=0;//arr[0]
		
		for(int i=0;i<arr.length-1;i++) {
			min=i;
			for(int z=i+1;z<arr.length;z++) {
				//비교
				if(arr[z]<arr[min]) {
					min=z; //젤 작은 값 저장
				}
			}
			if(min!=i) {
				//자리바꾸기
				temp = arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
		for(int num:arr) {
			System.out.print(num+", ");
		}
	}
}
