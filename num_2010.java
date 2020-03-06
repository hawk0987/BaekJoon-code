package Math1;
import java.util.*;
public class num_2010 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int plug;
		int sum=0;
		
		for(int i=0;i<N;i++) {
			plug = scan.nextInt();
			sum+=plug;
			
		}
		System.out.println(sum-(N-1));		
	}
}