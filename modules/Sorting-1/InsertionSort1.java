
// Question Link -- https://course.acciojob.com/idle?question=eb16a0c2-2cb3-4c56-bb75-27814d802423

import java.util.*;
import java.io.*;

class Solution{
        static void insertionSort1(int a[],int n){
			
            int i = n-2; // Second Last Index
			
			// Key is the element which we have to insert 
			int key = a[n-1]; 
			
			// Start Traversing from second last element
			// Traverse till first index 
			// or till key is smaller than current element
			
			 
			// Time Complexity -- O(n^2)
			// Space Complexity --- O(1)	
			
            while(i>=0 && key < a[i]){
				
                a[i+1] = a[i]; // move element to Next Index 

				 // Printing elements of each pass
                 for(int j = 0; j < n; j++){

					
                   System.out.print(a[j] + " ");
                    }   
                 System.out.println();
                i--;
		//decrement of index till insertion place is found
            }
            a[i+1]= key; // inserting the key

			// printing last pass after insertion
			
             for(int j = 0; j < n; j++){
                   System.out.print(a[j] + " ");
                    }   
                 

            
        }
}
public class Main {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }   
        Solution.insertionSort1(a,n);
    }
}
