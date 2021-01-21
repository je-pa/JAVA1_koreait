package com.kita.first.level2.practice2;

public class Practice03 {
	//필드
	private String name;
	private int age;
	
	public static void main(String[] args) {
		Practice03 myP =new Practice03("김땡땡",20);
		myP.setName("김냥냥");
		String myPName=myP.getName();
		int myPAge=myP.getAge();
		System.out.printf("%s, %d, %s, %d, %s",myPName,myPAge,myP.getName(),myP.getAge(),myP.name);
	}
	//이름, 나이 출력 printf사용
	
	//생성자
	Practice03(String name,int age){
		this.name=name;
		this.age=age;
	}
	//메소드
	void setName(String name) {
		this.name=name;
	}
	void setAge(int age) {
		this.age=age;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
}
