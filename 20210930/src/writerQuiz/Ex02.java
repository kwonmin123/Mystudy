package writerQuiz;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String src ="C:\\Users\\kwon\\Desktop\\test\\test3.txt";
		String des ="C:\\Users\\kwon\\Desktop\\test\\copied.txt";
		FileWriter test3= new FileWriter(src);
		test3.write("abcd1234ABCD9876");
		test3.close();//닫고 쓰자맨 밑으로 가면 실행안됨
		//원본 내용
		//abcd1234ABCD9876
		//복사 내용
		//dcba4321DCBA6789
		Reader fr = new FileReader(src);
		FileWriter fw = new FileWriter(des);
		char[] data= new char[4];
		
		System.out.println(fr.read());
		int cnt=0;
		fr.read(data);
		fr.close();
		fw.close();
	}

}
