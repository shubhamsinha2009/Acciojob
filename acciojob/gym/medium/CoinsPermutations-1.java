
// Question Link - https://course.acciojob.com/idle?question=00ef1a30-24e1-403f-a0b0-57d7b7d41cd9


import java.util.*;

class Solution {
    public static void coinChange(int[] coins, int amt){

		
		printCoins(coins,amt,0,"", new boolean[coins.length]);
    }

	public static void printCoins(int[] coins,int amt, int sum , String ans,boolean[] done){
		if(sum>amt) return;
		else if(sum== amt) {
			System.out.println(ans);
			return;
		}
		
		for(int i =0 ;i<coins.length;i++){

			if(!done[i]){
				done[i] = true;
			printCoins(coins,amt,sum+coins[i],ans+String.valueOf(coins[i])+" ",done);	
				done[i] = false;
			}
			
			
		}
		
		
	}
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        int amt = sc.nextInt();

        Solution Obj = new Solution();
        Obj.coinChange(coins, amt);
    }
}
