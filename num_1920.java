package beginner;
import java.util.*;
public class num_1920 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);	
		int N =  scan.nextInt();
		
		HashSet<Integer> hash = new HashSet<Integer>();
		for(int i=0;i<N;i++) {
			hash.add(scan.nextInt());
		}
		
		int M = scan.nextInt();
		int A[] = new int[M];
		for(int i=0;i<M;i++) {
			A[i] = scan.nextInt();
		}
		
		for(int i=0;i<M;i++) {
			if(hash.contains(A[i])) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}		
	}
}