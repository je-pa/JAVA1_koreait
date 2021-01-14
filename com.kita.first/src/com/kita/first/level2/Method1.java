package com.kita.first.level2;

public class Method1 {
//	(static/*시작하자마자 자동 올라가고 끝날때 까지 있음*/) void 메소드명(매개변수) {
//		
//	}
//	리턴타입 메소드면(매개변수...) {
//		return 리턴타입 변수;
//	}
	public static void main(String[] args) {
//		int[] arr = {1,2,3,4,5};
//		int n2 =sum(arr);
		int n3=sum(1,4,6,7,8,9,7,6);
		System.out.println(n3);//new int[] {1,2,3,4,5}
		
	}

//	static int sum(int[] arr) {
//		int result =0;
//		for(int i=0;i<arr.length;i++) {
//			result +=arr[i];
//		}
//		return result;
//	}
	static int sum(int... arr) {
		int result =0;
		for(int i=0;i<arr.length;i++) {
			result +=arr[i];
		}
		return result;
	}
}
