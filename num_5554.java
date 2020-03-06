package Realization;
import java.util.*;
public class num_5554 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total=0;
		for(int i=0;i<4;i++) {
			int sec = scan.nextInt();	
			total += sec;
		}
		
		int min = total/60;
		int second = total - (total/60)*60;
		System.out.println(min);
		System.out.println(second);
	}
}