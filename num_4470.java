package basic;
import java.util.*;
public class num_4470 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int no=0;
		String S = scan.nextLine();
		for(int i=0;i<N;i++) {
			S = scan.nextLine();
			no++;
			System.out.println(no+". "+ S);			
		}
	}
}