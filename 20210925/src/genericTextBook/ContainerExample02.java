package genericTextBook;

public class ContainerExample02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Container02<String, String> container1 = new Container02<String, String>();
	container1.set("홍길동", "도적");
	String name1 =container1.getKey();
	String job = container1.getValue();
		
	Container02<String, Integer> container2 = new Container02<>();
	container2.set("홍길뚱", 35);
	String name2 =container2.getKey();
	int age = container2.getValue();
	}

}
