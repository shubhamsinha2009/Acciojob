

// Question Link -- https://course.acciojob.com/idle?question=20d07877-efcd-4565-83b9-fc63961dec0d

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
  
    int n = sc.nextInt();

    
    int arr[] = new int[n];
    
    for(int i =0 ; i < n ; i++){
      arr[i]= sc.nextInt();
    }

                Arrays.sort(arr);
         long cal =0;

            
      for(int j=0; j <n ;j++){
            
         cal += (arr[n-j-1] *(long) Math.pow(2,j));

      }
       
  
    System.out.println(cal);
    
	}
}
