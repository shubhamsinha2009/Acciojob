
// Question Link -- https://course.acciojob.com/idle?question=ba98544a-dca6-4327-b152-f2844f08ffa5

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        switch(n){
            case 12: 
                System.out.println("I am even");
                break;
                
            case 13:
                System.out.println("I am prime");
                break;

            case 25:
                System.out.println("I am odd");
                break;

            default:
                System.out.println("I am just a number");
        }
	}
}
