package Math1;
import java.util.*;
public class num_10569 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i=0;i<T;i++) {
			int V = scan.nextInt();
			int E = scan.nextInt();
			System.out.println(E-V+2);
		}
	}
}