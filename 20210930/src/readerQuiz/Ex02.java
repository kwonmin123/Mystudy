package readerQuiz;

import java.io.FileReader;

public class Ex02 {
	public String split(int num) throws Exception {
		String name = "C:\\Users\\user\\Desktop\\iotest\\test4.txt";
		FileReader fr = new FileReader(name);
		char[] datas = new char[num];
		
		String res = "";
		int cnt = 0;
		while ((cnt = fr.read(datas)) != -1) {
			res += new String(datas, 0, cnt) + ",";
		}
		
		fr.close();
		return res.substring(0, res.length()-1);
	}
}
