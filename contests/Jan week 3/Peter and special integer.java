
// Question Link -- https://course.acciojob.com/idle?question=6d2d13d6-204e-499d-b92d-843f0ba3610c

import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	   
        int n=sc.nextInt(); 
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            arr[i]=x;
        }
        
        Solution ob=new Solution();
        System.out.println(ob.findspecial(arr,n));
	}
}


class Solution {
     public int findspecial(int[] arr,int n) {
        
		 HashMap<Integer,Integer> map = new HashMap<>();

		 int ans=-1;
		 for(int i :arr){
			 int count = map.getOrDefault(i,0)+1;
				if(count==i && i>ans ){
					
					ans =i;
				}
			 map.put(i,count);
		 }
		 return ans;
    }
}
