package com.kita.first.level3;

public class Book {
	public int chapter=0;//편의상 private 말고 public 사용 (get set 필요하기 때문)
	public int maxChapter;
	
	Book(int maxChapter){
		this.maxChapter=maxChapter; //기본 할당량
	}
	
	boolean read() {
		++chapter;
		if(chapter<maxChapter) {
			System.out.println("책을 읽는다.");
			return true;
		}else { // else 안해도 가능 어차피 return이 if에서 걸리면 끝이기 때문
			System.out.println("책을 이미 다 읽었다.");
			return false;
		}
		
	}
}
