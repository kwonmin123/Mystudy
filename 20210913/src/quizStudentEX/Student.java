package quizStudentEX;

public class Student {
//스튜던트 클래스를 작성하되 오브젝트의 equals와 hashcode를 오버라이딩해서
	//student 의 학번이 같으면 동등객체가 될수 있도록 해보세요.
	//스튜던스 클래스 필드는 다음과 같다
	
	private String studentNum;

	public Student(String studentNum) {
		super();
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}
@Override
	public boolean equals(Object compareStudent) {
		// TODO Auto-generated method stub
		Student a=(Student)compareStudent;
		return this.studentNum.equals(a.getStudentNum());
	}
@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.getStudentNum().hashCode();
	}
	
}
