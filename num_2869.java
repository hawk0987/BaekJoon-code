package Math1;
import java.util.*;
public class num_2869 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int V = scan.nextInt();		
		int day = 0;
		int H = 0;
		
		day = (V-B-1)/(A-B) +1;
		System.out.println(day);
	}
}