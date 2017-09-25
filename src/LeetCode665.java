//找到下降的位置，并确定修改第一个还是第二个位置
public class LeetCode665{
	 public boolean checkPossibility(int[] nums) {
		
			 int count =0;
			 for(int i =1;i<nums.length&&count<=1;i++) {
				 if(nums[i-1]>nums[i]) {
					
					 if(i-2<0||nums[i-2] <= nums[i]) {
						nums[i-1] =nums[i];
						count++;
					 }
					 else {
						nums[i]=nums[i-1];
						count++;
					 }
					
					
				 }}
				 return count<-1;
			 }
	 }
	 
		 
		    

