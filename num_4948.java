package Realization;
import java.util.*;
public class num_4948 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int n = scan.nextInt();
			int count=0;
			if(n==0) {
				break;
			}
			else if(n==1) {
				System.out.println(1);
			}
			else {
				for(int i=n+1;i<=2*n;i++) {
					count++;
					for(int j=2;j<Math.sqrt(i)+1;j++) {
						if(i%j==0) {
							count--;
							break;
						}			
					}
				}	
				System.out.println(count);
			}
		}		
	}
}