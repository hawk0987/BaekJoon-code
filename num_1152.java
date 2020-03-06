package String;
import java.util.*;
public class num_1152 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt=1;
		String S = scan.nextLine();
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i) == ' ') {
				cnt++;
			}
		}
		if(S.charAt(0) == ' ') {
			cnt--;
		}
		if(S.charAt(S.length()-1) == ' ') {
			cnt--;
		}
		System.out.println(cnt);
		
	}
}