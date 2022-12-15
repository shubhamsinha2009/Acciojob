
// Question Link -- https://course.acciojob.com/idle?question=01f1d8aa-d4e4-41b0-80b4-da573f709cd1

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
Scanner sc = new Scanner(System.in);
    int litre = sc.nextInt();
     int bill = 0;
    
    if(litre<= 100){
      bill = 15*litre;
       System.out.println(bill);
    } else if(litre>100 && litre<=200){
      bill =  (14*(litre-100)) + 1500 ;
         System.out.println(bill);
    } else{
      bill = (12*(litre-200)) + 1400 + 1500;
         System.out.println(bill);
      }
   
   
    
    
  
    
	}
}
