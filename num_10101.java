package Olympiad;
import java.util.*;
public class num_10101 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		if(A==60 && B==60 && C==60) {
			System.out.println("Equilateral");
		}
		else if(A+B+C==180) {
			if(A==B || B==C || A==C) {
				System.out.println("Isosceles");
			}
			else if(A!=B && B!=C && A!=C) {
				System.out.println("Scalene");
			}
		}
		else {
			System.out.println("Error");
		}
		
	}
}