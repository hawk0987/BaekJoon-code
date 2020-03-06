package Math1;
import java.util.*;
public class num_2839 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int temp=5001;
		int N = scan.nextInt();
		for(int i=0;i<1001;i++) {
			for(int j=0;j<1001;j++) {
				if(3*i + 5*j==N) {
					if(temp>i+j)
						{temp = i+j;}
					break;
				}

			}
			
		}
		if(temp==5001)
		{
			System.out.println("-1");
		}else
			System.out.println(temp);
	}
}