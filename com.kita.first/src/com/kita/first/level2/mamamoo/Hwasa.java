package com.kita.first.level2.mamamoo;

import com.kita.first.level2.hyori.LeeHyoRi;

public class Hwasa extends LeeHyoRi{
	public Hwasa(){
		super("");
		this.music="유고걸";
		this.sns="";//값넣어줘야함 메인메소드가 아니라서 라는..
		super.sns="";//굳이 이렇게 안씀 그냥 부모에바로 접근하면됨..
//		this.star=12; //(x)
		
		drinkTea();
	}
	public static void main(String[] args) {
		LeeHyoRi hr = new LeeHyoRi();
		hr.music ="유고걸";
//		hr.sns="인스타"; //(x)
//		hr.star=1_000_000; //(x)
		
//		LeeHyoRi hr2 = new LeeHyoRi("인스타"); //(x)
//		LeeHyoRi hr3 = new LeeHyoRi(1_000_000); //(x)
		
		hr.sing();
//		hr.drinkTea(); //(x)
//		hr.dance(); //(x)
//		hr.drinkTea(); //(x)
		
	}
}
