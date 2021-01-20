package com.kita.first.level2.hyori;

public class LeeSangSun extends LeeHyoRi {
	LeeSangSun(){
		super("");
	}
	
	public static void main(String[] args) {
		LeeHyoRi hr = new LeeHyoRi();
		hr.music ="유고걸";
		hr.sns="인스타";
//		hr.star=1_000_000; //(x)
		
		LeeHyoRi hr2 = new LeeHyoRi("인스타");
//		LeeHyoRi hr3 = new LeeHyoRi(1_000_000); //(x)
		
		hr.sing();
		hr.drinkTea();
//		hr.dance(); //(x)
	}
}
