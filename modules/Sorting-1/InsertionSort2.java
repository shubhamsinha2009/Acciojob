
// Question Link --- https://course.acciojob.com/idle?question=6552801f-7339-4e02-b404-c94641da8096

import java.util.*;

public class Main {

    public static void insertionSort(int a[], int n) {

	// Time Complexity -- O(n^2)
	// Space Complexity --- O(1)	

        for(int k =1 ; k < n; k++){
			// Key is the element which we have to insert 
            int key = a[k]; 

			// previous index of key 
            int i =k-1; 
			
	// Start Traversing from second last element
			// Traverse till first index 
			// or till key is smaller than current element
			
			
            while(i>=0 && key < a[i]){
                a[i+1] = a[i]; // move element to Next Index
				
               //decrement of index till insertion place is found
                i--;
            }
			
            a[i+1]= key; // inserting the key

			 // Printing elements of each pass
              for(int j = 0; j < n; j++){
                   System.out.print(a[j] + " ");
                    }   
                 System.out.println();
               
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
        }
        insertionSort(arr, n);
    }
}
