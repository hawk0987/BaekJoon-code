package Math1;
import java.util.*;
public class num_1076 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S1 = scan.next();
		String S2 = scan.next();
		String S3 = scan.next();
		String N1 = null;
		String N2 = null;
		long N3 = 0;
		
		
		if(S1.equals("black")) {
			N1="0";
		}
		if(S1.equals("brown")) {
			N1="1";
		}
		if(S1.equals("red")) {
			N1="2";
		}
		if(S1.equals("orange")) {
			N1="3";
		}
		if(S1.equals("yellow")) {
			N1="4";
		}
		if(S1.equals("green")) {
			N1="5";
		}
		if(S1.equals("blue")) {
			N1="6";
		}
		if(S1.equals("violet")) {
			N1="7";
		}
		if(S1.equals("grey")) {
			N1="8";
		}
		if(S1.equals("white")) {
			N1="9";
		}
		
		
		if(S2.equals("black")) {
			N2="0";
		}
		if(S2.equals("brown")) {
			N2="1";
		}
		if(S2.equals("red")) {
			N2="2";
		}
		if(S2.equals("orange")) {
			N2="3";
		}
		if(S2.equals("yellow")) {
			N2="4";
		}
		if(S2.equals("green")) {
			N2="5";
		}
		if(S2.equals("blue")) {
			N2="6";
		}
		if(S2.equals("violet")) {
			N2="7";
		}
		if(S2.equals("grey")) {
			N2="8";
		}
		if(S2.equals("white")) {
			N2="9";
		}
		
		
		if(S3.equals("black")) {
			N3=1;
		}
		if(S3.equals("brown")) {
			N3=10;
		}
		if(S3.equals("red")) {
			N3=100;
		}
		if(S3.equals("orange")) {
			N3=1000;
		}
		if(S3.equals("yellow")) {
			N3=10000;
		}
		if(S3.equals("green")) {
			N3=100000;
		}
		if(S3.equals("blue")) {
			N3=1000000;
		}
		if(S3.equals("violet")) {
			N3=10000000;
		}
		if(S3.equals("grey")) {
			N3=100000000;
		}
		if(S3.equals("white")) {
			N3=1000000000;
		}
		String temp = N1 + N2;
		long sum = Integer.parseInt(temp)*N3;
		System.out.println(sum);
	}
}