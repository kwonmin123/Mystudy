package jUnit;

import java.util.ArrayList;
import java.util.List;

public class MInMax {
	public ArrayList<Integer> minmax(List<Integer> arr) {
		ArrayList<Integer> ret = new ArrayList<>();
		if(arr.size()==0) {return ret;}
		int min = arr.get(0);
		int max = arr.get(0);
		
		for (int item : arr) {
			min = Math.min(min, item);
			max = Math.max(max, item);
		}
		
		ret.add(min);
		ret.add(max);
		
		return ret;
		
		
		
		//		if(arr.size()==1) { 
//			ret.add(arr.get(0));
//			ret.add(arr.get(0));
//			return ret;				
//		}
//
//		int min=Integer.MAX_VALUE;
//
//		for( int i:arr) {
//			if(i<=min) {
//				min=i;
//			}
//
//		}
//
//		ret.add(min);
//
//		int max=0;
//
//		for( int i:arr) {
//			if(i>=max) {
//				max=i;
//			}
//
//		}
//
//		ret.add(max);
//
//		return ret;
	}
}
