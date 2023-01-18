
// Question Link - https://course.acciojob.com/idle?question=fc5f657f-bf71-49c6-890c-96a5835f684b

import java.io.*;
import java.util.*;

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
            if(n<3) return -1;
        int low =0;
        int high = n-1;

        while(low<=high){
             int mid = (low+high)/2;

            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]) return mid;
            else if(arr[mid] < arr[mid+1]){
                 low=mid+1;
            }else{
               
                high=mid-1;
            }


        }

        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        Solution Obj = new Solution();
        int result = Obj.peakIndexInMountainArray(arr1);
        System.out.print(result + " ");
        System.out.println('\n');
    }
}
