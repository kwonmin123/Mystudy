package bufferStream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Ex04 {
	public static void main(String[] args) throws IOException {
		String file = "C:\\Users\\kwon\\Desktop\\test\\test2.txt";
		
		InputStream is = new FileInputStream(file);
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		// inputStream to Reader
		// Reader를 BufferedReader로 감싸서 (BufferedReader의 변수 br)
		
		// 한 줄씩 읽어서 출력
		String line= "";
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		System.out.println("종료");
		is.close();
	}
}
