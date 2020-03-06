package Array;
import java.util.*;
public class num_3052 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N,count=0;
		int ary[] = new int[42];
		
		for(int i=0;i<10;i++) {
			N = scan.nextInt();
			ary[N%42] += 1;
		}
		for(int i=0;i<ary.length;i++) {
			if(ary[i]>0) {
				count += 1;
			}
		}
		System.out.println(count);
}
}