import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {
	     int n = s.length();
	     int i = 0, j = 0;
	     int length = 0;
	     Set<Character> ans = new HashSet<>();
	     while(i < n && j < n) {
	    	 if(!ans.contains(s.charAt(j))) {
                  ans.add(s.charAt(j));
                  j++;
                  length = Math.max(j-i, length);
	    	 }
	    	 else {
	    		 ans.remove(s.charAt(i));
	    		 i++;
	    	 }
	     }
	     return length;
	}
}
