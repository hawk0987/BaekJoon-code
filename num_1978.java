package Math1;
import java.util.*;
public class num_1978 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int num;
		int count=0;
		
		for(int i=0;i<N;i++) {
			num = scan.nextInt();
			if(num!=1) {
				count++;
			}
			for(int j=2;j<num-1;j++) {
				if(num%j==0) {
					count--;
					break;
				}
			}
		}
		System.out.println(count);
	}
}