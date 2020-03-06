package basic;
import java.util.*;
public class num_11549 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int cnt=0;
		for(int i=0;i<5;i++) {
			int T = scan.nextInt();
			if(T==N) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}