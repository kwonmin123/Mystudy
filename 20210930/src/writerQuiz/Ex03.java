package writerQuiz;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Ex03 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String src ="C:\\Users\\kwon\\Desktop\\test\\test3.txt";
		String des ="C:\\Users\\kwon\\Desktop\\test\\copied.txt";
		
		Reader rd = new FileReader(src);
		Writer wr = new FileWriter(des);
		
		char[] datas = new char[4];
		int cnt = 0;
		
		while ((cnt = rd.read(datas)) != -1) {
			for(int i=1;cnt-i>=0;i++) {
				wr.write(datas[cnt-i]);
			}
//			wr.write(datas[3] );
//			wr.write(datas[2] );
//			wr.write(datas[1] );
//			wr.write(datas[0] );
		}
		
		rd.close();
		wr.close();
		
	}

}
