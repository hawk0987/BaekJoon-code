package Math1;
import java.util.*;
public class num_1964 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long num=5;
		long j=7;
		int N = scan.nextInt();
		
		for(int i=1;i<N;i++) {
			num += j;
			j += 3;
		}
		System.out.println(num%45678);
	}

}
