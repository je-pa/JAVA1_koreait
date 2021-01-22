package com.kita.first.level3;

public class ComicBook extends Book {
	public ComicBook(int maxChapter) {
		super(maxChapter);
	}

	@Override
	boolean read() {
		++chapter;
		if(chapter<maxChapter) {
			System.out.println("만화책을 읽는다.");
			return true;
		}else { // else 안해도 가능 어차피 return이 if에서 걸리면 끝이기 때문
			System.out.println("만화책을 이미 다 읽었다.");
			return false;
		}
	}
}
