package com.kita.first.level2;

public class MapleTest {
	public static void main(String[] args) {
		Adventurer adv = new Adventurer(10,10,10,10);
		Magician mag = new Magician(10,20,10,10,100);
		
		System.out.println("모험가 int :"+adv.intellegence);
		System.out.println("마법사 int :"+mag.intellegence);
//		System.out.println(adv.mp);
		System.out.println("마법사 mp :"+mag.mp);
		
		adv.attack();
		mag.attack(); //오버라이드함
//		adv.teleport(); //없음
		mag.teleport();
		mag.jump(); //부모의 메소드 들고옴
	}
}
