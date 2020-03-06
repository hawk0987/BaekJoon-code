package Realization;
import java.util.*;
public class num_2490 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ary[] = new int[4];
		
		for(int i=0;i<3;i++) {
			int count=0;
			for(int j=0;j<4;j++) {
				ary[j] = scan.nextInt();
				if(ary[j]==1) {
					count++;
				}
			}
			if(count == 3)
				System.out.println("A");
			if(count == 2)
				System.out.println("B");
			if(count == 1)
				System.out.println("C");
			if(count == 0)
				System.out.println("D");
			if(count == 4)
				System.out.println("E");
		}
	}
}