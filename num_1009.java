package basic;
import java.util.*;
public class num_1009 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum=0;
		int T = scan.nextInt();
		
		for(int i=0;i<T;i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			int C=1;
			for(int j=0;j<B;j++) {
				C = C*A%10;
			}
			if(C==0)
				System.out.println(10);
			else
				System.out.println(C);									
		}
	}
}