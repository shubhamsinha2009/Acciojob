
// Question Link -- https://course.acciojob.com/idle?question=629217db-7ed5-4c49-9aff-ed7ecbd251af


// Java program to find minimum element in a sorted and
// rotated array
import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    static int findMin(int nums[], int low, int high)
    {

       if(nums[low]<=nums[high]) return nums[low];

       while(low<=high){

           int mid = (low+high)/2;

           if(nums[mid] > nums[mid+1]){
               return nums[mid+1];
           }else if(nums[mid] < nums[mid-1]){
                    return nums[mid];
           }else if(nums[mid] > nums[low]){
                low = mid+1;
           }else{
               high = mid-1;
           }
       } 

       return -1;

    }
}
class Main {
    
 
    // Driver Program
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        arr[i] = sc.nextInt();
        System.out.println(Solution.findMin(arr, 0, n- 1));
    }
}
