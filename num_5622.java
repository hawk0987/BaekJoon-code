package String;
import java.util.*;
public class num_5622 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		int sec=0;
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)=='A'|| S.charAt(i)=='B'||S.charAt(i)=='C') {
				sec += 3;
			}
			if(S.charAt(i)=='D'|| S.charAt(i)=='E'||S.charAt(i)=='F') {
				sec += 4;
			}
			if(S.charAt(i)=='G'|| S.charAt(i)=='H'||S.charAt(i)=='I') {
				sec += 5;
			}
			if(S.charAt(i)=='J'|| S.charAt(i)=='K'||S.charAt(i)=='L') {
				sec += 6;
			}
			if(S.charAt(i)=='M'|| S.charAt(i)=='N'||S.charAt(i)=='O') {
				sec += 7;
			}
			if(S.charAt(i)=='P'|| S.charAt(i)=='Q'||S.charAt(i)=='R'||S.charAt(i)=='S') {
				sec += 8;
			}
			if(S.charAt(i)=='T'|| S.charAt(i)=='U'||S.charAt(i)=='V') {
				sec += 9;
			}
			if(S.charAt(i)=='W'|| S.charAt(i)=='X'||S.charAt(i)=='Y'||S.charAt(i)=='Z') {
				sec += 10;
			}
		}
		System.out.println(sec);
	}
}