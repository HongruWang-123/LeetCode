
public class IntegerToRoman {
   //1 <= n <= 3999
	//I 1, V 5, X 10, L 50, C 100, D 500, M 1000
	//I can be placed before V (5) and X (10) to make 4 and 9. 
	//X can be placed before L (50) and C (100) to make 40 and 90. 
	//C can be placed before D (500) and M (1000) to make 400 and 900.
   public String intToRoman(int num) {
	   String m[] = { "", "M", "MM", "MMM" };
       String c[] = { "",  "C",  "CC",  "CCC",  "CD",
                      "D", "DC", "DCC", "DCCC", "CM" };
       String x[] = { "",  "X",  "XX",  "XXX",  "XL",
                      "L", "LX", "LXX", "LXXX", "XC" };
       String i[] = { "",  "I",  "II",  "III",  "IV",
                      "V", "VI", "VII", "VIII", "IX" };

       // Converting to roman
       String thousands = m[num / 1000];
       String hundreds = c[(num % 1000) / 100];
       String tens = x[(num % 100) / 10];
       String ones = i[num % 10];

       String ans = thousands + hundreds + tens + ones;

       return ans;
      
    }
}
