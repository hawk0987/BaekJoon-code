package Stack;
import java.util.*;
public class num_10773 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt();
		int ary[] = new int[K];
		int top=-1;
		int sum=0;
		
		for(int i=0;i<K;i++) {
			int num = scan.nextInt();
			if(num!=0) {
				top+=1;
				ary[top]=num;
			}else {
				top-=1;
			}
		}
		for(int i=0;i<top+1;i++) {
			sum+=ary[i];
		}
		System.out.println(sum);
	}

}