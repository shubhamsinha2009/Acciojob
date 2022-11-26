
// Question Link - https://course.acciojob.com/idle?question=e56d8fb9-9b68-4cdd-a742-a8b11eb64a03

import java.util.*;

public class Main {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution ob = new Solution();
        System.out.print(ob.maximum_occurrence(arr, n));

    }
}
class Solution{

    int maximum_occurrence(int arr[], int n) {

		// Using sorting (in built function or merge or quick )
		// Time Complexity -- O(nlogn)  
		// Space Complexity -- O(1)

		return sortingSolution(arr,n);
		
		// HashMap Solution
		// Time Complexity -- O(n)
		// Space Complexity -- O(n)

		// return hashmapSolution(arr,n);
    }

	private int sortingSolution(int a[] , int n ){

		Arrays.sort(a);

		int maxFrequency = 1;
		int freq = 1;
		int maxOccurElement = a[0];

		for(int i = 1 ; i<n;i++){

			if(a[i] == a[i-1]){
				freq++;
				
			}else{
				freq =1 ;
			}

			if(freq > maxFrequency){
				
				 maxFrequency = freq;
				maxOccurElement = a[i];
			} 
			
		}

		return maxOccurElement;
		
		
	}

	
	private int hashmapSolution(int a[] , int n){
				
		int max = 0;
		int maxO = 0;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i =0 ; i<n ; i++){
		
			if(!map.containsKey(a[i])){

				map.put(a[i],1);
				
			}else{
				int value = map.get(a[i]);
				map.put(a[i],++value);

				if(value > max ){
					max = value;
					maxO = a[i];
				}
				if(value == max && a[i] < maxO ){
					maxO = a[i];
				}
			}
			

		
		}

		return maxO;
	}
}
