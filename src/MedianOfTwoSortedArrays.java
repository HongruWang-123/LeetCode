import java.util.ArrayList;

public class MedianOfTwoSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i = 0,j = 0;
        ArrayList<Integer> a = new ArrayList<>();
        while(i<m && j < n) {
        	if(nums1[i] <= nums2[j]) {
        		a.add(nums1[i]);
        		i++;
        	}
        	else {
        		a.add(nums2[j]);
        		j++;
        	}
        }
        
        while(i<m) {
        	a.add(nums1[i]);
        	i++;
        }
        
        while(j<n) {
        	a.add(nums2[j]);
        	j++;
        }
        	
        if(a.size()%2 == 0) {
        	double sum = (double)a.get(a.size()/2-1)+(double)a.get(a.size()/2);
        	return sum/2;
        }
        else {
        	return (double)a.get(a.size()/2);
        }
    }
}
