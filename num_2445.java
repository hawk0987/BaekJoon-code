package print;
import java.util.*;
public class num_2445 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for(int i=1;i<N+1;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");			
			}
			for(int j=0;j<2*(N-i);j++) {
				System.out.print(" ");
				
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");			
			}
			System.out.println();
		}
		
		for(int i=1;i<N+1;i++) {
			for(int j=0;j<N-i;j++) {
				System.out.print("*");			
			}
			
			for(int j=0;j<2*i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<N-i;j++) {
				System.out.print("*");			
			}
			System.out.println();
	}

}
}