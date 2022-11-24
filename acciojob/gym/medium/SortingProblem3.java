
// Question Link -- https://course.acciojob.com/idle?question=0049558a-836e-4bef-b820-7e8810b345a5

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		for(int i =0;i<n;i++){
			a[i] =sc.nextInt();
		}

				
		for(int i =0;i<n;i++){
			a[i]*=a[i];
		}
		
		for(int i = 0;i<n-1;i++){
			
			for(int j=0;j<n-1;j++){		
				
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}

		
		for(int i =0;i<n;i++){
			System.out.print(a[i] + " ");
		}
    }
}
