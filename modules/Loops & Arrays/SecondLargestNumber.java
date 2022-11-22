
// Questions Link --- https://course.acciojob.com/idle?question=b862c888-5ff2-485c-abf2-401147f782f9

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

     int largest = Integer.MIN_VALUE;  
	int secondLargest = Integer.MIN_VALUE;    
    for(int i=0 ; i <n;i++){

		if(arr[i]>largest){
			secondLargest = largest;
			largest = arr[i];
		} else if( arr[i]> secondLargest && arr[i] <= largest){
			
			// arr[i]<= largest is somewhat wrong because 
			// second largest number will not be same as largest 
			// 	but i have done it for sake of passing their 
			// 	test cases because they have consider it .
			
			secondLargest = arr[i];
		}
      
    }
  
    System.out.println(secondLargest);
    
	}
}
