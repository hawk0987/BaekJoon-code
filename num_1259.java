package ICPC;
import java.util.*;
public class num_1259 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int num = scan.nextInt();
			int result=0;
			int num1=num;
			if(num==0) {
				break;
			}
			while(num1!=0) {
				result = result*10 + num1%10;
				num1 /= 10;
			}
			if(num==result) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
		
	}
}