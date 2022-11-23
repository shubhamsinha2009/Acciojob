
// Question Link -- https://course.acciojob.com/idle?question=01b4282d-bfae-4beb-9521-88e5b9a131f3

import java.io.*;
import java.util.*;
 

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int n = Integer.parseInt(br.readLine().trim());
         String[] arr_a = br.readLine().split(" ");
         int[] a = new int[n];
         for(int i_a = 0; i_a < arr_a.length; i_a++)
         {
         	a[i_a] = Integer.parseInt(arr_a[i_a]);
         }
         Solution Obj = new Solution();
         int out_ = Solution.solve(a);
         System.out.println(out_);
 
         wr.close();
         br.close();
    }
}

 class Solution {
    static int solve(int[] a){
       int n = a.length;

        for( int i =0 ; i<n/2 +1 ; i++){
        boolean swap = false ;
			
            for(int j=0; j<n-i-1 ; j++){

                if(a[j] > a[j+1]){
                    swap = true ;
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
                
                
            }

            if(swap == false){
                break;
            }
        }

        return a[n/2] ;
    
    }
}
