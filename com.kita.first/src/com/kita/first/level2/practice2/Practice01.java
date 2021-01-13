package com.kita.first.level2.practice2;

public class Practice01 {
	public static void main(String[] args) {
		Practice01 gugudan =new Practice01();
		for(int i=2;i<=9;i++) {
			gugudan.printGugudan(i);
			System.out.println();
		}
	}
	void printGugudan(int num){
		//구구단 출력
		for(int i=1;i<=9;i++) {
			System.out.printf("%d*%d=%2d ",num,i,num*i);
		}
	}
}
