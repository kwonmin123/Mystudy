package textbook;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class p776Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ddd";
		System.out.println(a+a);
		Set<Student> set = new HashSet<Student>();
		set.add(new Student(1, "홍"));
		set.add(new Student(2, "이"));
		set.add(new Student(1, "박"));
		Iterator<Student> iter =set.iterator();
		while (iter.hasNext()) {
			Student student = iter.next();
			System.out.println(student.studentNum + ": "+student.name);
		}
	}

}
