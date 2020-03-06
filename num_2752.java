package basic;
import java.util.*;
public class num_2752 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ary[] = new int[3];
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		ary[0] = A;
		ary[1] = B;
		ary[2] = C;
		
		Arrays.sort(ary);
		System.out.print(ary[0] + " ");
		System.out.print(ary[1] + " ");
		System.out.print(ary[2]);
	}
}