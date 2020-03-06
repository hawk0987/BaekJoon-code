package ICPC;
import java.util.*;
public class num_4435 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int gandalf[] = new int[6];
		int showron[] = new int[7];
		
		for(int i=0;i<T;i++) {
			int a=0,b=0;
			for(int j=0;j<6;j++) {
				gandalf[j] = scan.nextInt();
			}
			for(int j=0;j<7;j++) {
				showron[j] = scan.nextInt();
			}
			gandalf[1] = 2*gandalf[1];
			gandalf[2] = 3*gandalf[2];
			gandalf[3] = 3*gandalf[3];
			gandalf[4] = 4*gandalf[4];
			gandalf[5] = 10*gandalf[5];
			
			showron[1] = 2*showron[1];
			showron[2] = 2*showron[2];
			showron[3] = 2*showron[3];
			showron[4] = 3*showron[4];
			showron[5] = 5*showron[5];
			showron[6] = 10*showron[6];
			for(int j=0;j<6;j++) {
				a += gandalf[j];
			}
			for(int j=0;j<7;j++) {
				b += showron[j];
			}
			if(a>b) {
				System.out.println("Battle " + (i+1) + ": Good triumphs over Evil");
			}
			else if(a<b) {
				System.out.println("Battle " + (i+1) + ": Evil eradicates all trace of Good");
			}
			else {
				System.out.println("Battle " + (i+1) + ": No victor on this battle field");
			}
		}	
	}
}