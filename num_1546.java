package Array;
import java.util.*;
public class num_1546 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N;
		double avg,Max=0,sum=0;
		
		N = scan.nextInt();
		double ary[] = new double[N];
		
		for(int i=0;i<N;i++) {
		ary[i] = scan.nextInt();
		
		if(Max <= ary[i]) {
			Max = ary[i];
		}
	}
		for(int i=0;i<N;i++) {
			ary[i] = (ary[i]/Max)*100;
		}
		for(int i=0;i<N;i++) {
			sum += ary[i];
		}
		avg = sum/N;
		System.out.println(avg);		
	}
}
