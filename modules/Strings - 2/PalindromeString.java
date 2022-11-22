
// Question Link --- https://course.acciojob.com/idle?question=ad163b7c-8fea-42d3-a8e9-39d4d6a06b18

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();


        int low = 0 ;
        int high = s.length()-1;
        

        while(low < high ){

            if(!Character.isLetterOrDigit(s.charAt(high))){
                high -- ;
                continue;
            }
              if(!Character.isLetterOrDigit(s.charAt(low))){
                low++ ;
                continue;
            }
            // System.out.println(s.charAt(low));
            // System.out.println(s.charAt(high));

            if(Character.toLowerCase(s.charAt(low)) != Character.toLowerCase(s.charAt(high))){
                        System.out.println("0");
                break;
 
            }
            low++;
            high--;

          
        }

          if(low>=high){
                System.out.println("1");
            }
        
	}
}
