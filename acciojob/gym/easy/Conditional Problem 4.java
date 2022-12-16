
// Question Link -- https://course.acciojob.com/idle?question=034d79f6-a182-4412-b990-6ca16e0248c7

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
                Scanner sc = new Scanner(System.in);
                char letter = sc.next().charAt(0);

                switch(letter){
                        case 'A':  
                                System.out.println("I am the first letter");
                                break;
                        case 'B':          
                                System.out.println("I am the second letter");
                                break;
                         case 'C':          
                                System.out.println("I am the third letter");
                                break;
                         case 'D':          
                                System.out.println("I am the fourth letter");
                                break;
                         case 'E':          
                                System.out.println("I am the fifth letter");
                                break;
                        default : 
                                  System.out.println("I don't belong here");
                }
		
	}
}
