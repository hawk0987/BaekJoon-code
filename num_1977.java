package Math1;
import java.util.*;
public class num_1977 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num,result=0;
		int M = scan.nextInt();
		int N = scan.nextInt();
		
		int S = (int)Math.ceil(Math.sqrt(M));
		int R = (int)Math.floor(Math.sqrt(N));
		if(S>R) {
			System.out.println(-1);
		}
		else {
			num = S*S;
			for(int i=S;i<R+1;i++) {
				result += i*i;
			}
			System.out.println(result);
			System.out.println(num);
		}
	}
}