
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {
	 public List<List<Integer>> threeSum(int[] nums) {
	        Arrays.sort(nums);
	        
	        List<List<Integer>> res = new ArrayList<>();
	        for(int i = 0; i < nums.length && nums[i] <= 0; i++) {
	        	if(i == 0 || nums[i] != nums[i-1]) {
	        		twoSum(i,nums,res);
	        	}
	        }
	        return res;
	    }
	 
	 public void twoSum(int i, int[] nums, List<List<Integer>> res) {
		 int lo = i+1; int hi = nums.length-1;
		 int sum = 0;
		 while(lo < hi) {
			 sum = nums[i] + nums[lo] + nums[hi];
			 if(sum < 0) {
				 lo++;
			 }
			 else if(sum > 0) {
				 hi--;
			 }
			 else {
				 res.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
				 lo++;
				 hi--;
				 while(lo < hi && nums[lo] == nums[lo-1]) {
					 lo++;
				 }
			 }
		 }
	 }
	 
}
