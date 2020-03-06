package basic;
import java.util.*;
public class num_5217 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i=0;i<T;i++) {
			int N = scan.nextInt();
			System.out.print("Pairs for "+N+": ");
			
			int A=1,B=N-1;
			if(A>0 & B>0) {
				if(A!=B) {
					System.out.print(A +" "+ B);	
				}	
			}
			for(int k=0;k<(N-1)/2;k++) {
				A++;
				B--;
				if(A>=B) {
					break;
				}
				if(A+B==N) {
					System.out.print(", "+A+" "+B);	
				}
			}
			System.out.println();
		}
	}
}
