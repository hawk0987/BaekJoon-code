package Realization;
import java.util.*;
public class num_5543 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int temp1=2000;
		int temp2=2000;
		int burger;
		int drink;
		
		for(int i=0;i<3;i++) {
			burger = scan.nextInt();
			if(temp1>=burger) {
				temp1 = burger;
		}
		}
		for(int i=0;i<2;i++) {
			drink = scan.nextInt();
			if(temp2>=drink) {
				temp2 = drink;
		}
		}
		System.out.println(temp1+temp2-50);		
	}
}