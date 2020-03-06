package Olympiad;
import java.util.*;
public class num_2587 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ary[] = new int[5];
		int sum=0;
		
		for(int i=0;i<5;i++) {
			ary[i] = scan.nextInt();
			sum += ary[i];
		}
		Arrays.sort(ary);
		
		System.out.println(sum/5);
		System.out.println(ary[2]);
	}
}