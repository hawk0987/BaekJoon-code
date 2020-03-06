package basic;
import java.util.*;
public class num_9713 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i=0;i<T;i++) {
			int sum=0;
			int N = scan.nextInt();
			for(int j=0;j<N+1;j++) {
				if((j%2)!=0) {
					sum+=j;
				}
			}
			System.out.println(sum);
		}
	}
}