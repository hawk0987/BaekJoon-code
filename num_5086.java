package ICPC;
import java.util.*;
public class num_5086 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			if(A==0 && B==0) {
				break;
			}
			if(B%A==0) {
				System.out.println("factor");
			}
			else if(A%B==0) {
				System.out.println("multiple");
			}
			else {
				System.out.println("neither");
			}
		}
		
	}

}
