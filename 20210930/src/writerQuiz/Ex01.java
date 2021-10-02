package writerQuiz;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01 {
public static void main(String[] args) throws IOException {
	String name = "C:\\Users\\kwon\\Desktop\\test\\test2.txt";
	Writer wr = new FileWriter(name);
	
	//A-Z출력

	for(int a =65;a<91;a++) {
		wr.write(a);
	}
	wr.write(13);
	wr.write("바보");
wr.close();
}
}
