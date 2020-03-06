package Array;
import java.util.*;
public class num_1427 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();
      int M = N;
      int num = 1;
      while(M>=10) {
         M = M/10;
         num++;
      }
      Integer[] ary = new Integer[num];
      
      int j=0;
      while(N>=10) {
         ary[j] = N%10;
         N = N/10;
         j++;
      }
      ary[j] = N%10;
      
      Arrays.sort(ary, Collections.reverseOrder());
      
      for(int i=0;i<ary.length;i++) {
         System.out.print(ary[i]);   
      }
            

   }

}