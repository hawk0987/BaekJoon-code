package Math1;
import java.util.*;
public class num_1037 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int min=1000001;
		int max=0;
		for(int i=0;i<N;i++) {
			int A = scan.nextInt();
			if(A<min) {
				min = A;
			}
			if(A>max) {
				max = A;
			}			
		}
		System.out.println(min*max);
	}
}