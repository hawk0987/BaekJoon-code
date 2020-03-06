package Array;
import java.util.*;
public class num_2577 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ary[] = new int[10];
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();		
		int num = A*B*C;
		
		while(num>0) {
			ary[num%10] += 1;			
			num = num/10;
		}		
		
		for(int i=0;i<ary.length;i++) {
			System.out.println(ary[i]);
		}
		
	}

}
