package Realization;
import java.util.*;
public class num_10886 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int agree=0;
		int disagree=0;
		
		for(int i=0;i<N;i++) {
			int A = scan.nextInt();
			if(A==1) {
				agree++;
			}
			if(A==0) {
				disagree++;
			}
		}
		if(agree>disagree) {
			System.out.println("Junhee is cute!");
		}else {
			System.out.println("Junhee is not cute!");
		}

	}

}