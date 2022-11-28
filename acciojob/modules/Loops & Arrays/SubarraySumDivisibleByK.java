
// Question Link - https://course.acciojob.com/idle?question=6b0355db-2e09-4afa-8be4-045d710113fb

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

    
    int arr[] = new int[n];
    
    for(int i =0 ; i < n ; i++){
      arr[i]= sc.nextInt();
    }

                
                int div = 0;
                
                for(int i =0; i<n ; i++){
                        int sum =0 ;
                        for(int j =i ;j<n;j++){
                        sum+=arr[j];

                                if(sum % k == 0){
                                        div++;
                                }

                                
                        }
                }

                System.out.println(div);
                
                
	}
}
