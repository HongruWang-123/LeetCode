import java.util.ArrayList;

public class ZigzagConversion {
	public String convert(String s, int numRows) {
        ArrayList<Character> ans = new ArrayList<Character>();
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i))) {
            	ans.add(s.charAt(i));
            }
        }
        return ans.toString();
    }
}
