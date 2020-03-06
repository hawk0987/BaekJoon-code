package For;
import java.util.*;
public class num_10871 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N,X,A;
		
		N = scan.nextInt();
		X = scan.nextInt();
		
		for(int i=0;i<N;i++) {
			A = scan.nextInt();
			if(A<X) {
				System.out.print(A + " ");
			}
		}
		

	}

}
