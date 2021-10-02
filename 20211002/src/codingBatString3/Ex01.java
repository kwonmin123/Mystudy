package codingBatString3;

public class Ex01 {
	public int countYZ(String str) {
		int count=0;
		String[] arr =  str.split("[^a-zA-Z]");
		
		for(String a : arr) {
			if(a.endsWith("z")||a.endsWith("y")||a.endsWith("Z")||a.endsWith("Y")) {
				count++;
			}
		}
	return count;
	}
}
