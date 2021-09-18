package codingbatQuiz.Array01;

import java.awt.List;
import java.util.ArrayList;

public class Make2 {

	public int[] make2(int[] a, int[] b) {
	ArrayList<Integer> list =new ArrayList<Integer>();
	for(int i :a) {
		list.add(i);
	}
	for(int i :b) {
		list.add(i);
	}
	int[] ret = {list.get(0),list.get(1)};
	return ret;
	
	
	
	}

}
