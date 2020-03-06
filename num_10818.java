package Array;
import java.util.*;
public class num_10818 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N,A;
		int max=-1000001;
		int min=1000001;
		N = scan.nextInt();
		int[] ary = new int[N];
		//최댓값 구하는 함수
		for(int i=0;i<ary.length;i++) {
			A = scan.nextInt();
			if(A>max) {
				max = A;
			}
			if(A<min) {
				min = A;
			}
		}
		System.out.print(min + " ");
		System.out.print(max);

	}

}
