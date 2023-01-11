
// Question Link -- https://course.acciojob.com/idle?question=dfc7b95e-ae2e-4581-bbb6-d2353112fbaf

import java.io.*;
import java.util.*;

class Accio {
       static int[] quickSort(int a[], int n)
        {
			int[] ans = new int[n]; 
           int pivot = a[0];
			int k = 0;

			for(int i : a) if(i<pivot) ans[k++] = i;
			for(int i : a) if(i==pivot) ans[k++] = i;
			for(int i : a) if(i>pivot) ans[k++] = i;

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
