
// Question Link -- https://course.acciojob.com/idle?question=7aa67433-0a18-481d-98d9-602d65779b1a

import java.io.*;
import java.util.*;
class Main{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
        int n,q;
        n=sc.nextInt();
        q=sc.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++){
          a[i] = sc.nextInt();
        }
        Solution obj=new Solution();
        System.out.println(obj.minSubarray(a,n,q));		    
    }
}

class Solution
{
  public int minSubarray(int[] A,int n, int p) {

	  int sum =0;

	  for(int i:A) sum = (sum + i)%p;
		if(sum==0) return 0;
		  int preSum =0;
		HashMap<Integer,Integer> map = new HashMap<>();
		  map.put(0,-1);
		  int min=n;
	  for(int i=0;i<n;i++){
		  preSum= (preSum+ A[i])%p;
		  map.put(preSum,i);
		  int value = (preSum - sum + p)%p;
			min = Math.min(min,i-map.getOrDefault(value,-n));
	  }

	  return min<n?min:-1;
  }
}
