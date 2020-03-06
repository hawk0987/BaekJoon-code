package beginner;
import java.text.DecimalFormat;
import java.util.*;
public class num_13223 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a,b,c;
		int sum,count=1;
		DecimalFormat df = new DecimalFormat();
		df.applyLocalizedPattern("0.000");
		
		while(true) {
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			if(a==0 && b==0 && c==0) {
				break;
			}
			if(a==-1) {
				a = Math.sqrt((c*c)-(b*b));
				System.out.println("Triangle #" + count);
				if(c<=b) {
					System.out.println("Impossible.");
				}
				else {
					System.out.println(String.format("a = %.3f", a));
				}
				count++;
			}
			if(b==-1) {
				b = Math.sqrt((c*c)-(a*a));
				System.out.println("Triangle #" + count);
				if(c<=a) {
					System.out.println("Impossible.");
				}
				else {
					System.out.println(String.format("b = %.3f", b));
				}
				count++;
			}
			if(c==-1) {
				c = Math.sqrt((a*a)+(b*b));
				System.out.println("Triangle #" + count);
				if(c<=0) {
					System.out.println("Impossible.");
				}
				else {
					System.out.println(String.format("c = %.3f", c));
				}
				count++;
			}
			System.out.println();
		}	
	}
}