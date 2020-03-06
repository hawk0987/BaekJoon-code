package Math1;
import java.util.*;
public class num_1193 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int A=1,B=1;
		int cnt = 1;
		boolean up = false;
		

		for(int i=2;i<X;i++) {
			
			for(int j=0;j<cnt;j++) {
				if(up=false) {
					A=A+1;
					B=B-1;
				}	
			}up = true;
			cnt++;
			for(int k=0;k<cnt;k++) {
				if(up=true) {
					A=A-1;
					B=B+1;
				}	
			}up = false;
			cnt++;
		}
		if(X==1) {
			System.out.println("1/1");
		}
		else if(X==2) {
			System.out.println("1/2");
		}else {
			System.out.println(A+"/"+B);
		}
		
	}

}