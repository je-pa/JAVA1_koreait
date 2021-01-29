package com.kita.first.level3;

public abstract class Animal {
	//필드
	private String name ="동물"; //abstract 안됨!
	
	//생성자
	Animal(){
		super();
	}
	
	//메소드 
	abstract void crying();
	
//	void crying() {
//		System.out.println("동물이 운다.");
//	}

}
