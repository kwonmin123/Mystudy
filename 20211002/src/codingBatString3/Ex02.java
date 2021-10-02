package codingBatString3;

public class Ex02 {
	public String withoutString(String base, String remove) {

		String lbase = base.toLowerCase();
		String subStr;

		int start = 0;
		while(lbase.contains(remove.toLowerCase())){
		start = lbase.indexOf(remove.toLowerCase());

		subStr = base.substring(start, start+remove.length());
		base = base.replace(subStr, "");
		lbase = base.toLowerCase();

		}


		return base;
		}
}
