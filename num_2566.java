package Olympiad;
import java.util.*;
public class num_2566 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ary[][] = new int[9][9];
		int max=0;
		int col=0,row=0;
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				ary[i][j] = scan.nextInt();
				if(max<ary[i][j]) {
					max = ary[i][j];
					col = i+1;
					row = j+1;
				}
			}
		}	
		System.out.println(max);
		System.out.println(col + " " + row);
	}
}