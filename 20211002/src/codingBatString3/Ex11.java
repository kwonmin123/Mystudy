package codingBatString3;

public class Ex11 {
	public String notReplace(String str) {
		return  str.replaceAll("(?<=\\s|^|[^\\w])is(?=\\s|$|[^\\w])", "is not");
	}

}
