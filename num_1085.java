package Math1;
import java.util.*;
public class num_1085 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		int temp=0;
		
		int width = w-x;
		int heigth = h-y;
		
		if(x>width) {
			if(width>= heigth) {
				temp = heigth;
			}
			else
				temp = width;
		}else{
			temp = x;
		}
		
		if(y>heigth) {
			if(heigth>= width) {
				if(temp>width) {
					temp = width;	
				}
			}
			else
				if(temp>heigth) {
					temp = heigth;
				};
		}else {
			if(temp>y) {
				temp = y;
			}
		}
		System.out.println(temp);
	}

}
