package bufferStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String src = "C:\\Users\\kwon\\Desktop\\test\\outtest1.txt";
		String des = "C:\\Users\\kwon\\Desktop\\test\\outtest2.txt";
	
		//파일복사( 버퍼 스트림 이용)
		InputStream is = new FileInputStream(src);
		BufferedInputStream bis = new BufferedInputStream(is);
		OutputStream os = new FileOutputStream(des);
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		byte[] datas = new byte[100];
		int len = 0;
		
		
		while((len=bis.read(datas))!=-1) {
			bos.write(datas,0,len);
		}
		bos.close();
		bis.close();
		
	}

}
