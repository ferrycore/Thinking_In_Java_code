import java.util.HashMap;
import java.util.Map;

public class LeetCode496 {
public int[]getNextGreatNumber(int[]nums1,int[]nums2){
	//使用HashMap进行遍历 
    Map<Integer,Integer>	map =new HashMap<>();
	for(int i=0;i<nums2.length;i++) {
		map.put(nums2[i], i);
	}
	for(int i=0;i<nums1.length;i++) {
	 int minindex =-1;
	 int index =map.get(nums1[i]);
	 //while循环内增
	 while(++index<nums2.length) {
	  if(nums2[index]>nums1[i]) {	 
		minindex =index;
		break;
	  }
	  
	 }
	 if(minindex ==-1) {
	 nums1[i]=-1;
	 }
	 else {
	 nums1[i]=nums2[minindex]	; 
	 }
	}
	
	return nums1;
}
}
