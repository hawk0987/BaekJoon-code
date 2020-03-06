package beginner;
import java.util.*;
public class num_18228 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int A[] = new int[N];
		int penguin=0;
		int min=1000000000;
		int strength;
		
		for(int i=0;i<N;i++) {
			A[i] = scan.nextInt();
			if(A[i]==-1) {
				penguin = i;
			}
		}
		
		for(int i=0;i<penguin;i++) {
			if(min>A[i]) {
				min = A[i];
			}
		}
		strength = min;
		min = 1000000000;
		
		for(int i=penguin+1;i<N;i++) {
			if(min>A[i]) {
				min = A[i];
			}
		}
		strength += min;
		System.out.println(strength);
	}

}
