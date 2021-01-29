package com.kita.first.level4;

public class MusicPlayer implements AkmuAlbum, IUAlbum {
	
	@Override
	public void playAkmuAlbum() { //public 안쓰면 오류뜸!!! 부모의 메소드가 public 인데 자식이 더 작을 수 없음!
		System.out.println("항해 앨범을 재생합니다.");
	}
	
	@Override
	public void stopAkmuAlbum() {
		System.out.println("항해 앨범을 재생합니다.");
	}
	
	@Override
	public void playIUAlbum() {
		System.out.println("셀러브리티 앨범을 재생합니다.");
	}
	
	@Override
	public void stopIUAlbum() {
		System.out.println("셀리브리티 앨범을 재생합니다.");
	}
	
	public void PlayMichaelJacksonAlbum() {
		System.out.println("bea it! 앨범을 재생합니다.");
	}

}
