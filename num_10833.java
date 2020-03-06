package Realization;
import java.util.*;
public class num_10833 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int sum=0;
		
		for(int i=0;i<N;i++) {
			int student = scan.nextInt();
			int apple = scan.nextInt();
			
			int num = apple%student;
			sum+=num;
		}
		System.out.println(sum);
	}
}