package Math1;
import java.util.*;
public class num_16485 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		int b = scan.nextInt();
		if(c%b==0) {
			int result = c/b;
			System.out.println(result);
		}
		else {
			float result = (float)c/(float)b;
			System.out.println(result);
		}
		
	}

}
