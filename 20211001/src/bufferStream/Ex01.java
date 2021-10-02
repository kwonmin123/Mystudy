package bufferStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String file = "C:\\Users\\kwon\\Desktop\\test\\outtest1.txt";
		InputStream is  = new FileInputStream(file);
		
		
		BufferedInputStream bis = new BufferedInputStream(is);// 버퍼드를 써서 속도 향상
		long start = System.currentTimeMillis();
		
		while(is.read()!= -1) {
			System.out.println(0);
		}//버퍼드로 작업
		
		long end = System.currentTimeMillis();
		
		
		System.out.println(end-start + "ms");
		bis.close();
	}

}
