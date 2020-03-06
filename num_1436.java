package Bruteforce;
import java.util.*;
public class num_1436 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int count = 0;
		while(N>0){
		    count++;
		    if(String.valueOf(count).contains("666")){
		        N--;
		    }
		}
		System.out.println(count);
	}
}