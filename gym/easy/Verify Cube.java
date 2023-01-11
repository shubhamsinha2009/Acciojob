
// Question Link - https://course.acciojob.com/idle?question=00d3fed6-2099-4e58-8c0a-e5473c3d6e92

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
                Scanner sc = new Scanner(System.in);
                long n = sc.nextInt();
                long m = sc.nextInt();

                long lhs = (n+m)*(n+m)*(n+m);
                long rhs = (n*n*n) + (m*m*m) + 3*n*n*m  + 3*m*m*n;

                 System.out.println(lhs);
                System.out.println(rhs);

                if(lhs== rhs){
                        System.out.println("VERIFIED");
                       
                }else{
                         System.out.println("NOT VERIFIED");
                }
	}
}
