package print;
import java.util.*;
public class num_2440 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for(int i=0;i<N;) {
			for(int j=0;j<N;j++) {
				System.out.print("*");
			}
			System.out.println();
			N--;
		}

	}
}