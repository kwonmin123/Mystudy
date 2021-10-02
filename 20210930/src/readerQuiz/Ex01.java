package readerQuiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class Ex01 {
public static void main(String[] args) throws Exception {
	String name = "C:\\Users\\kwon\\source\\repos\\test1.txt";
	FileReader fr = new FileReader(name);
	
	char[] datas = new char[3];
	int cnt = 0;
	
	while ((cnt = fr.read(datas)) != -1) {
		for (int i = 0; i < cnt; i++) {
			System.out.print(datas[i] + ",");
		}
	}
	System.out.println();
	System.out.println(Arrays.toString(datas));
	
	fr.close();
}
}
