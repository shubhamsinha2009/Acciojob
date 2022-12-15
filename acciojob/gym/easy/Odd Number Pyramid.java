
// Question Link - https://course.acciojob.com/idle?question=01f5cb94-1ae6-44dc-a1ca-57edb8bcb0bf

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner  sc = new Scanner(System.in);
                int n = sc.nextInt();

                for(int i =1 ; i<=2*n;i=i+2){
                        for(int j =1 ; j <= n-(i/2)-1; j++){
                                System.out.print(" ");
                        }
                        for(int j =1 ; j <= i; j++){
                                System.out.print(i);
                        }
                        System.out.println();
                }
	}
}
