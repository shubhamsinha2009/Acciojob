
// Question Link -- https://course.acciojob.com/idle?question=ea8f08aa-d041-4639-a8c6-d3235d8bd34f

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
    public static long solve(int[] weights, int days) {
        long high  = 0;
       long low = 0;

        for(int weight:weights){
            high+= (long) weight;
            low =(long) Math.max(low,weight);
        }

        long leastWeight = (long) -1;
        while(low <= high){
           long mid = (long) (low + high)/2;

            if(isPossible(weights,days,mid)){
                leastWeight = mid;
                high = mid-1;
            }else{
                low= mid+1;
            }
        }

        return leastWeight;
    }
     public static  boolean isPossible(int[] weights, int days,long weightCapacity){
        int countDays=1;
        long sum =0;

        for(int weight:weights){
            sum+= (long) weight;

            if(sum>weightCapacity){
                countDays++;
                sum = weight;
            }
        }

        return countDays <= days ;
    }
}

class Main {
        public static void main (String[] args){
                Scanner sc = new Scanner(System.in);
        	int n = sc.nextInt();
        	int[] A = new int[n];
        	for(int i=0;i<n;i++){
                        A[i] = sc.nextInt();
		}
                int B = sc.nextInt();
                System.out.println(Solution.solve(A,B));
	}
}
