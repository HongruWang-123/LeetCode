
public class ReverseInteger {
	public int reverse(int x) {
        int a = 0, sum = 0;
       int result = x;
        if(x < Integer.MAX_VALUE && x > Integer.MIN_VALUE) {
        while(result != 0){
            a = result%10;
            if(sum > Integer.MAX_VALUE/10 || (sum == Integer.MAX_VALUE/10 && a > 7)) return 0;
            if(sum < Integer.MIN_VALUE/10 || (sum == Integer.MIN_VALUE/10 && a < -8)) return 0;
            sum = sum*10 + a;
            result = result/10;
        }
        }
        return sum;
    }
}
