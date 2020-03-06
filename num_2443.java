package print;
import java.util.*;
public class num_2443 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for(int i=0;i<N;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");			
			}
			for(int j=0;j<2*(N-i)-1;j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
}