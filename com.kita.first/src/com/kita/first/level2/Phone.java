package com.kita.first.level2;

public class Phone {
	//필드 와 메소드로 이루어져있
	
	
	//필드 (속성)이름, 색깔, ..밑에 애들은 필드!
	String company;
	String name;
	String color;
	int memory;
			
	//생성자 필드를 초기화해주는 역할 / 초기값 //Calc(타입) a = new Calc()(생성자) 에서 Calc()를 생성자라고함 //클래스는 하나이상의 클래스를 가지고있다. 생성시켜주는 역할  //return타입없음

	Phone() { } //기본생성자 : 따로 정의한 생성자가 없을때 컴파일러가 자동 정의해줌 //필드를 초기화, 클래스랑 이름 같음
	Phone(String company){
		this(company,"휴대폰","검정색",200);//this()는 생성자의 맨 첫번째 줄에만 사용가능
	}
	Phone(String company, String name, String color){
		this(company,name,color,200);
	}
	Phone(String company, String name, String color, int memory){ 
		this.company =company;
		this.name =name; 
		this.color =color;
		this.memory =memory;
	}
	
	//메소드 (동작)전화 문자 카메라.. . 메소드 안의 제일 바깥에 있는 변수는 전역변수
	String sendMsg(String str) {
		System.out.printf("%s",str);
		return "";
	}
	void call() {
		
	}
	
}
