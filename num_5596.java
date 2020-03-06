package Realization;
import java.util.*;
public class num_5596 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int info1 = scan.nextInt();
		int math1 = scan.nextInt();
		int science1 = scan.nextInt();
		int english1 = scan.nextInt();
		int S = info1 + math1 + science1 + english1;
		
		int info2 = scan.nextInt();
		int math2 = scan.nextInt();
		int science2 = scan.nextInt();
		int english2 = scan.nextInt();
		int T = info2 + math2 + science2 + english2;
		
		if(T > S) {
			System.out.println(T);
		}
		else {
			System.out.println(S);
		}
	}

}
