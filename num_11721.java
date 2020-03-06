package print;
import java.util.*;
public class num_11721 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();

		for(int i=0;i<S.length();i++) {
			System.out.print(S.charAt(i));
				if((i+1)%10==0){
					System.out.println();
			}
		}
	}
}