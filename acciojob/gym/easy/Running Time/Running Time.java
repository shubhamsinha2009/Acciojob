
// Question Link - https://course.acciojob.com/idle?question=023eeb5a-1016-4aba-a007-fbfc577f00a3

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a[] = new int[n];

        for(int i =0 ; i<n ;i++){
            a[i] = sc.nextInt();
        }

        int numberOfShifts = 0;
        for(int i =1 ; i<n ;i++){
            int temp = a[i];
            int j = i - 1;

            while(j>=0 && temp < a[j]){
                a[j+1] = a[j];
                numberOfShifts++;
                j--;
            }
            a[j+1] = temp;
        }

        System.out.println(numberOfShifts);
	}
}
