package com.kita.first.level4;

public class Test {
	public static void main(String[] args) {
//		Parent p = new Parent() {
//			String childField ="자식필드";
//			
//			void childMethod() {
//				System.out.println("자식 메소드입니다.");
//			}
//			@Override
//			void parentMethod() {
//				System.out.println("자식 객체입니다.");
//			}; //새미콜론 왜있지
//		};
//		p.parentMethod();
//		Child child = new Child();
//		child.childMethod();
//		child.childMethod2(new Parent() {
//			@Override
//			void parentMethod() {};
//		});
		ThrowsException2 te2 = new ThrowsException2();
		try {
			te2.method1();
		}catch(Exception e) {
			
		}
	}
}
	

		
//		ThrowsException te= new ThrowsException();
//		try {
//			te.method1();
//		}catch(Exception e) {
//			
//		}
		
		
////		AkmuAlbum album = new AkmuAlbum();// 인터페이스는 불가능
//		AkmuAlbum album1 = new MusicPlayer(); // 더큰친구(인터페이스)형 인스턴스에 = 구현클래스를 대입가능
//		IUAlbum album2 = new MusicPlayer();
//		
//		album1.playAkmuAlbum();
//		album1.stopAkmuAlbum();
////		album1.playIUAlbum(); //불가능
//		album2.playIUAlbum(); 
//		
//		//자식클래스에만 있는 메소드에 접근하고 싶을때
//		
//		MusicPlayer myMp3 = (MusicPlayer)album1; // 더큰 상위 앨범(album1)이라서 강제 형 변환 필요
//		myMp3.PlayMichaelJacksonAlbum();
