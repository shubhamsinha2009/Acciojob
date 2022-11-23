

// Questions Link --- https://course.acciojob.com/idle?question=3eeffa45-0717-4677-8aaf-daa2ef879794

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int d = sc.nextInt();

        System.out.println(frequency(n,d));
        
	}

    public static int frequency(long n , int d){
        int num =0;
        while(n>0){

            if(d == n%10){
                num++;
                
            }

            n/=10;
        }
        return num;
    }
}
