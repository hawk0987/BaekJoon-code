package Realization;
import java.util.*;
public class num_10872 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int sum=1;
		int N = scan.nextInt();
		int ary[]=new int[N];
		
		for(int i=0;i<N;i++) {
			ary[i]=i+1;
		}
		for(int i=0;i<ary.length;i++) {
			sum = sum*ary[i];
		}
		System.out.println(sum);
	}
}