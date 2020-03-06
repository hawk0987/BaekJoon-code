package ICPC;
import java.util.*;
public class num_9085 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num,N;
		int T = scan.nextInt();
		
		for(int i=0;i<T;i++) {
			N = scan.nextInt();
			int sum=0;
			for(int j=0;j<N;j++) {
				num = scan.nextInt();
				sum += num;
			}
			System.out.println(sum);
		}	
	}
}