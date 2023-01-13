
// Questions Link -- https://course.acciojob.com/idle?question=dfd243c0-23e1-4628-b227-5e38da625207

import java.io.*;
import java.util.*;

class Solution {
    public boolean arrayPairs(int[] arr, int k) {
		  int[] frequency = new int[k];
        for(int num : arr){
            num %= k;
            if(num < 0) num += k;
            frequency[num]++;
        }
        if(frequency[0]%2 != 0) return false;
        
        for(int i = 1; i <= k/2; i++)
            if(frequency[i] != frequency[k-i]) return false;
			
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
		k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        if(Obj.arrayPairs(arr,k)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
    }
}
