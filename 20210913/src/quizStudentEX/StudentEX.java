package quizStudentEX;

import java.util.HashMap;

public class StudentEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Student, String> hashMap =new HashMap<Student, String>();
		hashMap.put(new Student("1"), "95");
		String score = hashMap.get(new Student("1"));
		System.out.println("1번학생의 총점 "+score);
	}

}
