package com.kita.first.level4;

import java.io.File; //inputoutput.file
import java.io.IOException;

public class File1 {
	public static void main(String[] args) {
		File file1 = new File("C:/JAVA_JE/file_test/file1.txt"); //C:\\JAVA_JE\\file_test/file1.txt 이스케이프 문자 구별시키기 위해 \한게 더씀
		boolean isExist = file1.exists();
		
		if(isExist==false) {
			file1.mkdirs(); //폴더 하나만하면 s필요없
			try {
				file1.createNewFile(); //없으면 만들어줌
			} catch(IOException e) {
				
			} catch(Exception e) {
				
			}
		}
		
		String file1Path = file1.getPath(); //경로값을 알고 싶을 때
		boolean result2 = file1.isDirectory();
		boolean result3 = file1.isFile();
		
		// MultiPartFile mf = MultipartFile(""); 스프링 웹개발 프레임워크
	}
}
