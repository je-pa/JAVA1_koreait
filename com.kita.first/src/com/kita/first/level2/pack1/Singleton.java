package com.kita.first.level2.pack1;

public class Singleton { //com.kita.first.level2.pack1.Singleton
	static Singleton sg = null;
	
	private Singleton() {} //클래스 내부에서만 사용
	
	public static Singleton getInstance() {
		if(sg==null) {
			sg=new Singleton();
		}
		return sg;
	}
}
