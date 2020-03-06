package Array;
import java.util.*;
public class num_1026 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		Integer A[] = new Integer[N];
		Integer B[] = new Integer[N];
		int sum=0;
		
		for(int i=0;i<N;i++) {
			A[i] = scan.nextInt();
			}
		Arrays.sort(A,Collections.reverseOrder());
		for(int i=0;i<N;i++) {
			B[i] = scan.nextInt();
		}
		Arrays.sort(B);
		
		for(int i=0;i<N;i++) {
			sum += A[i]*B[i];
		}
		System.out.println(sum);	
	}
}