
// Question link: https://course.acciojob.com/idle?question=0ca3a15a-7003-4c33-850f-7e1e65798015



import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int mat[][] = new int[n][n];
    int blackSum =0;
    int whiteSum = 0;
    for(int i =0; i<n; i++){
      for(int j =0; j<n; j++ ){
        mat[i][j] = sc.nextInt();
      }
    }
    
    for(int i =0; i<n; i++){
     for(int j =0; j<n; j++ ){
     
      if ((i+j)%2==0){
        blackSum += mat[i][j];
      }else{
               whiteSum += mat[i][j] ;
      }
     }
    }
    System.out.println(blackSum);
                 System.out.println(whiteSum);
	}
}
