package ICPC;
import java.util.*;
public class num_17530 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int num[] = new int[N];
		int max=0;
		for(int i=0;i<N;i++) {
			num[i] = scan.nextInt();
			if(num[i]>max) {
				max = num[i];
			}
		}
		if(max==num[0]) {
			System.out.println("S");
		}
		else {
			System.out.println("N");
		}
		
	}

}
