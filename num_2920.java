package Array;
import java.util.*;
public class num_2920 {
	public static void main(String[] args) {
		int ary[] = new int[8];
		int num;
		
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<ary.length;i++) {
			num = scan.nextInt();
			ary[i] = num;
		}
		if(ary[0]==1 && ary[1]==2 && ary[2]==3 && ary[3]==4 && ary[4]== 5 && ary[5]==6 && ary[6]==7 && ary[7]==8) {
			System.out.println("ascending");
		}
		else if(ary[0]==8 && ary[1]==7 && ary[2]==6 && ary[3]==5 && ary[4]== 4 && ary[5]==3 && ary[6]==2 && ary[7]==1) {
			System.out.println("descending");
		}
		else{
			System.out.println("mixed");
		}
	}
}
