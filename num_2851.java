package Realization;
import java.util.*;
public class num_2851 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score[] = new int[10];
		int total[] = new int[10];
		int sum=0;
		
		for(int i=0;i<10;i++) {
			score[i] = scan.nextInt();
			sum += score[i];
			total[i]=sum;
		}

		for(int i=1;i<total.length;i++) {
			if(Math.abs(100-total[i-1])<Math.abs(100-total[i])) {
				System.out.println(total[i-1]);
				break;
			}
			if(i==9) {
				System.out.println(total[i]);
			}
		}
	}
}