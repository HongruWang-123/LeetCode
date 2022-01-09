
public class PalindromeNumber {
	 public boolean isPalindrome(int x) {
		 int first = x;
		 int sec = 0;
		 int pop = 0;
		 if(first>=0 && first<=9) return true;
		 if(first < 0 || first%10 == 0) return false;
	        while(first > sec) {
	        	pop = first%10;
	        	sec = 10*sec+pop;
	        	first = first/10;
	        }
	        if(first == sec) return true;
	        if(sec/10 == first) return true;
	        return false;
	    }
}
