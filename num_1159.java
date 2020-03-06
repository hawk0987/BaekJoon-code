package String;
import java.util.*;
public class num_1159 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int first[] = new int[26];
		int count=0;
		
		for(int i=0;i<N;i++) {
			String name = scan.next();
			if(name.charAt(0)=='a') {
				first[0] += 1;
			}else if(name.charAt(0)=='b'){
				first[1] += 1;
			}else if(name.charAt(0)=='c'){
				first[2] += 1;
			}else if(name.charAt(0)=='d'){
				first[3] += 1;
			}else if(name.charAt(0)=='e'){
				first[4] += 1;
			}else if(name.charAt(0)=='f'){
				first[5] += 1;
			}else if(name.charAt(0)=='g'){
				first[6] += 1;
			}else if(name.charAt(0)=='h'){
				first[7] += 1;
			}else if(name.charAt(0)=='i'){
				first[8] += 1;
			}else if(name.charAt(0)=='j'){
				first[9] += 1;
			}else if(name.charAt(0)=='k'){
				first[10] += 1;
			}else if(name.charAt(0)=='l'){
				first[11] += 1;
			}else if(name.charAt(0)=='m'){
				first[12] += 1;
			}else if(name.charAt(0)=='n'){
				first[13] += 1;
			}else if(name.charAt(0)=='o'){
				first[14] += 1;
			}else if(name.charAt(0)=='p'){
				first[15] += 1;
			}else if(name.charAt(0)=='q'){
				first[16] += 1;
			}else if(name.charAt(0)=='r'){
				first[17] += 1;
			}else if(name.charAt(0)=='s'){
				first[18] += 1;
			}else if(name.charAt(0)=='t'){
				first[19] += 1;
			}else if(name.charAt(0)=='u'){
				first[20] += 1;
			}else if(name.charAt(0)=='v'){
				first[21] += 1;
			}else if(name.charAt(0)=='w'){
				first[22] += 1;
			}else if(name.charAt(0)=='x'){
				first[23] += 1;
			}else if(name.charAt(0)=='y'){
				first[24] += 1;
			}else if(name.charAt(0)=='z'){
				first[25] += 1;
			}
		}
		
		if(first[0]>=5) {
			System.out.print("a");
		} if(first[1]>=5) {
			System.out.print("b");
		} if(first[2]>=5) {
			System.out.print("c");
		} if(first[3]>=5) {
			System.out.print("d");
		} if(first[4]>=5) {
			System.out.print("e");
		} if(first[5]>=5) {
			System.out.print("f");
		} if(first[6]>=5) {
			System.out.print("g");
		} if(first[7]>=5) {
			System.out.print("h");
		} if(first[8]>=5) {
			System.out.print("i");
		} if(first[9]>=5) {
			System.out.print("j");
		} if(first[10]>=5) {
			System.out.print("k");
		} if(first[11]>=5) {
			System.out.print("l");
		} if(first[12]>=5) {
			System.out.print("m");
		} if(first[13]>=5) {
			System.out.print("n");
		} if(first[14]>=5) {
			System.out.print("o");
		} if(first[15]>=5) {
			System.out.print("p");
		} if(first[16]>=5) {
			System.out.print("q");
		} if(first[17]>=5) {
			System.out.print("r");
		} if(first[18]>=5) {
			System.out.print("s");
		} if(first[19]>=5) {
			System.out.print("t");
		} if(first[20]>=5) {
			System.out.print("u");
		} if(first[21]>=5) {
			System.out.print("v");
		} if(first[22]>=5) {
			System.out.print("w");
		} if(first[23]>=5) {
			System.out.print("x");
		} if(first[24]>=5) {
			System.out.print("y");
		} if(first[25]>=5) {
			System.out.print("z");
		}
		
		for(int i=0;i<first.length;i++) {
			if(first[i]>=5) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("PREDAJA");
		}
		
	}

}
