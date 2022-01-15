
public class LongestCommonPrefix {
	 public String longestCommonPrefix(String[] strs) {
		 int min = Integer.MAX_VALUE;
		 int index = 0;
		 for(int i = 0; i < strs.length;i++) {
			 if(min > strs[i].length()) {
				 min = strs[i].length();
				 index = i;
			 }
		 }
		 if(min == 0) return "";
		 boolean check = true;
		 char com = ' ';
		 String pre = "";
		 for(int i = 0; i < min; i++) {
			 com = strs[index].charAt(i);
			 for(int a = 0; a < strs.length && check; a++) {
				 if(com != strs[a].charAt(i)) {
					 check = false;
				 }
			 }
			 if(check == true) 
				 pre = pre + com;
			 else return pre;
		 }
		 return pre;
	    }
}
