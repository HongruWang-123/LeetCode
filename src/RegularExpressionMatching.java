
public class RegularExpressionMatching {
	public boolean isMatch(String s, String p) {
		   if(p.isEmpty()) return s.isEmpty();
		   boolean firstmatch = false;
		   if(!s.isEmpty() && (s.charAt(0)==p.charAt(0) || p.charAt(0) == '.')) firstmatch = true;
		   
		   if(p.length() >= 2 && p.charAt(1) == '*') {
			   return(isMatch(s,p.substring(2)) || (firstmatch && isMatch(s.substring(1),p)));
		   }
		   else {
			   return firstmatch && isMatch(s.substring(1),p.substring(1));
		   }
	    }
}
