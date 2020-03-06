package ICPC;
import java.util.*;
public class num_2693 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i=0;i<T;i++) {
			
			int[] ary = new int[10];
			for(int j=0;j<ary.length;j++) {
				ary[j] = scan.nextInt();
			}
			Arrays.sort(ary);
			System.out.println(ary[7]);		
		}	
	}
}