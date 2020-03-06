package Olympiad;
import java.util.*;
public class num_2506 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int OX;
		int score = 0;
		int point = 0;
		int N = scan.nextInt();
		
		for(int i=0;i<N;i++) {
			OX = scan.nextInt();
			if(OX==1) {
				point += OX;
				score += point;
			}
			else if(OX==0){
				point = 0;
			}
		}
		System.out.println(score);		
	}
}