

// Question Link: https://www.codechef.com/problems/MOBKUN

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    int daysInYear = sc.nextInt();
		    int daysInMob = sc.nextInt();
		    int yearsInMob = sc.nextInt();
		    int targetDays = sc.nextInt();
		    
		   int daysTillMObYear = daysInYear*yearsInMob+daysInMob;
		   
		   int daysBeforeMobYear = daysInYear*(yearsInMob-1);
		   
		   int remainderDays = targetDays%daysTillMObYear;
		   
		   if(remainderDays>daysBeforeMobYear || remainderDays ==0){
		       System.out.println("Yes");
		   }else{
		       System.out.println("No");
		   }
		   
		    
		    
		}
	}
}
