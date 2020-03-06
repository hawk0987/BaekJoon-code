package Stack;
import java.util.*;
public class num_9012 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();		
		for(int i=0;i<T;i++) {
			
			boolean con;
			int top = -1;
			String ps = scan.next();
			char ary[] = ps.toCharArray();
			for(int j=0;j<ps.length();j++) {
				top++;
				ary[top] = ps.charAt(j);
				if(ary[top]==')') {
					top=top-2;
					if(top < -1) {
						con = false;
						break;
					}
				}
			}
				if(top!=-1) {
					con=false;
				}				
				else {
					con=true;
				}
				System.out.println(con?"YES":"NO");
			}			
		}

	}