
// Question Link - https://course.acciojob.com/idle?question=05b62dd6-1cd6-4e66-a1b3-95762b0f0b9a

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
                int  n = sc.nextInt();
                int  i =1;
                while (i <=n/2){
                 for(int j = 0 ; j<i;j++){
                         System.out.print("*");
                 }
                        System.out.println("");
                        i++;
                }
                while (i >=1){
                 for(int j = 0 ; j<i;j++){
                         System.out.print("*");
                 }
                        System.out.println("");
                        i--;
                }
	}
}
