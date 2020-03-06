package basic;
import java.util.*;
public class num_4101 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A;
		int B;
		
		while(true) {
			A = scan.nextInt();
			B = scan.nextInt();
			if(A==0 & B==0) {
				break;
			}
			
			if(A>B) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}	
	}
}