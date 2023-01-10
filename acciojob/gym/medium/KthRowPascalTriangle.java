
// Question Link -- https://course.acciojob.com/idle?question=28343c14-517f-4ba2-ab67-c22339550a60

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;


class Main {
    
  public static void main (String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        Solution obj=new Solution();
        obj.solve(k);
        System.out.println();
    }
  
}

class Solution{
    public static void solve(int k)
    {
		
		// Time Complexity -- O(n) 
		// Space Complexity -- O(1)
		int num =1;
		System.out.print(num+" ");
      for(int i=0 ; i<k;i++){
		  num *= k-i;
		  num /= i+1;
		  System.out.print(num+" ");
 	  }
        
    }
}
