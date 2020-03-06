package String;
import java.util.*;
public class num_5524 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();	
		
		for(int i=0;i<N;i++) {			
			String s = scan.next();
			
			for(int j=0;j<s.length();j++) {
				
				if(s.charAt(j)<=90) {
					System.out.print((char)(s.charAt(j)+32));
				}else {
					System.out.print((char)s.charAt(j));
				}
			}
			System.out.println();
		}	
	}
}