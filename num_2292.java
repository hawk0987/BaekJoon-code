package Math1;
import java.util.*;
public class num_2292 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int S = 2;
		int count=2;
		for(int i=1;i<1000000000;i++) {
			if(N==1) {
				System.out.println("1");
				break;
			}
			if(S<= N & (S+((6*i)-1))>=N) {
				System.out.println(count);
				break;
			}
			count++;
			S+=6*i;
		}		
	}
}