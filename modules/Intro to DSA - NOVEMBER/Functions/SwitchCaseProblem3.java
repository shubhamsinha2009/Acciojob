
// Question Link -- https://course.acciojob.com/idle?question=e046fc02-30d7-4f21-b46d-f48318383943

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch(a%b){
            case 0: 
                System.out.println("Remainder is too small");
                break;
                
            case 1:
                System.out.println("Remainder is small");
                break;

            case 2:
                System.out.println("Remainder is large");
                break;

            default:
                System.out.println("Remainder is too large");
        }
	}
}
