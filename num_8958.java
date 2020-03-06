package Array;
import java.util.*;
public class num_8958 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N;		
		N = scan.nextInt();
		scan.nextLine();
		
		
		for(int i=0;i<N;i++){
			String ary = scan.nextLine();
			int score=0;
			int sum = 0;
			
			for(int j=0;j<ary.length();j++) {
				if(ary.charAt(j)=='O') {
				score +=1;
				sum +=  score;
				}
				if(ary.charAt(j)=='X') {
					score = 0;
				}
			}
			System.out.println(sum);
		}

	}

}
