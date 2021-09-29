package ioQuiz;

import java.io.FileInputStream;
import java.io.InputStream;

public class Ex01 {
	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\user\\Desktop\\iotest\\다운로드.jfif";
		InputStream is = new FileInputStream(file);
		int size = 0;
		
//		while () // InputStream.read() 를 사용해서 loop가 몇 번 실행되었는지 size에 저장
		while (is.read() != -1) {
			size++;
		}
		
		
		System.out.println("파일크기:" + size); 
		System.out.println("프로그램 종료");
		is.close();
	}
}
