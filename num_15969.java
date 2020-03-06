package basic;
import java.util.*;
public class num_15969 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int min=1000,max=0;
		int N = scan.nextInt();
		for(int i=0;i<N;i++) {
			int score = scan.nextInt();
			if(score>=max) {
				max = score;
			}
			if(score<=min) {
				min = score;
			}
		}
		System.out.println(max-min);

	}
}