

// Question link --  https://course.acciojob.com/idle?question=e56d8fb9-9b68-4cdd-a742-a8b11eb64a03

import java.util.*;


class Accio {

	private boolean areTheyEqual(int a , int b ){
		return a==b;
	}
  
    public void minOperations(int[] arr) {

		// Brute Force 
		    
       // Time Complexity -- O(n^2)
       // Space Complexity -- O(1)

		 int minOperation = bruteSolution(arr); 

		// Using sorting (in built function or merge or quick )
		// Time Complexity -- O(nlogn)  
		// Space Complexity -- O(1)

		// int minOperation = sortingSolution(arr);
		
		
		// Optiminal Solution can be done through  Hashmap 
		// Time Complexity -- O(n)
	    // Space Complexity -- O(n)

		 // int minOperation = hashMapSolution(arr);

		System.out.println(minOperation);
    }

	public int bruteSolution(int[] arr){

		int arrayLength = arr.length;
		int maxRepetition = 1;
		int lastIndex = arrayLength - 2 ;
  

		for(int i = 0 ; i< lastIndex ;i++ ){
			int checkElement = arr[i];
			int repetition = 1;

			int nextElementFromCheck = i+1;
          
         // starting from next element because
         // intial repetition value is 1
          
          
			for(int j = nextElementFromCheck ; j< arrayLength;j++){

				int currentElement = arr[j];

				if( areTheyEqual(currentElement , checkElement) ){
					repetition++;
				}
	
			}

			if(repetition > maxRepetition){
				maxRepetition = repetition;
			  }
	
		}

		// Minimum Operation = totalElements - maxRepeation because 
		// we need to change all numbers which are not repeated or 
		//same as maximum repeated number

		return arrayLength - maxRepetition ;
		

		
	} 

	public int sortingSolution(int a[] ){
		int n = a.length;
		Arrays.sort(a);

		int maxFrequency = 1;
		int freq = 1;
	

		for(int i = 1 ; i<n;i++){

			if(a[i] == a[i-1]){
				freq++;
				
			}else{
				freq =1 ;
			}

			if(freq > maxFrequency){
				
				maxFrequency = freq;
			} 
			
		}

		return n- maxFrequency;
		
		
	}
	
	public int hashMapSolution(int[] a){
		int n = a.length;

		HashSet<Integer> set = new HashSet<Integer>();
				
		int max = 1;
	
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i =0 ; i<n ; i++){
		
			if(!map.containsKey(a[i])){

				map.put(a[i],1);
				
			}else{
				int value = map.get(a[i]);
				map.put(a[i],++value);

				if(value > max ){
					max = value;
				
				}
				
			}
			

		
		}

		return n - max ;
	
	}
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt();
            Accio Obj = new Accio();
            Obj.minOperations(arr);
				
            t--;
        }
        sc.close();
    }
}
