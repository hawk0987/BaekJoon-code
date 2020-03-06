package beginner;
import java.util.*;
public class num_3036 {
	public static void gcd(int A, int B) { 
		         int temp; 
		         int first = A; 
		         int next = B; 
		         while(B > 0) { 
		             temp = B; 
		             B = A%B; 
		             A = temp; 
		         }
		         System.out.println(first/A + "/" + next/A); 
		     }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int ring[] = new int[N];
		for(int i=0;i<N;i++) {
			ring[i] = scan.nextInt();
		}
		
		for(int i=1;i<ring.length;i++) {;
			gcd(ring[0], ring[i]);
		}				
	}
}