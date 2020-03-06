package Realization;
import java.util.*;
public class num_5565 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total = scan.nextInt();
		
		for(int i=0;i<9;i++) {
			int book = scan.nextInt();
			total -= book;
		}
		System.out.println(total);
 }
}