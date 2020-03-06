package String;
import java.util.*;
public class num_10821 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		int count=0;
		
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)==',') {
				count++;
			}
		}
		System.out.println(count+1);		
	}
}