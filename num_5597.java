package Realization;
import java.util.*;
public class num_5597 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ary[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		for(int i=0;i<28;i++) {
			int num = scan.nextInt();
			ary[num] = 1;
		}
		
		for(int i=1;i<ary.length;i++) {
			if(ary[i]!=1) {
				System.out.println(i);
			}
		}
	}
}