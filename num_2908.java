package String;
import java.util.*;
public class num_2908 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		int no1 = A/100;
		int no2 = (A%100)/10; 
		int no3 = A%10; 
		
		int no4 = B/100;
		int no5 = (B%100)/10;
		int no6 = B%10;
		
		int A1 = (no3*100)+(no2*10)+no1;
		int B1 = (no6*100)+(no5*10)+no4;
		
		if(A1>B1) {
			System.out.println(A1);
		}
		else
			System.out.println(B1);		
	}
}