
// Questions Link -- https://course.acciojob.com/idle?question=00744049-8dcb-4429-8ae0-f3607545f1a5

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

    for(int i =0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    
    for(int j=0; j<n - 1 ; j++){
     for(int i = j+1;i<n;i++){
       if(arr[i] == arr[j]){
      System.out.println(true);
       System.exit(0);
       }
    }
    }
System.out.println(false);
    
	}
}
