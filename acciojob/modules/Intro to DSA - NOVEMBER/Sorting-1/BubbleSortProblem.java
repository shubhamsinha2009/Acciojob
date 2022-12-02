
// Question Link -- https://course.acciojob.com/idle?question=3dcb9b48-c49e-418c-a0d3-8d5fdc68c799

import java.io.*;
import java.util.*;

class Solution {
       static void bubbleSort(int a[], int n)
    {

        int swaps = 0;
        for(int i = 0; i<n -1 ;i++ ){
            boolean swap =false;
            for(int j = 0; j<n-i-1;j++){

                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swaps++;
                    swap = true;
                }
                
            }
            if(swap==false){
                break;
            }
        }

        System.out.println(swaps);
        System.out.println(a[0]);
        System.out.println(a[n-1]);
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
        Obj.bubbleSort(arr1, n);
    }
}
