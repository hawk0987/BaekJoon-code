package Array;
import java.util.*;
public class num_2562 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[9];
		int cnt = 0;
		int a,Max=0;
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = scan.nextInt();
			if(arr[i]>Max)
			{
				Max = arr[i];
				cnt = i+1;
			}
		}
		System.out.println(Max);
		System.out.println(cnt);	
	}

}
