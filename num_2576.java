package Olympiad;
import java.util.*;
public class num_2576 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum=0;
		int min=100;
		
		for(int i=0;i<7;i++) {
			int num = scan.nextInt();
			if(num%2==1) {
				sum+=num;
				if(min>num) {
					min=num;
				}
			}
		}
		
		if(sum==0) {
			sum = -1;
			System.out.println(sum);
		}
		else {
			System.out.println(sum);
			System.out.println(min);	
		}
	}
}