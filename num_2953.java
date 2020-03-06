package Array;
import java.util.*;
public class num_2953 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] ary = new int[5][4];
		int sum1=0,sum2=0,sum3=0,sum4=0,sum5=0;
		int win=0;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				ary[i][j] = scan.nextInt();
			}
		}
		
		for(int j=0;j<4;j++) {
			sum1 += ary[0][j];
			sum2 += ary[1][j];	
			sum3 += ary[2][j];	
			sum4 += ary[3][j];	
			sum5 += ary[4][j];	
		}
		if(win<sum1) {
			win=sum1;
		}
		if(win<sum2) {
			win=sum2;
		}
		if(win<sum3) {
			win=sum3;
		}
		if(win<sum4) {
			win=sum4;
		}
		if(win<sum5) {
			win=sum5;
		}
		
		if(win==sum1) {
			System.out.println("1 " + win);
		}
		else if(win==sum2) {
			System.out.println("2 " + win);
		}
		else if(win==sum3) {
			System.out.println("3 " + win);
		}
		else if(win==sum4) {
			System.out.println("4 " + win);
		}
		else if(win==sum5) {
			System.out.println("5 " + win);
		}
		
	}

}
