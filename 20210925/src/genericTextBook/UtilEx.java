package genericTextBook;

public class UtilEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair <String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair,"홍길동");
	
		
		ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원",20);
		
		OtherPair<String, Integer> otherPair = new OtherPair<>("홍삼원", 20);
		//int otherAge = Util.getValue(otherPair,"홍삼원");
		//otherPair는 상속받지않아서 불가
		//System.err.println(otherAge);
		
		
		
		 
	}

}
