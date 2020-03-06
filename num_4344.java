package Array;
import java.util.*;
public class num_4344 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int C;
		int N;
		
		C = scan.nextInt();		
		for(int i=0;i<C;i++) {
			N = scan.nextInt();
			int sum=0;
			int count=0;
			double total=0.0;
			double per=0.0;
			int score[] = new int[N];

			for(int j=0;j<N;j++) {
				score[j] = scan.nextInt();
				sum += score[j];
			}
			for(int j=0;j<N;j++) {
				if(score[j]>(double)sum/N) {
					count += 1;
				}
			}
			per = (double)count/N*100;
			total = Math.round(per*1000)/1000.0;
			System.out.printf("%.3f", total);
			System.out.println("%");
		}
	}
}