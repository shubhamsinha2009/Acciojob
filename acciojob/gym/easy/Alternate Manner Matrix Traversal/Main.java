
// Question Link -- https://course.acciojob.com/idle?question=01775dbc-41a0-4dc7-842d-bb3175e4762d

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int arr[][] = new int[n][m];
    
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        arr[i][j] = scanner.nextInt();
        
      }
    }
     for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
             
             if(i % 2 == 0){
            System.out.print(arr[i][j]);
             }
             else{ 
               System.out.print(arr[i][m-j-1]);
             }
               System.out.print(" ");
           }
    
        
    }
    
    
    
	}
}
