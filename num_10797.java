package Realization;
import java.util.*;
public class num_10797 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int day = scan.nextInt();
		int count = 0;
		for(int i=0;i<5;i++) {
			int car = scan.nextInt();
			if(day==car) {
				count++;
			}
		}
		System.out.println(count);
	}
}