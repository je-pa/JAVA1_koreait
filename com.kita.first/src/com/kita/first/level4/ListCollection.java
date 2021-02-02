package com.kita.first.level4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCollection {
	public static void main(String[] args) {
		//Card
		
//		Object obj =3;
		List<String> list = new ArrayList</*앞에 넣었으면 자동 들어감*/>(); //<> 안에 아무거나 못 넣도록 한정시키고 싶은 값을 넣음 객체타입 무엇이든 사용가능 String, Parent
//		List list = new LinkedList(); //동적할당 //10개 해놓고 넘어가면 자동 채워줌 삭제시키면 다시 줄어들고
//		int[] arr = new int[5];
		list.add("안녕");
		list.add("하세요");
		list.add(2,"저는"); //index지정해서 집어넣기 가능
		list.set(0, "Hi");
		list.remove(2);
		String result = list.get(0)+list.get(1);
		System.out.println("result : "+result);
		
		List<Cd> shelf =new LinkedList<Cd>();
		Cd cd1 =new Cd("에잇","아이유",2019);
		Cd cd2=new Cd("항해","악뮤",2020);
 		shelf.add(cd1);
		shelf.add(cd2);
		shelf.add(cd2); //중복가능
//		shelf.add("앨범");
	}
}
