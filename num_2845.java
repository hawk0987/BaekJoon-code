package beginner;
import java.util.*;
public class num_2845 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int L = scan.nextInt();
		int P = scan.nextInt();
		int num = L*P;
		
		int news1 = scan.nextInt();
		int news2 = scan.nextInt();
		int news3 = scan.nextInt();
		int news4 = scan.nextInt();
		int news5 = scan.nextInt();
		
		System.out.print(news1-num + " ");
		System.out.print(news2-num + " ");
		System.out.print(news3-num + " ");
		System.out.print(news4-num + " ");
		System.out.print(news5-num);		
	}
}