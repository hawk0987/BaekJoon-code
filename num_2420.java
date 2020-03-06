package basic;
import java.util.*;
public class num_2420 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long N = scan.nextInt();
		long M = scan.nextInt();
		long sum=0;
		
		if(N>0 && M>0) {
			sum = N-M;
			if(sum>0) {
				System.out.println(sum);
			}
			else {
				System.out.println(-sum);
			}
		}
		
		if(N<0 || M<0) {
			sum = N-M;
			if(sum>0) {
				System.out.println(sum);
			}
			else {
				System.out.println(-sum);
			}
		}
		if(N==0 || M==0) {
			sum = N-M;
			if(sum>0) {
				System.out.println(sum);
			}
			else {
				System.out.println(-sum);
			}
		}
	}
}