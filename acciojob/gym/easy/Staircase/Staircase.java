package Staircase;

// Question Link --- https://course.acciojob.com/idle?question=01ca617e-abde-48f6-8790-13bccadad8f1

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for(int i= 1; i<= n ; i++){

      for(int j=1;j<=n-i;j++){
        System.out.print(" ");
        
      }
      for(int j=1;j<=i;j++){
        System.out.print("#");
      }
      System.out.println("");
    }
	}
}
