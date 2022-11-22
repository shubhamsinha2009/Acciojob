
// Question Link --- https://course.acciojob.com/idle?question=04c51a0a-2136-40da-8738-c391d6a9ef8f

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int arr[] = new int[N];

        // Input of array
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // bubble sort in descending order
        bubbleSort(N, arr);
        // printing array elements
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }

    }

	private static void swap(int a , int b , int[] arr){
					int temp = arr[a];
					arr[a] = arr[b];
					arr[b] = temp;
	}

    public static void bubbleSort(int N, int[] arr) {

		
		for(int i = 0 ; i<N-1 ; i++){

			boolean swap = false;
			for(int j = 0 ; j<N-1-i; j++ ){

				int currentElementIndex = j;
				int nextElementIndex = j+1;
				
				if( arr[currentElementIndex] < arr[nextElementIndex]){
					swap(currentElementIndex,nextElementIndex,arr);
					swap = true;
				}
				
			}
			if(!swap){
				break;
			}
		}

		
    }
}
