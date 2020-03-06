package basic;
import java.util.*;
public class num_17010 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int L = scan.nextInt();
		for(int i=0;i<L;i++) {
			int N = scan.nextInt();
			String x = scan.next();
			for(int j=0;j<N;j++) {
				System.out.print(x);
			}
			System.out.println();
		}
	}
}