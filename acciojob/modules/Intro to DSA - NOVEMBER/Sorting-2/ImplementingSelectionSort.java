
// Question Link -- https://course.acciojob.com/idle?question=90ddafa3-7d35-44c4-be3d-82da7034485c

import java.util.*;

class Accio {

	private void swap( int a , int b , int arr[]){
		// a & b are indices
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
    public int[] SelectionSort(int[] arr) {
        int n = arr.length;

		int lastElementIndex = n-1 ;

		

		for(int i =0 ; i< lastElementIndex ; i++){
			int minimumElementIndex = i;
			
			for(int j = i+1 ; j< n ; j++ ){

				int currentElement = arr[j];

				int minimumElement = arr[minimumElementIndex];

				if(currentElement < minimumElement){
					minimumElementIndex = j  ; 
					// j is current element index
					
				}
				
			}
			swap(i , minimumElementIndex , arr);
			
		}
		return arr;
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
        int[] ans = Obj.SelectionSort(arr);

        for(int a : ans)
            System.out.print(a + " ");
    }
}
