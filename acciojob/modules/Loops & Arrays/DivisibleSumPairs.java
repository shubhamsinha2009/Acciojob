
// Questions Links - https://course.acciojob.com/idle?question=82cf75e9-7aba-4534-b7e9-d5e1db10893a

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
  
    int n = sc.nextInt();
    int k = sc.nextInt();
    int numberOfDivisible = 0;
    
    int arr[] = new int[n];
    
    for(int i =0 ; i < n ; i++){
      arr[i]= sc.nextInt();
    }
  
    for(int i=0 ; i <n-1;i++){
      
      for(int j=i+1; j <n ;j++){
        int remainder = (arr[i] + arr[j]) % k ;
        if(remainder == 0 ){
          numberOfDivisible++;
        }
        
        
      }
      
    }
  
    System.out.println(numberOfDivisible);
    
    
    
	}
}
