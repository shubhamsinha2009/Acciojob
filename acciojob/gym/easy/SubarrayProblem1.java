
// Question Link -- https://course.acciojob.com/idle?question=08d482fc-3df2-4759-8977-941fa4f78b1f

import java.util.*;
class Solution
{
     public static String solve(int []arr, int n, int s){

		 // Time Complexity -- O(n)
		 // Space Complexity -- O(1)

		 // Used Formula - Sum of n number = n*(n+1)/2
		 
		 for(int i = n;i<=10;i++){
				int d = i-n;
				int sum = ((i*(i+1)) - (d *(d+1)))/2 ;
			 // System.out.println(d);
			 // System.out.println(sum);
				 if(sum == s){
					 return "YES";
				 }
				 
			 
		 }
		 return "NO";
    }
}
public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int []arr={1,2,3,4,5,6,7,8,9,10};
        int n;
        n=sc.nextInt();
        int s;
        s=sc.nextInt();
		Solution obj = new Solution();
        System.out.println(obj.solve(arr, n, s));
    }
}


