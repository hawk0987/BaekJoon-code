package basic;
import java.util.*;
public class num_17009 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int shot1,shot2;
		int goal1,goal2;
		int free1,free2;
		
		shot1 = scan.nextInt();
		goal1 = scan.nextInt();
		free1 = scan.nextInt();
		int Apple = shot1*3 + goal1*2 + free1*1;
		
		shot2 = scan.nextInt();
		goal2 = scan.nextInt();
		free2 = scan.nextInt();
		int Banana = shot2*3 + goal2*2 + free2*1;
		
		if(Apple>Banana) {
			System.out.println("A");	
		}
		else if(Apple<Banana) {
			System.out.println("B");
		}
		else {
			System.out.println("T");
		}
	}
}