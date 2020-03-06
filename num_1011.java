package Math1;
import java.util.*;
public class num_1011 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		int count=0;
		for(int i=0;i<T;i++) {
			int X = scan.nextInt();
			int Y = scan.nextInt();
			int N = Y-X;
			while(N!=0) {
				if(N!=1) {
					N -= 2;
					count += 2;
				}
			}
			
			
		}
		
	}

}
