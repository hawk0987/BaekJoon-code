package basic;
import java.util.*;
public class num_17388 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int temp=100;
		
		if(A+B+C<100) {
			if(A<B & A<C) {
				System.out.println("Soongsil");
			}
			if(B<A & B<C) {
				System.out.println("Korea");
			}
			if(C<A & C<B) {
				System.out.println("Hanyang");
			}
		}
		else {
			System.out.println("OK");
		}
	}
}