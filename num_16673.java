package beginner;
import java.util.*;
public class num_16673 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int C = scan.nextInt();
		int K = scan.nextInt();
		int P = scan.nextInt();
		int num=0;
		
		for(int i=1;i<C+1;i++) {
			num += (K*i)+(P*i*i);
		}
		System.out.println(num);
	}

}
