package com.kita.first.level2;

public class PhoneTest { 
	public static void main(String[] args) {
		Phone myPhone = new Phone("갤럭시 S21","노랑색",300);
		Phone yourPhone = new Phone("갤럭시 S20","빨간색",300);
		System.out.println(myPhone.name);
		System.out.println(yourPhone.name);
		
		Phone phone1 = new Phone();
		System.out.println(phone1.name);
		Phone phone2 = new Phone("갤럭시 A80");
		System.out.println(phone2.name);
		System.out.println(phone1.color);
		System.out.println(phone2.color);
		System.out.println(phone2.memory);
	}
}
