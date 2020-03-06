package beginner;
import java.util.*;
public class num_2083 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		int age,height;
		
		while(true){
			name = scan.next();
			age = scan.nextInt();
			height = scan.nextInt();
			if(name.equals("#") && age==0 && height==0) {
				break;
			}
			else if(age>17 || height>=80) {
				System.out.println(name + " Senior");
			}
			else{
				System.out.println(name + " Junior");
			}	
		}
	}
}