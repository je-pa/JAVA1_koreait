package com.kita.first.level4;

public class JavaAPI {
	public static void main(String[] args) {
//		Parent p = new Parent();
//		
//		String str ="안녕";
//		StringBuffer sb=new StringBuffer("안녕"); //수정될수있
//		boolean result = (str.equals(sb)); // String타입만 true
//		boolean result2 = ("안녕".contentEquals(str)); //
//		boolean result3 = (str.contentEquals(sb));
//		System.out.println(result);
//		System.out.println(result2);
//		System.out.println(result3);
//		
//		System.out.println(p.toString());
//		
//		str="124";
//		Integer.parseInt(str);
//		str="2.4";
//		Double.parseDouble(str);
//		Float.parseFloat(str);
//		
//		Math.random();
//		int max =9;
//		int min =1;
//		int num = (int)(Math.random()*(max-max+1)+min);
//		
//		String.valueOf(num);
		
		char c = new Character('A');
//		char c = new Character(A); //안됨
		int num = new Integer("1000"); //알아서 변환
		int num1 = new Integer(1000);
		double num2 =new Double("34.567"); //알아서 변환
		double num3 =new Double(34.567);
		System.out.printf("%c, %d, %d, %f, %f \n",c,num,num1,num2,num3);
		
//		int num4 = 010801;
		int num4 = new Integer("010801");
		System.out.println("num3: " +num3);
		
		String ad = "010801 345678";
		Character c2 = ad.charAt(7);
		System.out.println("c2: "+c2);
		
		switch (c2)  {
		case '1': case '3':
			System.out.println("남자입니다. "); break;
		case '2': case '4':
			System.out.println("여자입니다"); break;
		}
		
		String str="오늘은 날씨가 좋다";
		Character v1 = str.charAt(4); //4번째자리 무엇인지 //주민번호사용 
		System.out.println("v1: "+v1);
		
		int idx =str.indexOf("날씨가"); //찾기
		System.out.println("idx : "+idx);
		
		int len = str.length(); // 길이
		System.out.println("len: "+len);
		
		String str2 =str.replace("날씨가", "기분이"); //바꾸기
		System.out.println("str2: "+str2);
		
		String str3 = str.substring(4); //자르기
		System.out.println("str3: "+str3);
		
		String str4 =str.substring(4, 7); //4번째 앞에부터 7번째 앞까지
		System.out.println("str4: "+str4);
		
		String str5 ="Hello~ I'm fine Thank you and you?";
		String str6 = str5.toLowerCase(); // 소문자로 바꿈
		String str7 = str5.toUpperCase(); // 대문자로 바꿈
		System.out.println("str6: "+str6);
		System.out.println("str7: "+str7);
		
		String str8 = "    안녕      "; //앞뒤 공백 잘라냄
		String str9 = str8.trim();
		System.out.println("str9: "+str9);
		
		double n1 = Math.abs(-3.4); //절댓값
		System.out.println("n1: "+n1);
		
		int n2 = (int)Math.ceil(5.1); //올림값 (double값으로 나옴)
		System.out.println("n2: "+n2);
		n2 = (int)Math.ceil(-4.8);
		System.out.println("n2: "+n2);
		
		int n3 = (int)Math.floor(5.7); //내림값 (double값으로 나옴)
		System.out.println("n3: "+n3);
		n3 = (int)Math.floor(-4.8);
		System.out.println("n3: "+n3);
		
		int n4 = (int)Math.round(5.4); //반올림값 (double값으로 나옴)
		System.out.println("n4: "+n4);
		n4 = (int)Math.round(-4.8);
		System.out.println("n4: "+n4);
	}
}
