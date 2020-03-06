package String;
import java.util.*;
public class num_1032 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String ary[] = new String[N];
		boolean con=true;
		String result="";
		
		for(int i=0;i<N;i++) {
			ary[i] = scan.next();
		}
		for(int i=0;i<ary[0].length();i++){
			for(int j=1;j<N;j++) {
					if(ary[0].charAt(i)==ary[j].charAt(i)) {
						con = true;
					}else {
						con = false;
						break;
					}
			}
				if(con==false) {
					result +="?";
				}
				else{
					result+=ary[0].charAt(i);
				}				
		}
			System.out.println(result);
		}
}