package Olympiad;
import java.util.*;
public class num_2480 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int max=0;
		
		if(A==B && B==C && A==C) {
			System.out.println(10000 + (A*1000));
		}
		else if(A==B || B==C || A==C) {
			if(A==B || A==C) {
				System.out.println(1000 + (A*100));
			}
			else if(B==C) {
				System.out.println(1000 + (B*100));
			}
		}
		else {
			if(A>max) {
				max = A;
			}
			if(B>max) {
				max = B;
			}
			if(C>max) {
				max = C;
			}
			System.out.println(max*100);
		}
		
	}

}
