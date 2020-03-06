package Math1;
import java.util.*;
public class num_1712 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		if((C-B)>0) {
			System.out.println((A/(C-B)+1));
		}else {
			System.out.println("-1");
		}
	}
}