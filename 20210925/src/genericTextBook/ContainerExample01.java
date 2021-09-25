package genericTextBook;

public class ContainerExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container01<String> container1  = new Container01<String>();
	container1.set("홍길동");
	String str = container1.get();
	Container01<Integer
	> container2  = new Container01<>();
	
	container2.set(6);
	int value = container2.get();
	
	}

}
