package For;
import java.util.*;
public class num_2438 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		num = scan.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++)
				System.out.print("*");
				System.out.println("");
		}
		
	}

}
