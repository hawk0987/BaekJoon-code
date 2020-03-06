package Simulation;
import java.util.*;
public class num_2455 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int in=0,out=0;
		int total=0;
		int temp=0;
		for(int i=0;i<4;i++) {
			out = scan.nextInt();	
			in = scan.nextInt();
			total += in-out;
			if(temp<total) {
				temp = total;
			}
		}
		System.out.println(temp);		
	}
}