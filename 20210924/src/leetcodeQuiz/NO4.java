package leetcodeQuiz;

import java.util.Arrays;

public class NO4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ret = 0;
      int[] num3= new int[nums1.length+nums2.length];
      for(int i=0 ;i<nums1.length;i++){
          num3[i]=nums1[i];
      }
          for(int i=0 ;i<nums2.length;i++){
          num3[i+nums1.length]=nums2[i];
      }
          
          for(int a :nums1){
              ret+=a;
          }
          for(int a :nums2){
              ret+=a;
          }
           Arrays.sort(num3);
          
      return num3.length%2==1 ? num3[num3.length/2] :(num3[num3.length/2]+num3[num3.length/2+1])/2;
      }
}
