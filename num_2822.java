package Realization;
import java.util.*;
public class num_2822 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score[] = new int[8];
		int index[] = new int[8];
		int sum=0;
		
		for(int i=0;i<8;i++) {
			score[i] = scan.nextInt();
			index[i] = score[i];
		}
		
		Arrays.sort(score);
		for(int i=3;i<8;i++) {
			sum+=score[i];
		}
		System.out.println(sum);
		
		for(int i=0;i<8;i++) {
			for(int j=3;j<8;j++) {
				if(index[i]==score[j]) {
					System.out.print(i+1);
					if(i==7) {
						break;
					}
					System.out.print(" ");
				}
			}
		}
	}
}