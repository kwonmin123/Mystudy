package jUnit;

import java.util.ArrayList;
//최댓값 반환
public class ArrayMax {
	public int max(ArrayList<Integer> arr) {
		int ret=0;
		if(arr.size()==0) {return 0;}
		if(arr.size()==1) {return arr.get(0);}
		for( int i:arr) {
			if(i>=ret) {
				ret=i;
			}
		}


		return ret;
	}
//최댓값의 위치 반환
	public int maxIndex(ArrayList<Integer> arr) {
		int ret=0;
		if(arr.size()==0) {return 0;}
		if(arr.size()==1) {return arr.get(0);}
		for( int i:arr) {
			if(i>=ret) {
				ret=i;
				
			}
		}


		return arr.indexOf(ret);
	}

}
