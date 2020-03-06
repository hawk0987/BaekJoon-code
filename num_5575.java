package Realization;
import java.util.*;
public class num_5575 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			int hour,min,sec;
			int inhour = scan.nextInt();
			int inmin = scan.nextInt();
			int insec = scan.nextInt();
			
			int outhour = scan.nextInt();
			int outmin = scan.nextInt();
			int outsec = scan.nextInt();
			
			if(outsec>=insec) {
				sec = outsec-insec;
			}else {
				sec = (60+outsec)-insec;
				outmin -= 1;
				if(outmin<0) {
					outmin += 60;
					outhour -= 1;
				}
			}
			
			if(outmin>=inmin) {
				min = outmin-inmin;
			}else {
				min = (60+outmin)-inmin;
				outhour -= 1;
			}
			hour = outhour-inhour;
			System.out.println(hour + " " + min + " " + sec);
		}
		
	}

}
