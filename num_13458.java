package basic;
import java.io.*;
import java.util.*;
public class num_13458 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A[] = new int[N];
		for(int i=0;i<N;i++){
			A[i] = Integer.parseInt(st.nextToken());
	    }
		
		st = new StringTokenizer(br.readLine());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		long man = N;
		
		for(int i=0;i<N;i++){
	        A[i] -= B;
	        if(A[i] <= 0) continue;
	        man += Math.ceil(A[i]/(C*1.0));
	    }
	    System.out.println(man);
	}

}
