package textbook;

public class Student {
	public int studentNum;
	public String name;
	public Student(int studentNum, String name) {
		super();
		this.studentNum = studentNum;
		this.name = name;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentNum;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.hashCode()==obj.hashCode()) {return true;}
		else 
		
		return false; 

	}
}
