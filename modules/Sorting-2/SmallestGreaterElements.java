
// Question Link -- https://course.acciojob.com/idle?question=878481a2-35da-4f24-85ed-13c333ca59d3

import java.util.*;

class Accio {
    public int[] SmallestGreaterElements(int[] arr) {

		// Brute Force Solution 
		// Time Complexity -- O(n^2)
		// Space Complexity -- O(n)
		
	// return bruteForceSolution(arr , arr.length);

		
		// Bubble Sort Solution
		// Time Complexity -- O(n^2)
		// Space Complexity -- O(n)

		return bubbleSortSolution(arr,arr.length);

	
    }

	private static void swap(int a , int b , int[] arr){
					int temp = arr[a];
					arr[a] = arr[b];
					arr[b] = temp;
	}

    public static void bubbleSort(int[] arr,int N) {

		
		for(int i = 0 ; i<N-1 ; i++){

			boolean swap = false;
			for(int j = 0 ; j<N-1-i; j++ ){

				int currentElementIndex = j;
				int nextElementIndex = j+1;
				
				if( arr[currentElementIndex] > arr[nextElementIndex]){
					swap(currentElementIndex,nextElementIndex,arr);
					swap = true;
				}
				
			}
			if(!swap){
				break;
			}
		}

		
    }

	private int[] bubbleSortSolution(int[] arr , int n){

		int[] sortedArray = Arrays.copyOf(arr,n);
		bubbleSort(sortedArray,n);
		

		for(int i =0 ; i<n ; i++){
			int j;
			for(j =0; j<n && arr[i] >= sortedArray[j] ;++j);

			  arr[i] =  j<n ? sortedArray[j] : -10000000;

			// equivalent if-else for above ternary operator
			// if(j<n){
			// 	arr[i] = sortedArray[j];
			// }else{
			// 	arr[i] = -10000000;
			// }

			
			

		}

		return arr;
		
	}

	private int[] bruteForceSolution(int[] arr , int n){
	
		int solution[]  = new int[n];

		for(int i = 0 ; i< n ; i++ ){
			int minDifference  = Integer.MAX_VALUE;
			 int closestElement = -10000000;

				for(int j =0 ; j<n ; j++){
					int difference = arr[j] - arr[i] ;

					if(difference > 0 && difference < minDifference){
						minDifference = difference;
						closestElement = arr[j];
					}
				}
			solution[i] = closestElement;
			
		}

		return solution;
		}

	
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Accio Obj = new Accio();
        int[] ans = Obj.SmallestGreaterElements(arr);
        for(int a : ans) {
            System.out.print(a + " ");
        }
    }
}
