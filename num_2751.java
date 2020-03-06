package Array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class num_2751 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> ary = new ArrayList<Integer>();
		
		for(int i=0;i<N;i++) {
			ary.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(ary);
		
		for(int i : ary) {
			System.out.println(i);
		}	
	}
}