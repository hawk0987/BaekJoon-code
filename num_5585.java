package Realization;
import java.util.*;
public class num_5585 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cost = scan.nextInt();
		int money = 1000-cost;
		int count=0;
			if(money>=500) {
				count++;
				money -= 500;
			}
			if(money>=100) {
				while(money>=100) {
					money -= 100;	
					count++;
				}
			}
			if(money>=50) {
				while(money>=50) {
					money -= 50;
					count++;
				}
			}
			if(money>=10) {
				while(money>=10) {
					money -= 10;
					count++;
				}
			}
			if(money>=5) {
				while(money>=5) {
					money -= 5;	
					count++;
				}
			}
			if(money>=1) {
				while(money>=1) {
					money -= 1;	
					count++;
				}
			}
		System.out.println(count);

	}

}
