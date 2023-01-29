
// Question Link -- https://course.acciojob.com/idle?question=d7e7dad4-e898-4180-99cc-501baea38794

import java.util.*;

class Solution {
    boolean checkHeap(int arr[]) {
        int n = arr.length;
        for (int i = 0; i <= (n - 2) / 2; i++) {
            if (arr[2 * i + 1] > arr[i]) {
                return false;
            }

            if (2 * i + 2 < n && arr[2 * i + 2] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    void buildHeap(int arr[]) {
		    int n = arr.length;
			int l = (n/2)-1;

			for(int i=l;i>=0;i--){
				maxHeapify(arr,i);
			}
    }

	void maxHeapify(int[] arr , int i){

		int left = 2*i +1;
		int right = 2*i +2;
		int largest = i;
		
		if(left<arr.length && arr[left] > arr[largest]) largest = left;
		if(right<arr.length && arr[right] > arr[largest]) largest = right;

		if(largest!=i){
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;

			maxHeapify(arr,largest);
		}	
	}
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        Obj.buildHeap(arr);
        if (Obj.checkHeap(arr)) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
        sc.close();
    }
}
