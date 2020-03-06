package Math1;
import java.util.*;
public class num_11006 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int legs,leg;
		for(int i=0;i<T;i++) {
			int N = scan.nextInt();
			int M = scan.nextInt();
			
			leg = M*2-N;
			legs = M-leg;
			
			System.out.println(leg + " " + legs);
		}	
	}
}