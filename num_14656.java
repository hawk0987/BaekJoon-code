package basic;
import java.util.Scanner;
public class num_14656 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int count=0;
		
		for(int i=1;i<N+1;i++) {
			int num = scan.nextInt();
			if(i!=num) {
				count++;
			}
		}
		System.out.println(count);
	}
}