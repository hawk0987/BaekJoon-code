package Math1;
import java.util.*;
public class num_10250 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i=0;i<T;i++) {
			int H = scan.nextInt();
			int W = scan.nextInt();
			int N = scan.nextInt();
			int X = (N/H)+1;
			int Y = N%H;
			if(N%H==0) {
				Y = H;
				X = N/H;			
			}
			System.out.println(Y*100+X);
		}
	}
}