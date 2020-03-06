package ICPC;
import java.util.*;
public class num_2711 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i=0;i<T;i++) {
			int num = scan.nextInt();
			String word = scan.next();
			System.out.print(word.substring(0,num-1));
			System.out.println(word.substring(num));			
		}		
	}
}