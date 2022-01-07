
public class LongestPalindromicSubstring {
	 public String longestPalindrome(String s) {
	        int start = 0, end = 0;
	      if(s == null) return "";
	      if(s.length() == 1) return s;
	      for(int i = 0; i < s.length(); i++){
	          int len1 = expandFromTheCenter(s,i,i);
	          int len2 = expandFromTheCenter(s,i,i+1);
	          int len = Math.max(len1,len2);
	          if(len > end - start){
	                  start = i - (len-1)/2;
	                  end = i + len/2;
	          }
	      }
	        return s.substring(start,end+1);
	}
	    public int expandFromTheCenter(String s, int l, int r){
	        int i1 = r,i2 = l;
	        while(i2 >= 0 && i1 < s.length() && s.charAt(i1) == s.charAt(i2)){
	            i2--;
	            i1++;
	        }
	        return i1-i2-1;
	    }
}
