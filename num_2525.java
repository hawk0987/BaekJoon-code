package Olympiad;
import java.util.*;
public class num_2525 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		B = B + C;
		for(int i=0;i<17;i++) {
			if(B>=60) {
				A += 1;
				B -= 60;
				if(A>23) {
					A -= 24;
				}
			}	
		}
		System.out.println(A + " " + B);	
	}
}