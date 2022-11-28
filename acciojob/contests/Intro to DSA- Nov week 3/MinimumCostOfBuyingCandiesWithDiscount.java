

// Question Link - https://course.acciojob.com/idle?question=e4955306-84c8-42c3-b7ba-b6a064efab05

import java.util.Scanner;
import java.util.Arrays;
class Solution{
    public int minimumCost(int[] cost) {
        
		Arrays.sort(cost);

		int sum = 0;
		int j =0;
		for(int i =cost.length -1 ; i>=0;i--){
			
			if(j==2){
				j=0;
			}else{
				sum+=cost[i];
				j++;
			}
			
		}
		return sum;
    }
}
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        int[] cost = new int[n];  
        for(int i=0; i<n; i++)  {  
            cost[i]=sc.nextInt();  
        } 
        Solution obj=new Solution();
        int ans= obj.minimumCost(cost);
        System.out.print(ans);
    }
}
