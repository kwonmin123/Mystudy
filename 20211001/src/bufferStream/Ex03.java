package bufferStream;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class Ex03 {
public static void main(String[] args) throws Exception {
	OutputStream os = getOutputStream("C:\\Users\\kwon\\Desktop\\test\\test4.txt");
	Scanner sc = new Scanner(System.in);
	Writer writer = new OutputStreamWriter(os);
	String input= null;
	while(true) {
		System.out.print("입력");
		input = sc.nextLine();
		if(input.equals("exit")) {break;}
		writer.write(input);
		
		
		//input을 파일에 쓰기
		//exit 를 입력받으면 종료
	
	}
	System.out.println("종료");
	writer.close();
	sc.close();
	os.close();
	
}

public static OutputStream getOutputStream(String file) throws Exception{
	return new FileOutputStream(file);
}
}
