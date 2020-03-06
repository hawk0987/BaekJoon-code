package Bruteforce;
import java.util.*;
public class num_2309 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ary[] = new int[9];
		int sum=0;
		boolean con = false;

		
		for(int i=0;i<9;i++) {
			ary[i] = scan.nextInt();
			sum+=ary[i];
		}
		
		for(int i=0;i<9;i++) {
			if(con==true) {
				break;	
			}
			for(int j=0;j<9;j++) {
				if(i!=j) {
					if(sum-ary[i]-ary[j]==100) {
						ary[i]=0;
						ary[j]=0;
						con = true;
						break;
					}
				}
			}
		}
		Arrays.sort(ary);
			for(int i=0;i<9;i++) {
				if(ary[i]!=0) {
					System.out.println(ary[i]);	
				}
			}	
	}
}