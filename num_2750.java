package basic;
import java.util.*;
public class num_2750 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		Integer ary[] = new Integer[N];
		
		for(int i=0;i<N;i++) {
			ary[i] = scan.nextInt();								
		}
		Arrays.sort(ary,Collections.reverseOrder());
		for(int i=0;i<ary.length;i++) {
			System.out.println(ary[i]);	
		}
	}
}