
public class ContainerWithMostWater{
	public int maxArea(int[] height) {
		 int max = 0;
	     int R = height.length - 1;
	     int area = 0;
	     int L = 0;
	     while(L < R) {
	    	 area = Math.min(height[L], height[R])*(R-L);
	    	 max = Math.max(max, area);
	    	 if(height[L] < height[R]) L++;
	    	 else R--;
	     }
	        return max;
	 }
}
