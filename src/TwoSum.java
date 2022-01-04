import java.util.HashMap;

public class TwoSum {
   public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> another = new HashMap<Integer,Integer>();
       for(int i = 0; i<nums.length;i++) {
    	   another.put(nums[i], i);
       }
       for(int i = 0;i<nums.length;i++) {
    	   int other = target - nums[i];
    	   if(another.get(other) != null) {
    		   int i2 = another.get(other);
    		   return new int[]{i,i2};
    	   }
       }
       return null;
   }
}
