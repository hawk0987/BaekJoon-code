package String;
import java.util.*;
public class num_1100 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ary[][] = new char[8][8];
		int count = 0;
		
		for(int i=0;i<8;i++) {
			String chess = scan.nextLine();
			for(int j=0;j<8;j++) {
				ary[i][j] = chess.charAt(j);
				if((i+j)%2==0 && ary[i][j]=='F') {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
