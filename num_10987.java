package String;
import java.util.*;
public class num_10987 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		int cnt=0;
		for(int i=0;i<S.length();i++){
			if(S.charAt(i)=='a'||S.charAt(i)=='e'||S.charAt(i)=='i'||S.charAt(i)=='o'||S.charAt(i)=='u') {
				cnt++;
			}
		}
		System.out.println(cnt);		
	}
}