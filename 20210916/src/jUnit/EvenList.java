package jUnit;

import java.util.ArrayList;

public class EvenList {
	//짝수만 반환하는 메쏘드
	public ArrayList<Integer> evenList(ArrayList<Integer> arr) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i : arr) {
			if(i%2==0) {
				ret.add(i);
			}
		}
	return ret;
	}
}
