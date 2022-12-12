
// Question Link -- https://course.acciojob.com/idle?question=db58f79f-ddf4-40db-a33e-5caf9d7005a9

import java.io.*;
import java.util.*;

class Accio {
       static int[] quickSort(int a[], int n)
        {
		int[] ans = new int[n]; 
			int k = 0, val = a[0]; 
			for(int i = 0; i < n; i++) 
				if(a[i] < val){ 
					ans[k] = a[i]; 
					k++; 
				} 
			for(int i = 0; i < n; i++) 
				if(a[i] == val){ 
					ans[k] = a[i];
					k++; 
				}
			for(int i = 0; i < n; i++) 
				if(a[i] > val){
					ans[k] = a[i]; 
					k++; 
				} 
			return ans;
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
        Accio Obj = new Accio();
        int[] result= Obj.quickSort(arr1, n);
        for(int i=0;i<n;i++)
                System.out.print(result[i] + " ");       
        System.out.println('\n');
    }
}
