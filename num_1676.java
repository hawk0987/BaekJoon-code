package Math1;
import java.math.BigInteger;
import java.util.*;
public class num_1676 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int count = 0;
		BigInteger M = BigInteger.ONE;
		
		M = M.multiply(BigInteger.valueOf(N));
		for(int i=1;i<N;i++){
	        M = M.multiply(BigInteger.valueOf(i));
	    }

		StringBuffer sb = new StringBuffer();
		M.toString();
		sb.append(M);
		sb.reverse();
		sb.toString();
		
		for(int i=0;i<sb.length()-1;i++){
	        if(sb.charAt(i)!='0'){
	            break;
	        }else{
	            count++;
	        }
	    }
		System.out.println(count);
	}
}