
// Question Link -- https://course.acciojob.com/idle?question=01483f88-fad6-4b9c-80bf-9ab9c772fa8a

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
                int marks =sc.nextInt();


                if(marks > 90 ){
                        System.out.println("Excellent");
                        
                } else if(marks > 80 ){
                        System.out.println("Good");
                }else if(marks > 70){
                    System.out.println("Fair");
                } else if(marks>60){
	                    System.out.println("Meets Expectations");
                }else{
	                    System.out.println("Below Expectations");
                }
	}
}
