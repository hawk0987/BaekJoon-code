package Stack;
import java.util.*;
public class num_10828 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int ary[] = new int[N];
		int top=-1;
		
		for(int i=0;i<N;i++) {
			String order = scan.next();
			
			if(order.equals("push")) {
				top += 1;
				ary[top] = scan.nextInt();
			}
			if(order.equals("pop")) {
				if(top==-1) {
					System.out.println("-1");
				}else {
					System.out.println(ary[top]);
					top-=1;
				}
			}
			if(order.equals("size")) {
				System.out.println(top+1);
			}
			if(order.equals("empty")) {
				if(top==-1) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}
			if(order.equals("top")) {
				if(top==-1) {
					System.out.println("-1");
				}else {
					System.out.println(ary[top]);
				}

			}
		}

	}

}