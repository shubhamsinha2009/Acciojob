// Question Link -- https://course.acciojob.com/idle?question=0049558a-836e-4bef-b820-7e8810b345a5

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		for(int i =0;i<n;i++){
			a[i] = sc.nextInt();
		}
		

		squaring(n,a);
		bubbleSort(n,a);

		// Printing 
		for(int i =0;i<n;i++){
			System.out.print(a[i] + " ");
		}
    }

	public static void squaring(int n , int[] a){
				
		for(int i =0;i<n;i++){
			a[i]*=a[i];
		}
	}
	
	public static void bubbleSort(int N, int[] arr) {

		
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
	
	private static void swap(int a , int b , int[] arr){
					int temp = arr[a];
					arr[a] = arr[b];
					arr[b] = temp;
	}
}
