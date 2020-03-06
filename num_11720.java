package String;
import java.util.*;
public class num_11720 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String ch;
		int N,sum=0;
		
		N = scan.nextInt();
		ch = scan.next();
		
		for(int i=0;i<N;i++) {	
			sum+=ch.charAt(i)-'0';
		}
		System.out.println(sum);
	}
}