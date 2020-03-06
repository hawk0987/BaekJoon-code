package Math1;
import java.math.*;
import java.util.*;
public class num_2407 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		BigInteger P1 = BigInteger.ONE;
		BigInteger P2 = BigInteger.ONE;
		BigInteger r = BigInteger.ONE;
		
		for(int i=n;i>0;i--){
	        P1 = P1.multiply(BigInteger.valueOf(i));
	    }
		
		for(int i=(n-m);i>0;i--){
			P2 = P2.multiply(BigInteger.valueOf(i));
	    }
		
		BigInteger P = P1.divide(P2);
		
		for(int i=m;i>0;i--){
	        r = r.multiply(BigInteger.valueOf(i));
	    }
		BigInteger C = P.divide(r);
		System.out.println(C);
		
	}

}
