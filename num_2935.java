package Realization;
import java.math.BigInteger;
import java.util.*;
public class num_2935 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger A = scan.nextBigInteger();
		String cal = scan.next();
		BigInteger B = scan.nextBigInteger();
		BigInteger total = BigInteger.ZERO;
		
		if(cal.equals("+")) {
			total = A.add(B);
		}
		else if(cal.equals("*")) {
			total = A.multiply(B);
		}
		System.out.println(total);
	}	
}