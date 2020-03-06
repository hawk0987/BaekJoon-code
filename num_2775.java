package Math1;
import java.util.*;
public class num_2775 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i=0;i<T;i++) {
			int k = scan.nextInt();
			int n = scan.nextInt();
			int floor[] = new int[14];
			//0Ãþ ÀÎ¿ø¼ö
			for(int j=0;j<n;j++) {
				floor[j] = j+1;
			}			
			for(int j=0;j<k;j++) {
				int sum=0;
				for(int l=0;l<n;l++) {
					sum  += floor[l];
					floor[l] = sum;
				}
			}
			System.out.println(floor[n-1]);
					
		}
		}
}