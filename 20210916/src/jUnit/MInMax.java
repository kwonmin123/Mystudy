package jUnit;

import java.util.ArrayList;

public class MInMax {
	public ArrayList<Integer> minmax(ArrayList<Integer> arr) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		if(arr.size()==0) {return ret;}
		if(arr.size()==1) { 
			ret.add(arr.get(0));
			ret.add(arr.get(0));
			return ret;				
		}

		int min=Integer.MAX_VALUE;

		for( int i:arr) {
			if(i<=min) {
				min=i;
			}

		}

		ret.add(min);

		int max=0;

		for( int i:arr) {
			if(i>=max) {
				max=i;
			}

		}

		ret.add(max);

		return ret;
	}
}
