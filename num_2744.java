package String;
import java.util.*;
public class num_2744 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)<=90) {
				System.out.print((char)(s.charAt(i)+32));
			}else {
				System.out.print((char)(s.charAt(i)-32));
			}
		}		
	}
}