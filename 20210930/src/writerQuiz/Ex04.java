package writerQuiz;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) throws Exception {
		// 사용자로 입력받은 내용을 
		//파일에 작성하기
		FileWriter fw = new FileWriter("C:\\Users\\kwon\\Desktop\\test\\outtest.txt");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("입력>");
		String in =sc.nextLine();
		if(in.equals("exit")) {break;}
		fw.write(in);
		fw.write("\n");
		
		}
		fw.close();
		sc.close();
	}

}
