package com.kita.first.level4;

public interface AkmuAlbum {
	//상수
	public static final String SONG_WRITER = "이찬혁";
	int PRICE = 20_000; //public static final 자동 붙음
	
	//추상메소드
	public abstract void playAkmuAlbum(); 
	
	void stopAkmuAlbum();//public abstract 자동 드감   //////////////
}
