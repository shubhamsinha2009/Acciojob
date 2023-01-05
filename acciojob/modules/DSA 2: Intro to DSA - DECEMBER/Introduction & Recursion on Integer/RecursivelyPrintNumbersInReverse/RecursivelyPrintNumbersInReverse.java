import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
          
               print(n);
            
	}
        public static void print (int n )
	{
                
                        System.out.print(n);
                        System.out.print(" ");
                
                if(n ==1 )
                        return ;
                
                print(n-1);
               
	}
}
