package basic;
import java.util.*;
public class num_5988 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for(int i=0;i<N;i++) {			
			String ary[] = scan.next().split("");
			int num = Integer.parseInt(ary[ary.length-1]);
			
			if(num%2==0) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
		}
	}
}