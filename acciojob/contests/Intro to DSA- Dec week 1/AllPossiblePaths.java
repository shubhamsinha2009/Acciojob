
// Question Link -- https://course.acciojob.com/idle?question=8016f249-87ab-49f9-9c5a-b1b330732651

import java.io.*;
import java.util.*;
class Main{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++){
          a[i] = sc.nextInt();
        }
        Solution obj=new Solution();
        obj.allpossiblepaths(0,a,n,"");		    
    }
}

class Solution
{
    public void allpossiblepaths(int i,int[] a,int n,String ans) {

		if(i==n-1){
			System.out.println(ans+String.valueOf(i));
			return;
		}

	

		for(int j = 1;j<=a[i] && i+j<n;j++){
		
			allpossiblepaths(i+j,a,n,ans + String.valueOf(i)+" -> ");
		}
    }
}
