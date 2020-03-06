package beginner;
import java.util.*;
public class num_5361 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int A,B,C,D,E;
		double sum = 0;
		
		for(int i=0;i<T;i++) {
			A = scan.nextInt();
			B = scan.nextInt();
			C = scan.nextInt();
			D = scan.nextInt();
			E = scan.nextInt();
			
			sum = (A*350.34) + (B*230.90) + (C*190.55) +(D*125.30) + (E*180.90);
			System.out.println(String.format("$%.2f", sum));
		}	
	}
}