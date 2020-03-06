package ICPC;
import java.util.*;
public class num_4892 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1,n2,n3,n4,result;
		boolean even;
		int count=1; 
		while(true) {
			int n0 = scan.nextInt();
			if(n0==0) {
				break;
			}
			
			n1 = n0*3;
			if(n1%2==0) {
				n2 = n1/2;
				even = true;
			}
			else {
				n2 = (n1+1)/2;
				even = false;
			}
			
			n3 = n2*3;
			n4 = n3/9;
			
			if(even==true) {
				result = 2*n4;
				System.out.println(count+". even "+ n4);
			}
			else {
				result = 2*n4+1;
				System.out.println(count+". odd "+ n4);
			}
			count++;
		}
		
	}

}
