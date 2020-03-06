package Olympiad;
import java.util.*;
public class num_10158 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int h = scan.nextInt();		
		int p = scan.nextInt();
		int q = scan.nextInt();		
		int t = scan.nextInt();
		
		boolean x = ((p+t)/w)%2==1;
		boolean y = ((q+t)/h)%2==1;
		int nowx=0,nowy=0;
		
		if(x) {
			nowx = w - (p+t)%w;
		}
		else {
			nowx = (p+t)%w;
		}
		
		if(y) {
			nowy = h - (q+t)%h;
		}
		else {
			nowy = (q+t)%h;
		}
		System.out.println(nowx + " " + nowy);		
	}
}