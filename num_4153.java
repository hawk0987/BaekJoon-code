package Realization;
import java.util.*;
public class num_4153 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			int C = scan.nextInt();
			if(A==0 & B==0 & C==0)
				break;
			if(A*A+B*B == C*C || B*B+C*C==A*A || A*A+C*C == B*B) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		}
	}
}