
public class StringToInteger {
	 public int myAtoi(String s) {
	        String a = s;
         if(a == null || a.length() == 0) return 0;
	        int sum = 0;
	        int pop = 0;
	        while(a.charAt(0) == ' '){
	            a = a.substring(1, a.length());
             if(a == null || a.length() == 0) return 0;
	        }
	        int neg = 0;
	        if(a.charAt(0) == '-') {
	        	neg = 1;
	        	a = a.substring(1, a.length());
             if(a == null || a.length() == 0) return 0;
	        	if(!(Character.getNumericValue(a.charAt(0))>=0 && Character.getNumericValue(a.charAt(0)) <= 9)) return 0;
	        }
	        
	        if(a.charAt(0) == '+') {
	        	a = a.substring(1,a.length());
             if(a == null || a.length() == 0) return 0;
	        	if(!(Character.getNumericValue(a.charAt(0))>=0 && Character.getNumericValue(a.charAt(0)) <= 9)) return 0;
	        }
	        int i = 0;
	        while(i<a.length() && Character.getNumericValue(a.charAt(i))>=0 && Character.getNumericValue(a.charAt(i)) <= 9) {
	        	pop = Character.getNumericValue(a.charAt(i));
	        	if(neg == 1) pop = -pop;
	        	if(sum > Integer.MAX_VALUE/10 || (sum == Integer.MAX_VALUE/10 && pop > 7)) return sum = Integer.MAX_VALUE;
	        	if(sum < Integer.MIN_VALUE/10 || (sum == Integer.MIN_VALUE/10 && pop < -8)) return sum = Integer.MIN_VALUE;
	        	sum = 10*sum + pop;
	        	i++;
	        }
	        
	        if(i==0) return 0;
	        else return sum;
	        
	    }
}
