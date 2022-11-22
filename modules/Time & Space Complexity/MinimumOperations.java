
// Questions Link --- https://course.acciojob.com/idle?question=401371a0-af9a-4e9c-ab4c-015c14491659

import java.util.*;


class Accio {

	private boolean areTheyEqual(int a , int b ){
		return a==b;
	}
  
    public void minOperations(int[] arr) {

		// Brute Force 
      
		
		int arrayLength = arr.length;
		int maxRepetition = 1;
		int lastIndex = arrayLength - 2 ;
      
       // Time Complexity -- O(n^2)
       // Space Complexity -- O(1)

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

		int minOperation = arrayLength - maxRepetition ;
		System.out.println(minOperation);

		// Optiminal Solution can be done through  Hashmap 
	
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
