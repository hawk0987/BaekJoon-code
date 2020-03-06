package Olympiad;
import java.util.*;
public class num_2501 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int ary[] = new int[N];
		int count=0;
		
		for(int i=1;i<N+1;i++) {
			if(N%i==0) {
				ary[count] = i;
				count++;
			}
		}
		System.out.println(ary[K-1]);
	}
}