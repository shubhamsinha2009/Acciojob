
// Question Link - https://course.acciojob.com/idle?question=59126924-703f-403a-8af9-821d06e3c75a

import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int gas[] = new int[n];
			int cost[] = new int[n];

			for(int i=0;i<n;i++){
				gas[i] = sc.nextInt();
			}

			for(int i=0;i<n;i++){
				cost[i] = sc.nextInt();
			}
		
		
			
			System.out.println(new Solution().tour(gas,cost));
	}
}
class Solution
{
	int tour(int gas[], int cost[])
	{
		 int n = gas.length;
        int sum1=0,sum2=0;
        int index = 0;
        for(int i=0;i<n ;i++){ 
            int diff = gas[i] - cost[i];
            sum1+= diff;
            sum2+=diff;
           
            if(sum2 < 0){
                sum2=0;
                index=i+1;
            } 

        }

        if(sum1<0) return -1;
        else return index;
	}
}
