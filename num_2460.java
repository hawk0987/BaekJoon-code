package Olympiad;
import java.util.*;
public class num_2460 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int people=0;
		int out,in,max=0;
		
		for(int i=0; i<10;i++) {
			out = scan.nextInt();
			in = scan.nextInt();
			people -= out;
			people += in;
			if(max<=people) {
				max = people;
			}	
		}
		System.out.println(max);	
	}
}