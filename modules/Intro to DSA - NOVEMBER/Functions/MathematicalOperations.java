
// Questions Link -- https://course.acciojob.com/idle?question=869273ac-d202-4aaf-b245-92d2b14f1a9e

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();

            System.out.println(sum(n,m));

         System.out.println(difference(n,m));

         System.out.println(product(n,m));

         System.out.println(quotient(n,m));

         System.out.println(remainder(n,m));
        
	}

    public static int sum(int a , int b){
        return a+b;
    }

    public static int difference(int a, int b){
        return a-b;
    }

    public static int product(int a , int b){
        return a*b;
    }

    public static int quotient(int a, int b ){
        return a/b;
    }

    public static int remainder(int a , int b){
        return a%b;
    }
}
